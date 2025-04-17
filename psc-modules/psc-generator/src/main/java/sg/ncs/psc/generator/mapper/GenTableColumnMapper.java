package sg.ncs.psc.generator.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.generator.domain.GenTableColumn;

/**
 * 业务字段 数据层
 *
 * @author Lion Li
 */
@InterceptorIgnore(dataPermission = "true", tenantLine = "true")
public interface GenTableColumnMapper extends BaseMapperPlus<GenTableColumn, GenTableColumn> {

}
