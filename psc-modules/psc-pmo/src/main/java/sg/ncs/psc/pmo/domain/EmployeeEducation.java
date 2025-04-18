package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 员工学历信息
 *
 * @author ncs
 */
@Data
@NoArgsConstructor
@TableName("employee_education")
public class EmployeeEducation implements Serializable {

    private static final long serialVersionUID = 1L;

 /**
     * 员工ID
     */
    @TableId
    private Long employeeId;

    /**
     * 学位
     */
    private String degree;

    /**
     * 大学
     */
    private String university;

    /**
     * 专业
     */
    private String major;

    /**
     * 开始日期
     */
    private LocalDate startDate;

    /**
     * 毕业日期
     */
    private LocalDate graduationDate;

    /**
     * 学历形式
     */
    private String educationalForm;

    /**
     * 第一学历
     */
    private String firstDegree;

    /**
     * 第一学历学校
     */
    private String firstDegreeUniversity;

    /**
     * 第一学历专业
     */
    private String firstDegreeMajor;

    /**
     * 第一学历毕业日期
     */
    private LocalDate firstDegreeGraduationDate;
}