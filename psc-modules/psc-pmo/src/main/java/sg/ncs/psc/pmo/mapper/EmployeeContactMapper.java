package sg.ncs.psc.pmo.mapper;

import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeContact;
import sg.ncs.psc.pmo.domain.vo.EmployeeContactVo;

/**
 * Employee Contact Mapper
 *
 * @author system
 */
@Mapper
public interface EmployeeContactMapper extends BaseMapperPlus<EmployeeContact, EmployeeContactVo> {

}