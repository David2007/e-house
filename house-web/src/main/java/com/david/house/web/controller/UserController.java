package com.david.house.web.controller;

import com.david.house.biz.service.UserService;
import com.david.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
