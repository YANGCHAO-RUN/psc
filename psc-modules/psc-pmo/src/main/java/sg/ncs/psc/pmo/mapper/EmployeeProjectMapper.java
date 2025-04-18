package sg.ncs.psc.pmo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sg.ncs.psc.pmo.domain.EmployeeProject;
import sg.ncs.psc.pmo.domain.vo.EmployeeProjectVo;
import sg.ncs.psc.common.core.web.mapper.BaseMapperPlus;

import java.util.List;

/**
 * @author ncs
 */
@Mapper
public interface EmployeeProjectMapper extends BaseMapperPlus<EmployeeProject, EmployeeProjectVo> {
    List<EmployeeProjectVo> selectByEmployeeId(@Param("employeeId") Long employeeId);
}