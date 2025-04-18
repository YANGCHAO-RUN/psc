package sg.ncs.psc.pmo.mapper;

import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeJob;
import sg.ncs.psc.pmo.domain.vo.EmployeeJobVo;

@Mapper
public interface EmployeeJobMapper extends BaseMapperPlus<EmployeeJob, EmployeeJobVo> {
}