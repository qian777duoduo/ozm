package com.ozm.omy.controller;

import com.ozm.omy.pojo.User;
import com.ozm.omy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author qianduoduo
 * @Date 2020/1/21 9:50
 * @Version 1.0
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "ok";
    }
    @RequestMapping("/user")
    public List<User> findUser() {
        List<User> users = userService.findUser();
        return users;
    }
}
