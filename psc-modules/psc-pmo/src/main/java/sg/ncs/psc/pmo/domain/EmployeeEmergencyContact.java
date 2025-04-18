package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ncs
 */
@Data
@TableName("employee_emergency_contact")
@Accessors(chain = true)
public class EmployeeEmergencyContact implements Serializable {

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * employee id
     */
    private Long employeeId;

    /**
     * name
     */
    private String name;

    /**
     * relation
     */
    private String relation;

    /**
     * phone
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * is primary
     */
    private String isPrimary;

}