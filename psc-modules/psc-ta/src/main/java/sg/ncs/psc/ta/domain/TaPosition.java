package sg.ncs.psc.ta.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ta_position")
public class TaPosition implements Serializable {

    @Serial
    private static final long serialVersionUID = 2917303792663495486L;

    @TableId(value = "position_id", type = IdType.ASSIGN_ID)
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

    /**
     * 岗位状态（0已发布  1已关闭）
     */
    private String status;

    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
