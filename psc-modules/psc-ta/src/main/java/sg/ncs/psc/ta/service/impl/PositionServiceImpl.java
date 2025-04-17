package sg.ncs.psc.ta.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sg.ncs.psc.common.core.utils.MapstructUtils;
import sg.ncs.psc.common.mybatis.core.page.PageQuery;
import sg.ncs.psc.common.mybatis.core.page.TableDataInfo;
import sg.ncs.psc.ta.domain.TaPosition;
import sg.ncs.psc.ta.domain.bo.TaPositionBo;
import sg.ncs.psc.ta.domain.vo.TaPostionVo;
import sg.ncs.psc.ta.mapper.TaPositionMapper;
import sg.ncs.psc.ta.service.PositionService;

@Service
@Slf4j
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final TaPositionMapper taPositionMapper;

    @Override
    public TableDataInfo<TaPostionVo> selectPagePositionList(TaPositionBo bo, PageQuery pageQuery) {
        String searchValue = null;
        String status = null;
        if (bo != null) {
            searchValue = bo.getSearchValue();
            status = bo.getStatus();
        }
        LambdaQueryWrapper<TaPosition> lqw = Wrappers.lambdaQuery();
        if (StrUtil.isNotBlank(searchValue)) {
            lqw.like(TaPosition::getJobTitle, searchValue)
                .or()
                .like(TaPosition::getDemandSource, searchValue)
                .or()
                .like(TaPosition::getLocation, searchValue)
                .or()
                .like(TaPosition::getJobType, searchValue)
                .or()
                .like(TaPosition::getLevel, searchValue)
                .or()
                .like(TaPosition::getKeySkills, searchValue)
                .or()
                .like(TaPosition::getTaOwner, searchValue)
                .or()
                .like(TaPosition::getOfferApprover, searchValue);
        }
        lqw.eq(StrUtil.isNotBlank(status), TaPosition::getStatus, status);
        lqw.orderByDesc(TaPosition::getCreateTime);
        IPage<TaPostionVo> page = taPositionMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(page);
    }

    @Override
    public TaPostionVo detail(Long positionId) {
        return taPositionMapper.selectVoById(positionId);
    }

    @Override
    public int add(TaPositionBo bo) {
        // todo 相关验证等需求确认后后再做
        TaPosition job = MapstructUtils.convert(bo, TaPosition.class);
        return taPositionMapper.insert(job);
    }

    @Override
    public int edit(TaPositionBo bo) {
        // todo 相关验证等需求确认后后再做
        TaPosition job = MapstructUtils.convert(bo, TaPosition.class);
        return taPositionMapper.updateById(job);
    }

    @Override
    public int close(Long positionId) {
        if (positionId == null) {
            return 0;
        }
        return taPositionMapper.update(Wrappers.<TaPosition>lambdaUpdate().set(TaPosition::getStatus, "1").eq(TaPosition::getPositionId, positionId));
    }

    @Override
    public String aiCriteria(String content) {
        // todo 等ai接口出来后再开始
        return "";
    }
}
