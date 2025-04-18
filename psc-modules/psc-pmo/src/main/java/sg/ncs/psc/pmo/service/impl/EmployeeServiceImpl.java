package sg.ncs.psc.pmo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.ncs.psc.pmo.domain.Employee;
import sg.ncs.psc.pmo.domain.EmployeeContact;
import sg.ncs.psc.pmo.domain.EmployeeEducation;
import sg.ncs.psc.pmo.domain.EmployeeEmergencyContact;
import sg.ncs.psc.pmo.domain.EmployeeExtAnt;
import sg.ncs.psc.pmo.domain.EmployeeExtDbs;
import sg.ncs.psc.pmo.domain.EmployeeJob;
import sg.ncs.psc.pmo.domain.EmployeeMoreInfo;
import sg.ncs.psc.pmo.domain.bo.EmployeeBo;
import sg.ncs.psc.pmo.domain.bo.EmployeeExtDbsBo;
import sg.ncs.psc.pmo.domain.bo.EmployeeJobBo;
import sg.ncs.psc.pmo.domain.EmployeeProject;
import sg.ncs.psc.pmo.domain.vo.EmployeeEducationVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeEmergencyContactVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeProjectVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtDbsVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeExtAntVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeJobVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeMoreInfoVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeContactVo;
import sg.ncs.psc.pmo.domain.vo.EmployeeVo;
import sg.ncs.psc.pmo.mapper.EmployeeJobMapper;
import sg.ncs.psc.pmo.mapper.EmployeeExtAntMapper;
import sg.ncs.psc.pmo.mapper.EmployeeContactMapper;
import sg.ncs.psc.pmo.mapper.EmployeeEducationMapper;
import sg.ncs.psc.pmo.mapper.EmployeeEmergencyContactMapper;
import sg.ncs.psc.pmo.mapper.EmployeeMapper;
import sg.ncs.psc.pmo.mapper.EmployeeProjectMapper;
import sg.ncs.psc.pmo.mapper.EmployeeExtDbsMapper;
import sg.ncs.psc.pmo.mapper.EmployeeMoreInfoMapper;

import java.util.Collections;
import java.util.List;

