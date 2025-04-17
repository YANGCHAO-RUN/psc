package sg.ncs.psc.ta.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.ta.domain.TaPosition;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AutoMapper(target = TaPosition.class, reverseConvertGenerate = false)
public class TaPositionBo implements Serializable {

    @Serial
    private static final long serialVersionUID = -7697729868346668340L;

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

    private String status;

    private Long createBy;

    private LocalDateTime createTime;

    private Long updateBy;

    private LocalDateTime updateTime;

    private String searchValue;

}
