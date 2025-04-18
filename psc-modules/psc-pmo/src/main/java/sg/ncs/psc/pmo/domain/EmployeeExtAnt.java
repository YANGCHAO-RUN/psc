package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 员工扩展 ANT 对象 employee_ext_ant
 *
 * @author ncs
 */
@Data
@EqualsAndHashCode
@TableName("employee_ext_ant")
public class EmployeeExtAnt implements Serializable {

    /**
     * 员工ID
     */
    @TableId
    private Long employeeId;

    /**
     * ANT 员工ID
     */
    private String antEmployeeId;

    /**
     * 导师
     */
    private String mentor;

    /**
     * 资深员工
     */
    private String senior;

    /**
     * L1 通过日期
     */
    private LocalDate l1PassDate;

    /**
     * 当前项目
     */
    private String currentProject;

    /**
     * 当前领域
     */
    private String currentDomain;

    /**
     * 历史领域
     */
    private String historicalDomain;

    /**
     * 城市
     */
    private String city;

    /**
     * 外包职位
     */
    private String outsourcedPosition;

    /**
     * 外包职责
     */
    private String outsourcedDuties;

    /**
     * 岗位角色
     */
    private String jobRole;

    /**
     * 岗位职级
     */
    private String jobGrade;

    /**
     * 合同形式
     */
    private String contractForm;

    /**
     * ANT邮箱
     */
    private String antEmail;

    /**
     * 备注
     */
    private String remarks;
}