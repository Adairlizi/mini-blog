package com.mini.blog.mvc.exceptionConfig;

import com.mini.blog.core.pojo.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @version 1.0
 * @description: 统一异常
 * @date 2022/3/20 18:58
 */
@Slf4j
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

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseVO<String> nullPointerException(HttpServletRequest req,NullPointerException ex){
        ResponseVO<String> response = new ResponseVO<>(
                "-2","nullPointer error"
        );
        response.setData(ex.getMessage());
        log.error("commerce service has error: [{}]", ex.getMessage(), ex);
        return response;
    }



}
