package com.xjz.ssmshiro.core.entity;

/**
 *  SONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 */
public class JSONResult<T> extends  Result{
    /**
     * 数据
     */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public JSONResult() {
        //super();
    }

    /**
     * 自定义返回的结果
     *
     * @param data
     * @param message
     * @param success
     */
    public JSONResult(T data, String message, boolean success) {
        this.data = data;
        this.setMessage(message);
        this.setSuccess(success);
    }

    /**
     *  成功返回数据和消息
     * @param data
     * @param message
     */
    public JSONResult(T data, String message){
        this.data = data;
        this.setMessage(message);
        this.setSuccess(isSuccess());
    }

    /**
     *  成功返回数据
     * @param data
     */
    public JSONResult(T data){
        this.data = data;
        this.setSuccess(isSuccess());
    }
}
