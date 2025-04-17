package sg.ncs.psc.common.translation.core.impl;

import sg.ncs.psc.common.core.service.OssService;
import sg.ncs.psc.common.translation.annotation.TranslationType;
import sg.ncs.psc.common.translation.constant.TransConstant;
import sg.ncs.psc.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * OSS翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.OSS_ID_TO_URL)
public class OssUrlTranslationImpl implements TranslationInterface<String> {

    private final OssService ossService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String ids) {
            return ossService.selectUrlByIds(ids);
        } else if (key instanceof Long id) {
            return ossService.selectUrlByIds(id.toString());
        }
        return null;
    }
}