/**
 * @author ncs
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {\
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeContactMapper employeeContactMapper;
    @Autowired
    private EmployeeEducationMapper employeeEducationMapper;
    @Autowired
    private EmployeeEmergencyContactMapper employeeEmergencyContactMapper;
    @Autowired
    private EmployeeExtAntMapper employeeExtAntMapper;
    @Autowired
    private EmployeeExtDbsMapper employeeExtDbsMapper;
    @Autowired
    private EmployeeJobMapper employeeJobMapper;
    @Autowired
    private EmployeeMoreInfoMapper employeeMoreInfoMapper;



    @Autowired
    private EmployeeProjectMapper employeeProjectMapper;

    @Override
    public EmployeeContactVo getEmployeeContact(Long employeeId) {
        return employeeContactMapper.selectVoById(employeeId);
    }

    @Override
    public void createEmployeeWithContact(EmployeeBo employeeBo) {
        Employee employee = employeeBo.to(Employee.class);
        employeeMapper.insert(employee);
        EmployeeContact employeeContact = employeeBo.to(EmployeeContact.class);
        employeeContact.setId(employee.getId());
        employeeContactMapper.insert(employeeContact);
    }

    @Override
    public void updateEmployeeWithContact(EmployeeBo employeeBo) {
        employeeMapper.updateById(employeeBo.to(Employee.class));
        employeeContactMapper.updateById(employeeBo.to(EmployeeContact.class));
    }

    @Override
    public EmployeeEducationVo getEmployeeEducation(Long employeeId) {
        return employeeEducationMapper.selectVoById(employeeId);
    }

    @Override
    public void createEmployeeWithEducation(EmployeeBo employeeBo) {
        employeeEducationMapper.insert(employeeBo.to(EmployeeEducation.class));
    }

    @Override
    public void updateEmployeeWithEducation(EmployeeBo employeeBo) {
        EmployeeEducation employeeEducation = employeeBo.to(EmployeeEducation.class);
        employeeEducationMapper.updateById(employeeEducation);
    }

    @Override
    public EmployeeExtDbsVo getEmployeeExtDbs(Long employeeId) {
        return employeeExtDbsMapper.selectVoById(employeeId);
    }

    @Override
    public void createEmployeeExtDbs(EmployeeExtDbsBo employeeExtDbsBo) {
        employeeExtDbsMapper.insert(employeeExtDbsBo.to(EmployeeExtDbs.class));
    }

    @Override
    public void updateEmployeeExtDbs(EmployeeExtDbsBo employeeExtDbsBo) {
        employeeExtDbsMapper.updateById(employeeExtDbsBo.to(EmployeeExtDbs.class));
    }

    @Override
    public EmployeeJobVo getEmployeeJob(Long employeeId) {
        return employeeJobMapper.selectVoById(employeeId);
    }

    @Override
    public void createEmployeeJob(EmployeeJobBo employeeJobBo) {
        employeeJobMapper.insert(employeeJobBo.to(EmployeeJob.class));
    }

    @Override
    public void updateEmployeeJob(EmployeeJobBo employeeJobBo) {
        employeeJobMapper.updateById(employeeJobBo.to(EmployeeJob.class));
    }


    @Override
    public void createEmployeeEmergencyContact(EmployeeBo employeeBo) {
        employeeEmergencyContactMapper.insert(employeeBo.to(EmployeeEmergencyContact.class));
    }

    @Override
    public void updateEmployeeEmergencyContact(EmployeeBo employeeBo) {
        employeeEmergencyContactMapper.updateById(employeeBo.to(EmployeeEmergencyContact.class));
    }

    @Override
    public void deleteEmployeeEmergencyContact(Long id) {
        employeeEmergencyContactMapper.deleteById(id);
    }

    @Override
    public EmployeeExtAntVo getEmployeeExtAnt(Long employeeId) {
        return employeeExtAntMapper.selectVoById(employeeId);
    }

    @Override
    public void createEmployeeExtAnt(EmployeeBo employeeBo) {
        employeeExtAntMapper.insert(employeeBo.to(EmployeeExtAnt.class));
    }

    @Override
    public void updateEmployeeExtAnt(EmployeeBo employeeBo) {
        employeeExtAntMapper.updateById(employeeBo.to(EmployeeExtAnt.class));
    }

    @Override
    public EmployeeMoreInfoVo getEmployeeMoreInfo(Long employeeId) {
        return employeeMoreInfoMapper.selectVoById(employeeId);
    }

    @Override
    public void createEmployeeMoreInfo(EmployeeBo employeeBo) {
        EmployeeMoreInfo employeeMoreInfo = employeeBo.to(EmployeeMoreInfo.class);
        if(employeeMoreInfo != null){
            employeeMoreInfoMapper.insert(employeeMoreInfo);
        }
    }

    @Override
    public void updateEmployeeMoreInfo(EmployeeBo employeeBo) {
        employeeMoreInfoMapper.updateById(employeeBo.to(EmployeeMoreInfo.class));
    }

    @Override
    public List<EmployeeProjectVo> getEmployeeProjectList(Long employeeId) {
        return employeeProjectMapper.selectByEmployeeId(employeeId);
    }

    @Override
    public void createEmployeeProject(EmployeeBo employeeBo) {
        employeeProjectMapper.insert(employeeBo.to(EmployeeProject.class));
    }

    @Override
    public void updateEmployeeProject(EmployeeBo employeeBo) {
        employeeProjectMapper.updateById(employeeBo.to(EmployeeProject.class));
    }

    @Override
    public void deleteEmployeeProject(Long id) {
        employeeProjectMapper.deleteById(id);
    }

    @Override
    public Page<EmployeeVo> selectEmployeePage(Page<Employee> page) {
        return employeeMapper.selectVoPage(page,null);
    }

}