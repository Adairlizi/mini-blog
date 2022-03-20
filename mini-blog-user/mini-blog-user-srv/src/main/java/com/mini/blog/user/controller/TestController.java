package com.mini.blog.user.controller;

import com.mini.blog.core.pojo.vo.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2022/3/20 16:42
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {


    @GetMapping("/hello")
    @ResponseBody
    public ResponseVO test(){
        int i = 1/0;
        return ResponseVO.success();
    }
}
