package sg.ncs.psc.ta.service;

import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.mybatis.core.page.PageQuery;
import sg.ncs.psc.common.mybatis.core.page.TableDataInfo;
import sg.ncs.psc.ta.domain.bo.TaCandidateBo;
import sg.ncs.psc.ta.domain.vo.TaCandidateVo;

import java.util.List;

public interface CandidateService {

    void batchImportCv(List<MultipartFile> files);

    TableDataInfo<TaCandidateVo> selectPageCandidateList(TaCandidateBo candidateBo, PageQuery pageQuery);

    void translate(List<MultipartFile> files);

    void convertCv(List<MultipartFile> files);

    int changeStatus(Long candidateId, String status);


}
