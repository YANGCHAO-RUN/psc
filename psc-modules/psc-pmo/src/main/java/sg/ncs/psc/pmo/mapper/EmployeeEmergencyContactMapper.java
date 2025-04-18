package sg.ncs.psc.pmo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeEmergencyContact;
import sg.ncs.psc.pmo.domain.vo.EmployeeEmergencyContactVo;

import java.util.List;

/**
 * @author ncs
 */
@Mapper
public interface EmployeeEmergencyContactMapper extends BaseMapperPlus<EmployeeEmergencyContact, EmployeeEmergencyContactVo> {

    List<EmployeeEmergencyContactVo> selectByEmployeeId(Long employeeId);

}