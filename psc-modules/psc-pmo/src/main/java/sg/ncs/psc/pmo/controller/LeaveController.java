package sg.ncs.psc.pmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.pmo.domain.Leave;

import java.util.List;

@RestController
@RequestMapping("/api/pmo")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping("/leave/batch-import-ant")
    public  R<Integer> batchImportAnt(@RequestParam("file") MultipartFile file) {
        return  R.ok(leaveService.batchImportAnt(file));
    }

    @PostMapping("/leave/batch-import-hrc")
    public  R<Integer> batchImportHrc(@RequestParam("file") MultipartFile file) {
        return  R.ok(leaveService.batchImportHrc(file));
    }

    @PostMapping("/leave/batch-import-dbs")
    public  R<Integer> batchImportDbs(@RequestParam("file") MultipartFile file) {
        return  R.ok(leaveService.batchImportDbs(file));
    }

    @PostMapping("/leave/import-calendar")
    public  R<Integer> importCalendar(@RequestParam("file") MultipartFile file) {
        return  R.ok(leaveService.importCalendar(file));
    }

    @PostMapping("/leave/grant-job")
    public  R<Integer> grantLeaveJob() {
        return  R.ok(leaveService.grantLeaveJob());
    }

    @GetMapping("/leave/list")
    public  R<List<Leave>> getLeaveList() {
        return  R.ok(leaveService.getLeaveList());
    }
}
