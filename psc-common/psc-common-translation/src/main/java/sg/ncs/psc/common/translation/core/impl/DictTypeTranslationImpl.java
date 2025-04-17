package sg.ncs.psc.common.translation.core.impl;

import sg.ncs.psc.common.core.service.DictService;
import sg.ncs.psc.common.core.utils.StringUtils;
import sg.ncs.psc.common.translation.annotation.TranslationType;
import sg.ncs.psc.common.translation.constant.TransConstant;
import sg.ncs.psc.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * 字典翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.DICT_TYPE_TO_LABEL)
public class DictTypeTranslationImpl implements TranslationInterface<String> {

    private final DictService dictService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String dictValue && StringUtils.isNotBlank(other)) {
            return dictService.getDictLabel(other, dictValue);
        }
        return null;
    }
}
