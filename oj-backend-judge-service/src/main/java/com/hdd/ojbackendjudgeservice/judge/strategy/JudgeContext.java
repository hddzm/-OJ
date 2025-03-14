package com.hdd.ojbackendjudgeservice.judge.strategy;

import lombok.Data;
import ojbackendmodel.model.codesandbox.JudgeInfo;
import ojbackendmodel.model.dto.question.JudgeCase;
import ojbackendmodel.model.entity.Question;
import ojbackendmodel.model.entity.QuestionSubmit;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
