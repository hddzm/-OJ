package com.hdd.ojbackendjudgeservice.judge.codesandbox;


import ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
