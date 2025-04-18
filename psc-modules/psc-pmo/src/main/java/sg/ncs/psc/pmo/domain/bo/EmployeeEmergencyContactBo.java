package sg.ncs.psc.pmo.domain.bo;

import lombok.Data;
import sg.ncs.psc.common.mybatis.core.domain.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeEmergencyContact;

import java.io.Serializable;

/**
 * @author ncs
 */
@Data
@AutoMapper(target = EmployeeEmergencyContact.class)
public class EmployeeEmergencyContactBo implements Serializable {
    private Long id;
    private Long employeeId;
    private String name;
    private String relation;
    private String phone;
    private String email;
    private String isPrimary;
}