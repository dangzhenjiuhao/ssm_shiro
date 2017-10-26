package com.xjz.ssmshiro.core.entity;

public class UserException extends RuntimeException {
    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();
    public long getDate(){
        return date;
    }
}
