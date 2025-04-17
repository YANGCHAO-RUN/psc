package sg.ncs.psc.system.controller.system;

import lombok.RequiredArgsConstructor;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.common.satoken.utils.LoginHelper;
import sg.ncs.psc.common.web.core.BaseController;
import sg.ncs.psc.system.domain.vo.SysSocialVo;
import sg.ncs.psc.system.service.ISysSocialService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 社会化关系
 *
 * @author thiszhc
 * @date 2023-06-16
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/system/social")
public class SysSocialController extends BaseController {

    private final ISysSocialService socialUserService;

    /**
     * 查询社会化关系列表
     */
    @GetMapping("/list")
    public R<List<SysSocialVo>> list() {
        return R.ok(socialUserService.queryListByUserId(LoginHelper.getUserId()));
    }

}
