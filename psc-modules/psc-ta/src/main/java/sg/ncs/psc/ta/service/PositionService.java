package sg.ncs.psc.ta.service;

import sg.ncs.psc.common.mybatis.core.page.PageQuery;
import sg.ncs.psc.common.mybatis.core.page.TableDataInfo;
import sg.ncs.psc.ta.domain.bo.TaPositionBo;
import sg.ncs.psc.ta.domain.vo.TaPostionVo;

public interface PositionService {

    TableDataInfo<TaPostionVo> selectPagePositionList(TaPositionBo bo, PageQuery pageQuery);

    TaPostionVo detail(Long positionId);

    int add(TaPositionBo bo);

    int edit(TaPositionBo bo);

    int close(Long positionId);

    String aiCriteria(String content);



}
