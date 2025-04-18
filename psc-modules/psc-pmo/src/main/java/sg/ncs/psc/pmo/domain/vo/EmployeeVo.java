package sg.ncs.psc.pmo.domain.vo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.pmo.domain.Employee;

import java.time.LocalDate;

/**
 * EmployeeVo
 *
 * @author system
 */
@Data
@AutoMapper(target = Employee.class)
public class EmployeeVo {

    private Long id;
    private String employeeNumber;
    private Integer type;
    private String name;
    private String chineseName;
    private String englishName;
    private String firstName;
    private String lastName;
    private Integer gender;
    private LocalDate dateOfBirth;
    private String nationality;
    private String secondNationality;
    private String ethnicity;
    private String maritalStatus;
    private LocalDate maritalStatusEffectiveDate;
    private Boolean hasChildren;
    private String identityNumber;
    private LocalDate identityCardExpiry;
    private String passportNumber;
    private LocalDate hireDate;
    private LocalDate originalHireDate;
    private LocalDate seniorityStartDate;
    private LocalDate probationEndDate;
    private LocalDate resignationDate;
    private String status;
    private String englishLevel;

}