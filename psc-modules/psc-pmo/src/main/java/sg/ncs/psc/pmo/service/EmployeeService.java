package sg.ncs.psc.pmo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import sg.ncs.psc.pmo.domain.bo.EmployeeBo;
import sg.ncs.psc.pmo.domain.Employee;
import sg.ncs.psc.pmo.domain.vo.EmployeeContactVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeEducationVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeEmergencyContactVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtAntVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeProjectVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtDbsVo;
import sg.ncs.psc.pmo.domain.bo.EmployeeExtDbsBo;
import sg.ncs.psc.pmo.domain.bo.EmployeeJobBo;
import java.util.List;

public interface EmployeeService {
    public List<EmployeeEmergencyContactVo> getEmployeeEmergencyContactList(Long employeeId);
    Page<EmployeeVo> selectEmployeePage(Page<Employee> page);
    public EmployeeContactVo getEmployeeContact(Long employeeId);
    public void createEmployeeWithContact(EmployeeBo employeeBo);
    public void updateEmployeeWithContact(EmployeeBo employeeBo);

    public EmployeeEducationVo getEmployeeEducation(Long employeeId);
    public void createEmployeeWithEducation(EmployeeBo employeeBo);
    public void updateEmployeeWithEducation(EmployeeBo employeeBo);

    public void createEmployeeEmergencyContact(EmployeeBo employeeBo);
    public void updateEmployeeEmergencyContact(EmployeeBo employeeBo);
    public void deleteEmployeeEmergencyContact(Long id);

    public EmployeeExtAntVo getEmployeeExtAnt(Long employeeId);
    public void createEmployeeExtAnt(EmployeeBo employeeBo);
    public void updateEmployeeExtAnt(EmployeeBo employeeBo);

    public List<EmployeeProjectVo> getEmployeeProjectList(Long employeeId);
    public void createEmployeeProject(EmployeeBo employeeBo);
    public void updateEmployeeProject(EmployeeBo employeeBo);
    public void deleteEmployeeProject(Long id);

    EmployeeExtDbsVo getEmployeeExtDbs(Long employeeId);

    void createEmployeeExtDbs(EmployeeExtDbsBo employeeExtDbsBo);

    void updateEmployeeExtDbs(EmployeeExtDbsBo employeeExtDbsBo);

    Object getEmployeeJob(Long employeeId);

    void createEmployeeJob(EmployeeJobBo employeeJobBo);

    void updateEmployeeJob(EmployeeJobBo employeeJobBo);

    Object getEmployeeMoreInfo(Long employeeId);

    void createEmployeeMoreInfo(Object employeeMoreInfoBo);

    void updateEmployeeMoreInfo(Object employeeMoreInfoBo);
}