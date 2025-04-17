package sg.ncs.psc.pmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.pmo.domain.Employee;

import java.util.List;

@RestController
@RequestMapping("/pmo")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/list")
    public  R<List<Employee>> getEmployeeList() {
        return  R.ok(employeeService.getEmployeeList());
    }

    @PostMapping("/employee/add")
    public  R<Integer> addEmployee(@RequestBody Employee employee) {
        return  R.ok(employeeService.addEmployee(employee));
    }

    @PutMapping("/employee/change-status/{id}")
    public  R<Integer> changeEmployeeStatus(@PathVariable Long id, @RequestParam String status) {
        return  R.ok(employeeService.changeEmployeeStatus(id, status));
    }

    @GetMapping("/employee/detail/{id}")
    public  R<Employee> getEmployeeDetail(@PathVariable Long id) {
        return  R.ok(employeeService.getEmployeeDetail(id));
    }

    @PostMapping("/employee/batch-import-pmo")
    public  R<Integer> batchImportPmo(@RequestParam("file") MultipartFile file) {
        return  R.ok(employeeService.batchImportPmo(file));
    }

    @PostMapping("/employee/batch-import-ant")
    public  R<Integer> batchImportAnt(@RequestParam("file") MultipartFile file) {
        return  R.ok(employeeService.batchImportAnt(file));
    }

    @PostMapping("/employee/batch-import-hrc")
    public  R<Integer> batchImportHrc(@RequestParam("file") MultipartFile file) {
        return  R.ok(employeeService.batchImportHrc(file));
    }

    @PostMapping("/employee/batch-import-dbs")
    public  R<Integer> batchImportDbs(@RequestParam("file") MultipartFile file) {
        return  R.ok(employeeService.batchImportDbs(file));
    }
}
