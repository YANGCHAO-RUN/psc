package sg.ncs.psc.workflow.service.impl;

import cn.hutool.core.convert.Convert;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import sg.ncs.psc.common.translation.annotation.TranslationType;
import sg.ncs.psc.common.translation.core.TranslationInterface;
import sg.ncs.psc.workflow.common.ConditionalOnEnable;
import sg.ncs.psc.workflow.common.constant.FlowConstant;
import sg.ncs.psc.workflow.service.IFlwCategoryService;
import org.springframework.stereotype.Service;

/**
 * 流程分类名称翻译实现
 *
 * @author AprilWind
 */
@ConditionalOnEnable
@Slf4j
@RequiredArgsConstructor
@Service
@TranslationType(type = FlowConstant.CATEGORY_ID_TO_NAME)
public class CategoryNameTranslationImpl implements TranslationInterface<String> {

    private final IFlwCategoryService flwCategoryService;

    @Override
    public String translation(Object key, String other) {
        Long id = null;
        if (key instanceof String categoryId) {
            id = Convert.toLong(categoryId);
        } else if (key instanceof Long categoryId) {
            id = categoryId;
        }
        return flwCategoryService.selectCategoryNameById(id);
    }
}
