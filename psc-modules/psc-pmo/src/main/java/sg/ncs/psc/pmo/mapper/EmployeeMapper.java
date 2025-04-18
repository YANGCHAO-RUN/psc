package sg.ncs.psc.pmo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.Employee;
import sg.ncs.psc.pmo.domain.vo.EmployeeVo;

/**
 * Employee Mapper 接口
 *
 */
@Mapper
public interface EmployeeMapper extends BaseMapperPlus<Employee, EmployeeVo> {

}