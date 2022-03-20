package com.mini.blog.user.config;

import com.mini.blog.core.pojo.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @version 1.0
 * @description: 统一异常
 * @date 2022/3/20 18:58
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public ResponseVO<String> handlerCommerceException(HttpServletRequest req, Exception ex){
        ResponseVO<String> response = new ResponseVO<>(
                "-1", "business error"
        );
        response.setData(ex.getMessage());
        log.error("commerce service has error: [{}]", ex.getMessage(), ex);
        return response;
    }
}