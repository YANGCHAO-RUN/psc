package sg.ncs.psc.pmo.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.pmo.domain.EmployeeExtDbs;

@Data
@AutoMapper(target = EmployeeExtDbs.class)
public class EmployeeExtDbsBo {
    private Long id;
    private String dbsEmployeeId;
    private String dbsEmail;
    private String source;
    private String company;
    private String projectCode;
    private String workLocation;
    private String sowLocation;
    private String lobt;
    private String lobtGroup;
    private String sow;
    private String jobRole;
    private String jobGrade;
    private String ncsGrade;
    private String yeasOfService;
    private String dbsServicePeriod;
    private String skillset;
    private String hiringManager;
    private String specialization;
    private java.math.BigDecimal dbsRateCard;
    private String beelineStatus;
}