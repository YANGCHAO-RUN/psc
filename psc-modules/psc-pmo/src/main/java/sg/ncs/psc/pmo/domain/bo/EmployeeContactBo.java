package sg.ncs.psc.pmo.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.pmo.domain.EmployeeContact;

/**
 * EmployeeContactBo
 */
@Data
@AutoMapper(target = EmployeeContact.class)
public class EmployeeContactBo {

    private Long id;

    private String businessEmail;
    private String address;
    private String personEmail;
    private String phone;
    private String emergencyContact;
}