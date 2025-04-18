package sg.ncs.psc.pmo.domain.vo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.pmo.domain.EmployeeContact;
import java.util.List;

/**
 * Employee Contact Vo
 *
 * @author system
 */
@Data
@AutoMapper(target = EmployeeContact.class)
public class EmployeeContactVo {

    /**
     * employee_id
     */
    private Long id;

    /**
     * business_email
     */
    private String businessEmail;

    /**
     * address
     */
    private String address;

    /**
     * person_email
     */
    private String personEmail;

   /**
    * phone
    */
   private String phone;

   /**
    * emergencyContact
    */
   private String emergencyContact;

}