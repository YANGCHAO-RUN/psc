package sg.ncs.psc.pmo.mapper;

import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeMoreInfo;
import sg.ncs.psc.pmo.domain.vo.EmployeeMoreInfoVo;

import java.util.List;

/**
 * @author ncs
 */
@Mapper
public interface EmployeeMoreInfoMapper extends BaseMapperPlus<EmployeeMoreInfo, EmployeeMoreInfoVo> {

    EmployeeMoreInfoVo selectVoById(Long id);

    List<EmployeeMoreInfoVo> selectVoList(Object o);
}