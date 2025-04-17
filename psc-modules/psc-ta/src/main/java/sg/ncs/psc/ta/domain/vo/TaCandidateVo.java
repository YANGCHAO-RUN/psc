package sg.ncs.psc.ta.domain.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import sg.ncs.psc.ta.domain.TaCandidate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AutoMapper(target = TaCandidate.class)
public class TaCandidateVo implements Serializable {

    @Serial
    private static final long serialVersionUID = -5730122799989802500L;

    @TableId
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


}
