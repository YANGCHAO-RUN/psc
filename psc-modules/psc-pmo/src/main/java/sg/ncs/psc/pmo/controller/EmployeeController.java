package sg.ncs.psc.pmo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.pmo.domain.Employee;
import sg.ncs.psc.pmo.domain.bo.EmployeeBo;
import sg.ncs.psc.pmo.domain.vo.EmployeeContactVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeEducationVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtDbsVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeJobVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeMoreInfoVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeEmergencyContactVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtAntVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeProjectVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeVo;
import sg.ncs.psc.pmo.service.EmployeeService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeService employeeService;

	@GetMapping("/list")
	public R<Page<EmployeeVo>> list(Page<Employee> page) {
		return R.ok(employeeService.getEmployeePage(page));
	}

	@PostMapping()
	public R create(@RequestBody EmployeeBo employeeBo) {
		employeeService.createEmployeeWithContact(employeeBo);
		return R.ok();
	}

	@PostMapping("/update")
	public R update(@RequestBody EmployeeBo employeeBo) {
		employeeService.updateEmployeeWithContact(employeeBo);
		return R.ok();
	}

	@GetMapping("/contact/{employeeId}")
	public R<EmployeeContactVo> getEmployeeContact(@PathVariable Long employeeId) {
		return R.ok(employeeService.getEmployeeContact(employeeId));
	}

	@GetMapping("/education/{employeeId}")
	public R<EmployeeEducationVo> getEmployeeEducation(@PathVariable Long employeeId) {
		return R.ok(employeeService.getEmployeeEducation(employeeId));
	}

	@PostMapping("/education")
	public R createEmployeeWithEducation(@RequestBody EmployeeBo employeeBo){
		employeeService.createEmployeeWithEducation(employeeBo);
		return R.ok();
	}

	@PostMapping("/education/update")
	public R updateEmployeeWithEducation(@RequestBody EmployeeBo employeeBo){
		employeeService.updateEmployeeWithEducation(employeeBo);
		return R.ok();
	}

	@GetMapping("/emergency-contact/{employeeId}")
	public R<List<EmployeeEmergencyContactVo>> getEmployeeEmergencyContactList(@PathVariable Long employeeId){
		return R.ok(employeeService.getEmployeeEmergencyContactList(employeeId));
	}

	@PostMapping("/emergency-contact")
	public R createEmployeeEmergencyContact(@RequestBody EmployeeBo employeeBo){
		employeeService.createEmployeeEmergencyContact(employeeBo);
		return R.ok();
	}

	@PostMapping("/emergency-contact/update")
	public R updateEmployeeEmergencyContact(@RequestBody EmployeeBo employeeBo){
		employeeService.updateEmployeeEmergencyContact(employeeBo);
		return R.ok();
	}

	@DeleteMapping("/emergency-contact/{id}")
	public R deleteEmployeeEmergencyContact(@PathVariable Long id){
		employeeService.deleteEmployeeEmergencyContact(id);
		return R.ok();
	}

	@GetMapping("/ext-ant/{employeeId}")
	public R<EmployeeExtAntVo> getEmployeeExtAnt(@PathVariable Long employeeId) {
		return R.ok(employeeService.getEmployeeExtAnt(employeeId));
	}

	@PostMapping("/ext-ant")
	public R createEmployeeExtAnt(@RequestBody EmployeeBo employeeBo){
		employeeService.createEmployeeExtAnt(employeeBo);
		return R.ok();
	}

	@PostMapping("/ext-ant/update")
	public R updateEmployeeExtAnt(@RequestBody EmployeeBo employeeBo){
		employeeService.updateEmployeeExtAnt(employeeBo);
		return R.ok();
	}

	@GetMapping("/project/{employeeId}")
	public R<List<EmployeeProjectVo>> getEmployeeProjectList(@PathVariable Long employeeId){
		return R.ok(employeeService.getEmployeeProjectList(employeeId));
	}

	@PostMapping("/project")
	public R createEmployeeProject(@RequestBody EmployeeBo employeeBo){
		employeeService.createEmployeeProject(employeeBo);
		return R.ok();
	}

	@PostMapping("/project/update")
	public R updateEmployeeProject(@RequestBody EmployeeBo employeeBo){
		employeeService.updateEmployeeProject(employeeBo);
		return R.ok();
	}

	@DeleteMapping("/project/{id}")
	public R deleteEmployeeProject(@PathVariable Long id){
		employeeService.deleteEmployeeProject(id);
		return R.ok();
	}

	@GetMapping("/ext-dbs/{employeeId}")
	public R<EmployeeExtDbsVo> getEmployeeExtDbs(@PathVariable Long employeeId) {
		return R.ok(employeeService.getEmployeeExtDbs(employeeId));
	}

	@PostMapping("/ext-dbs")
	public R createEmployeeExtDbs(@RequestBody EmployeeExtDbsBo employeeExtDbsBo){
		employeeService.createEmployeeExtDbs(employeeExtDbsBo);
		return R.ok();
	}

	@PostMapping("/ext-dbs/update")
	public R updateEmployeeExtDbs(@RequestBody EmployeeExtDbsBo employeeExtDbsBo){
		employeeService.updateEmployeeExtDbs(employeeExtDbsBo);
		return R.ok();
	}

	@GetMapping("/job/{employeeId}")
	public R<EmployeeJobVo> getEmployeeJob(@PathVariable Long employeeId) {
		return R.ok(employeeService.getEmployeeJob(employeeId));
	}

	@PostMapping("/job")
	public R createEmployeeJob(@RequestBody EmployeeJobBo employeeJobBo){
		employeeService.createEmployeeJob(employeeJobBo);
		return R.ok();
	}

	@PostMapping("/job/update")
	public R updateEmployeeJob(@RequestBody EmployeeJobBo employeeJobBo){
		employeeService.updateEmployeeJob(employeeJobBo);
		return R.ok();
	}

	@GetMapping("/more-info/{employeeId}")
	public R<EmployeeMoreInfoVo> getEmployeeMoreInfo(@PathVariable Long employeeId) {
		return R.ok(employeeService.getEmployeeMoreInfo(employeeId));
	}

	@PostMapping("/more-info")
	public R createEmployeeMoreInfo(@RequestBody EmployeeMoreInfoBo employeeMoreInfoBo){
		employeeService.createEmployeeMoreInfo(employeeMoreInfoBo);
		return R.ok();
	}

	@PostMapping("/more-info/update")
	public R updateEmployeeMoreInfo(@RequestBody EmployeeMoreInfoBo employeeMoreInfoBo){
		employeeService.updateEmployeeMoreInfo(employeeMoreInfoBo);
		return R.ok();
	}
}
