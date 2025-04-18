package sg.ncs.psc.pmo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("employee_ext_dbs")
public class EmployeeExtDbs {
    private Integer id;
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
    private BigDecimal dbsRateCard;
    private String beelineStatus;
}