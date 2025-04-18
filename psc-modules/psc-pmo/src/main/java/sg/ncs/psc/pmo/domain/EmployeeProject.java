package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author ncs
 */
@Data
@TableName("employee_project")
public class EmployeeProject {
    @TableId(value = "id")
    private Long id;
    private Long employeeId;
    private String projectName;
    private String projectPhase;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;
    private String role;
    private String location;
    private String remarks;
}