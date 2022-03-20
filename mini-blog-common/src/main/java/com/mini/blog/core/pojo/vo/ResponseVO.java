package com.mini.blog.core.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Administrator
 * @version 1.0
 * @description: 公共响应类
 * @date 2022/3/20 16:09
 */
@Data
public class ResponseVO<T> implements Serializable {

    //返回编码
    private String code;
    //返回消息
    private String msg;
    //返回数据内容
    private T data;


    public ResponseVO(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseVO() {
    }

    public static ResponseVO success(){
        return new ResponseVO();
    }

    public static <T> ResponseVO<T> success(String code, String msg, T data){
        return new ResponseVO(code, msg, data);
    }

    public static <T> ResponseVO<T> success(String code,String msg){
        return  new ResponseVO(code, msg);
    }

}

