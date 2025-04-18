package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author system
 */
@Data
@TableName("employee_job")
public class EmployeeJob {
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
    private BigDecimal standardWeeklyHours;
    private Integer workingDaysPerWeek;
    private BigDecimal fte;
}