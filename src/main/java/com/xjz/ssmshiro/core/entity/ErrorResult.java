package com.xjz.ssmshiro.core.entity;

import java.util.HashMap;
import java.util.Map;

/**
 *  用于响应错误的请求的对象
 */
public class ErrorResult extends Result {
    /**
     * 封装多个 错误信息
     */
    private Map<String, Object> errors = new HashMap<String, Object>();

    public Map<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }

    public ErrorResult() {
    }
}
