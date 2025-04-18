package sg.ncs.psc.pmo.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.pmo.domain.EmployeeMoreInfo;

import java.time.LocalDate;

@Data
@AutoMapper(target = EmployeeMoreInfo.class)
public class EmployeeMoreInfoBo {
    private Long id;
    private LocalDate workStartDate;
    private LocalDate itWorkStartDate;
    private String hobby;
    private String skillSet;
    private String remark;
}