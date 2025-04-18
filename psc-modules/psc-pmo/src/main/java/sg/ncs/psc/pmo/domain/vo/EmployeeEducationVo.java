package sg.ncs.psc.pmo.domain.vo;

import lombok.Data;
import org.mapstruct.Mapper;
import io.github.linpeilie.annotations.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeEducation;

import java.time.LocalDate;

/**
 * @author ncs
 */
@Data
@AutoMapper(target = EmployeeEducation.class)
public class EmployeeEducationVo {
    private Long employeeId;
    private String degree;
    private String university;
    private String major;
    private Date startDate;
    private Date graduationDate;
    private String educationalForm;
    private String firstDegree;
    private String firstDegreeUniversity;
    private String firstDegreeMajor;
    private Date firstDegreeGraduationDate;
}