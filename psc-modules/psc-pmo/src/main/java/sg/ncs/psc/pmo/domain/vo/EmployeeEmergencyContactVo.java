package sg.ncs.psc.pmo.domain.vo;

import lombok.Data;
import sg.ncs.psc.common.mybatis.core.domain.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeEmergencyContact;

/**
 * @author ncs
 */
@Data
@AutoMapper(target = EmployeeEmergencyContact.class)
public class EmployeeEmergencyContactVo {
    private Long id;
    private Long employeeId;
    private String name;
    private String relation;
    private String phone;
    private String email;
    private String isPrimary;
}