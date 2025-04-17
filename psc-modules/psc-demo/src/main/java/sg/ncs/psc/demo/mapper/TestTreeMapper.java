package sg.ncs.psc.demo.mapper;

import sg.ncs.psc.common.mybatis.annotation.DataColumn;
import sg.ncs.psc.common.mybatis.annotation.DataPermission;
import sg.ncs.psc.common.mybatis.core.mapper.BaseMapperPlus;
import sg.ncs.psc.demo.domain.TestTree;
import sg.ncs.psc.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTree, TestTreeVo> {

}
