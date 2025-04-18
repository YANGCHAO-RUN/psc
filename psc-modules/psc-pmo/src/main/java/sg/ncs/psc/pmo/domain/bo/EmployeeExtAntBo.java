package sg.ncs.psc.pmo.domain.bo;

import lombok.Data;
import sg.ncs.psc.common.mybatis.core.domain.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeExtAnt;

import java.time.LocalDate;

@Data
@AutoMapper(target = EmployeeExtAnt.class)
public class EmployeeExtAntBo {
    private Long id;
    private String antEmployeeId;
    private String mentor;
    private String senior;
    private LocalDate l1PassDate;
    private String currentProject;
    private String currentDomain;
    private String historicalDomain;
    private String city;
    private String outsourcedPosition;
    private String outsourcedDuties;
    private String jobRole;
    private String jobGrade;
    private String contractForm;
    private String antEmail;
    private String remarks;
}