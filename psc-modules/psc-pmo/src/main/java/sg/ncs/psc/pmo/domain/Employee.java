package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("employees")
public class Employee {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String employeeNumber;
    private Integer type;
    private String name;
    private String chineseName;
    private String englishName;
    private String firstName;
    private String lastName;
    private String gender;
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