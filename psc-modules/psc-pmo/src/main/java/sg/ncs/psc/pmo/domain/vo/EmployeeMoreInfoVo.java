package sg.ncs.psc.pmo.domain.vo;

import lombok.Data;
import sg.ncs.psc.common.mybatis.core.domain.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeMoreInfo;

import java.time.LocalDate;

@Data
@AutoMapper(target = EmployeeMoreInfo.class)
public class EmployeeMoreInfoVo {
    private Long id;
    private LocalDate workStartDate;
    private LocalDate itWorkStartDate;
    private String hobby;
    private String skillSet;
    private String remark;
}