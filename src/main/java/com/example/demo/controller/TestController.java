package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    UserService userService;
    // 成功使用git
    @GetMapping(value = "/hello")
    @ApiOperation(value = "测试")
    @ResponseBody
    public String test(){
        return "test";
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public User user(String id) {
        return userService.queryUserById(id);
    }

}
