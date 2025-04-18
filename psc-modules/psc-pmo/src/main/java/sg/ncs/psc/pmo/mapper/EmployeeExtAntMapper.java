package sg.ncs.psc.pmo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.pmo.domain.EmployeeExtAnt;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtAntVo;

/**
 * @author ncs
 */
@Mapper
public interface EmployeeExtAntMapper extends BaseMapperPlus<EmployeeExtAnt, EmployeeExtAntVo> {
}