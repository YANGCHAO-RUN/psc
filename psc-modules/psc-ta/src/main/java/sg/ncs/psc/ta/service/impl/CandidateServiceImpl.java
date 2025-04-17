package sg.ncs.psc.ta.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dromara.x.file.storage.core.FileInfo;
import org.dromara.x.file.storage.core.FileStorageService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.core.exception.ServiceException;
import sg.ncs.psc.common.mybatis.core.page.PageQuery;
import sg.ncs.psc.common.mybatis.core.page.TableDataInfo;
import sg.ncs.psc.ta.domain.TaCandidate;
import sg.ncs.psc.ta.domain.bo.TaCandidateBo;
import sg.ncs.psc.ta.domain.vo.TaCandidateVo;
import sg.ncs.psc.ta.mapper.TaCandidateMapper;
import sg.ncs.psc.ta.service.CandidateService;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CandidateServiceImpl implements CandidateService {

    private final TaCandidateMapper taCandidateMapper;

    private final FileStorageService fileStorageService;

    @Override
    public void batchImportCv(List<MultipartFile> files) {
        // todo 下面为测试代码
        if(CollUtil.isNotEmpty(files)){
            files.forEach(file -> {
                FileInfo upload = fileStorageService.of(file).upload();
                log.info("update file, info is {}", upload);
            });
        }
    }

    @Override
    public TableDataInfo<TaCandidateVo> selectPageCandidateList(TaCandidateBo candidateBo, PageQuery pageQuery) {
        String searchValue = null;
        if (candidateBo != null) {
            searchValue = candidateBo.getSearchValue();
        }
        LambdaQueryWrapper<TaCandidate> lqw = Wrappers.lambdaQuery();
        if (StrUtil.isNotBlank(searchValue)) {
            lqw.like(TaCandidate::getName, searchValue)
                .or()
                .like(TaCandidate::getEducation, searchValue)
                .or()
                .like(TaCandidate::getGraduatedFrom, searchValue)
                .or()
                .like(TaCandidate::getWorkExperience, searchValue)
                .or()
                .like(TaCandidate::getStatus, searchValue);
        }
        lqw.orderByDesc(TaCandidate::getCreateTime);
        IPage<TaCandidateVo> page = taCandidateMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(page);
    }

    @Override
    public void translate(List<MultipartFile> files) {

    }

    @Override
    public void convertCv(List<MultipartFile> files) {

    }

    @Override
    public int changeStatus(Long candidateId, String status) {
        if (candidateId == null || StrUtil.isBlank(status)) {
            throw new ServiceException("非法参数");
        }

        return taCandidateMapper.update(Wrappers.<TaCandidate>lambdaUpdate()
            .set(TaCandidate::getStatus, status)
            .eq(TaCandidate::getCandidateId, candidateId));

    }
}
