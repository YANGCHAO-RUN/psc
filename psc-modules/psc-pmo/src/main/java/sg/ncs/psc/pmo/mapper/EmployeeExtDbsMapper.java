package sg.ncs.psc.pmo.mapper;

import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeExtDbs;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtDbsVo;

import java.util.List;

@Mapper
public interface EmployeeExtDbsMapper extends BaseMapperPlus<EmployeeExtDbs, EmployeeExtDbsVo> {

    EmployeeExtDbsVo selectVoById(Long id);

    List<EmployeeExtDbsVo> selectVoList(Object o);
}