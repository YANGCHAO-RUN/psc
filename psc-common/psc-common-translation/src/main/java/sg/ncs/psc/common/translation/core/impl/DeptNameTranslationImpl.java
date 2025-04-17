package sg.ncs.psc.common.translation.core.impl;

import sg.ncs.psc.common.core.service.DeptService;
import sg.ncs.psc.common.translation.annotation.TranslationType;
import sg.ncs.psc.common.translation.constant.TransConstant;
import sg.ncs.psc.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * 部门翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.DEPT_ID_TO_NAME)
public class DeptNameTranslationImpl implements TranslationInterface<String> {

    private final DeptService deptService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String ids) {
            return deptService.selectDeptNameByIds(ids);
        } else if (key instanceof Long id) {
            return deptService.selectDeptNameByIds(id.toString());
        }
        return null;
    }
}
