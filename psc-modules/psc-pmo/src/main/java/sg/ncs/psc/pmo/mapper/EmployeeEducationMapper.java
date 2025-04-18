package sg.ncs.psc.pmo.mapper;

import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeEducation;
import sg.ncs.psc.pmo.domain.vo.EmployeeEducationVo;

/**
 * Employee Education Mapper
 *
 * @author ncs
 */
@Mapper
public interface EmployeeEducationMapper extends BaseMapperPlus<EmployeeEducation, EmployeeEducationVo> {

}