package sg.ncs.psc.ta.controller;

import cn.dev33.satoken.annotation.SaIgnore;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.common.idempotent.annotation.RepeatSubmit;
import sg.ncs.psc.common.log.annotation.Log;
import sg.ncs.psc.common.log.enums.BusinessType;
import sg.ncs.psc.common.mybatis.core.page.PageQuery;
import sg.ncs.psc.common.mybatis.core.page.TableDataInfo;
import sg.ncs.psc.ta.domain.bo.TaPositionBo;
import sg.ncs.psc.ta.domain.vo.TaPostionVo;
import sg.ncs.psc.ta.service.PositionService;

@RestController
@RequestMapping("/position")
@RequiredArgsConstructor
@SaIgnore
public class PositionController {

    private final PositionService positionService;

    @GetMapping("/list")
    public TableDataInfo<TaPostionVo> list(TaPositionBo bo, PageQuery pageQuery) {
        return positionService.selectPagePositionList(bo, pageQuery);
    }

    @GetMapping("/{positionId}")
    public R<TaPostionVo> detail(@PathVariable Long positionId) {
        return R.ok(positionService.detail(positionId));
    }

    @PostMapping("/add")
    @RepeatSubmit
    @Log(title = "新增岗位", businessType = BusinessType.INSERT)
    public R<Void> add(@Validated @RequestBody TaPositionBo bo) {
        int row = positionService.add(bo);
        return row > 0 ? R.ok() : R.fail();
    }

    @PostMapping("/ai-criteria")
    public R<String> aiCriteria(@RequestParam String content) {
        // 传入json格式字符串，返回json格式字符串
        return R.ok(positionService.aiCriteria(content));
    }

    @PutMapping("/edit")
    @SaIgnore
    @RepeatSubmit
    @Log(title = "编辑岗位", businessType = BusinessType.UPDATE)
    public R<Void> edit(@Validated @RequestBody TaPositionBo bo) {
        int row = positionService.edit(bo);
        return row > 0 ? R.ok() : R.fail();
    }

    @PutMapping("/close")
    @SaIgnore
    @RepeatSubmit
    @Log(title = "关闭岗位", businessType = BusinessType.UPDATE)
    public R<Void> close(@Validated @RequestParam Long jobId) {
        int row = positionService.close(jobId);
        return row > 0 ? R.ok() : R.fail();
    }

}
