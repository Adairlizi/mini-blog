package com.mini.blog.mvc.exceptionConfig;

/**
 * @author 方法调用异常
 * @version 1.0
 * @description: TODO
 * @date 2022/4/4 22:31
 */
public class ServiceException extends RuntimeException{

    public ServiceException(String msg) {
        super(msg);
    }
}
