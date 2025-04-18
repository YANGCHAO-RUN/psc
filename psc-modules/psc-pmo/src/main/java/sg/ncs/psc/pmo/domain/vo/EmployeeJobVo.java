package sg.ncs.psc.pmo.domain.vo;

import lombok.Data;
import sg.ncs.psc.common.mybatis.core.domain.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeJob;

import java.time.LocalDate;

@Data
@AutoMapper(target = EmployeeJob.class)
public class EmployeeJobVo {
    private Long employeeId;
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
    private Double standardWeeklyHours;
    private Integer workingDaysPerWeek;
    private Double fte;
}