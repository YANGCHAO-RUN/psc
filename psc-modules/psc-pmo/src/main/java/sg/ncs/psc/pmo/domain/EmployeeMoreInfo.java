package sg.ncs.psc.pmo.domain;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author ncs
 */
@Data
public class EmployeeMoreInfo {
    private Long id;
    private LocalDate workStartDate;
    private LocalDate itWorkStartDate;
    private String hobby;
    private String skillSet;
    private String remark;
}