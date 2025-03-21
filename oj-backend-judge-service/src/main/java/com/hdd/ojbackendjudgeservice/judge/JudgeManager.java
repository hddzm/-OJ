package com.hdd.ojbackendjudgeservice.judge;

import com.hdd.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.hdd.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.hdd.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.hdd.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import ojbackendmodel.model.codesandbox.JudgeInfo;
import ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
