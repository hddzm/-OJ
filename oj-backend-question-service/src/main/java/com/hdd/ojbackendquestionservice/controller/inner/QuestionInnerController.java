package com.hdd.ojbackendquestionservice.controller.inner;


import com.hdd.ojbackendquestionservice.service.QuestionService;
import com.hdd.ojbackendquestionservice.service.QuestionSubmitService;
import com.hdd.ojbackendserviceclient.service.QuestionFeignClient;
import jakarta.annotation.Resource;
import ojbackendmodel.model.entity.Question;
import ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.web.bind.annotation.*;


/**
 * 该服务仅内部调用，不是给前端的
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }

}
