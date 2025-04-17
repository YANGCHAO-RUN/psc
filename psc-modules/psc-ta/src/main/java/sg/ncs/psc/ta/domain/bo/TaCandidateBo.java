package sg.ncs.psc.ta.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.ta.domain.TaCandidate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AutoMapper(target = TaCandidate.class, reverseConvertGenerate = false)
public class TaCandidateBo implements Serializable {

    @Serial
    private static final long serialVersionUID = 3663334128196206379L;

    private Long candidateId;

    private String name;

    private String education;

    private String graduatedFrom;

    private String workExperience;

    /**
     * 候选人状态（0 Active  1 On Hold  2 Hired）
     */
    private String status;

    private Long createBy;

    private LocalDateTime createTime;

    private Long updateBy;

    private LocalDateTime updateTime;

    private String searchValue;

}
