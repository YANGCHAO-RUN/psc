package sg.ncs.psc.pmo.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.pmo.domain.EmployeeJob;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AutoMapper(target = EmployeeJob.class)
public class EmployeeJobBo {
    private Long id;
    private String employeeStatus;
    private String country;
    private String directManager;
    private String projectManager;
    private String jobTitle;
    private String techGroup;
    private LocalDate jobProfileStartDate;
    private String entryGrade;
    private String jobGrade;
    private String employeeSubgroup;
    private String chnEmployeeSubgroupCategory;
    private String workScheduleRule;
    private BigDecimal standardWeeklyHours;
    private Integer workingDaysPerWeek;
    private BigDecimal fte;
}