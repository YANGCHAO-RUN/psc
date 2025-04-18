package sg.ncs.psc.pmo.domain.bo;

import lombok.Data;
import org.mapstruct.Mapper;
import sg.ncs.psc.common.mybatis.core.domain.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeEducation;

import java.time.LocalDate;

@Data
@AutoMapper(target = EmployeeEducation.class)
public class EmployeeEducationBo {

    private Long id;
    private String degree;
    private String university;
    private String major;
    private LocalDate startDate;
    private LocalDate graduationDate;
    private String educationalForm;
    private String firstDegree;
    private String firstDegreeUniversity;
    private String firstDegreeMajor;
    private Date firstDegreeGraduationDate;
}