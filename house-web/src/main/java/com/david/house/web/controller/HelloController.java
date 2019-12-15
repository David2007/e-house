package com.david.house.web.controller;

import com.david.house.biz.service.UserService;
import com.david.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    // 返回 freemarker 文件
    @RequestMapping("hello")
    public String hello(ModelMap modelMap) throws IllegalAccessException {
        List<User> users = userService.getUsers();
        User one = users.get(0);
        modelMap.put("user", one);
        // for the test of custom error handler
        throw new IllegalAccessException("test");
        //return "hello";
    }

    // 返回 index 文件
    @RequestMapping("index")
    public String index(){
        return "homepage/index";
    }
}
