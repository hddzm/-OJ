package ojbackendmodel.model.dto.questionsubmit;


import lombok.Data;
import lombok.EqualsAndHashCode;
import ojbackendcommon.common.PageRequest;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {


    /**
     * 编程语言
     */
    private String language;

    /**
     * 提交状态
     */
    private Integer status;

    /**
     * 题目 id
     */
    private Long questionId;


    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}
