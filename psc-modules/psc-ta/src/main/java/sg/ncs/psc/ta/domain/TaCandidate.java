package sg.ncs.psc.ta.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ta_candidate")
public class TaCandidate implements Serializable {

    @Serial
    private static final long serialVersionUID = -4889135183607398635L;

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

    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
