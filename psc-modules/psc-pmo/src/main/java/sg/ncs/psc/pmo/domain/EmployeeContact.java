package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 员工联系信息
 *
 * @author psc
 */
@Data
@NoArgsConstructor
@TableName("employee_contact")
@AllArgsConstructor
public class EmployeeContact implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableId
    private Long id;

    /**
     * 工作邮箱
     */
    private String businessEmail;

    /**
     * 地址
     */
    private String address;

    /**
     * 个人邮箱
     */
    private String personEmail;


    /**
     * 电话
     */
    private String phone;

    /**
     * 紧急联系人
     */
    private String emergencyContact;
}