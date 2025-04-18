package sg.ncs.psc.pmo.domain.bo;

import lombok.Data;
import org.mapstruct.Mapper;
import sg.ncs.psc.common.core.utils.auto.AutoMapper;
import sg.ncs.psc.pmo.domain.EmployeeProject;

import java.time.LocalDate;

/**
 * @author ncs
 */
@Data
@AutoMapper(target = EmployeeProject.class)
public class EmployeeProjectBo {
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