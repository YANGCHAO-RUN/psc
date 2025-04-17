package sg.ncs.psc.ta.domain.vo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.ta.domain.TaPosition;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AutoMapper(target = TaPosition.class)
public class TaPostionVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 5413384397205571938L;

    private Long positionId;

    private String jobTitle;

    private String demandSource;

    private String location;

    private String jobType;

    private String level;

    private String keySkills;

    private String taOwner;

    private String offerApprover;

    private String optionalInterviewers;

    private String jobDescription;

    private String aiGeneratedCandidateEvaluationCriteria;

    private Long createBy;

    private LocalDateTime createTime;

    private Long updateBy;

    private LocalDateTime updateTime;

}
