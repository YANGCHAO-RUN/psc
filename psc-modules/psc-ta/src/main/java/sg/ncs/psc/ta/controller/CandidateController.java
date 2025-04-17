package sg.ncs.psc.ta.controller;

import cn.dev33.satoken.annotation.SaIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.common.mybatis.core.page.PageQuery;
import sg.ncs.psc.common.mybatis.core.page.TableDataInfo;
import sg.ncs.psc.ta.domain.bo.TaCandidateBo;
import sg.ncs.psc.ta.domain.vo.TaCandidateVo;
import sg.ncs.psc.ta.service.CandidateService;

import java.util.List;

@RestController
@RequestMapping("/candidate")
@RequiredArgsConstructor
@SaIgnore
public class CandidateController {

    private final CandidateService candidateService;

    @PostMapping("batch-import-cv")
    public R<Void> batchImportCv(@RequestParam("files") List<MultipartFile> files) {
        candidateService.batchImportCv(files);
        return R.ok();
    }

    @GetMapping("/list")
    public TableDataInfo<TaCandidateVo> list(TaCandidateBo candidateBo, PageQuery pageQuery) {
        return candidateService.selectPageCandidateList(candidateBo, pageQuery);
    }

    @GetMapping("/translate")
    public R<Void> translate(@RequestParam("files") List<MultipartFile> files) {
        candidateService.translate(files);
        return R.ok();
    }

    @PostMapping("/convert-cv")
    public R<Void> convertCv(@RequestParam("files") List<MultipartFile> files) {
        candidateService.convertCv(files);
        return R.ok();
    }

    @PutMapping("/changeStatus")
    public R<Void> changeStatus(@Validated @RequestParam Long candidateId, @NotBlank @RequestParam String status) {
        int row = candidateService.changeStatus(candidateId, status);
        return row > 0 ? R.ok() : R.fail();
    }

}

