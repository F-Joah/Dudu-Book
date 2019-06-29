package com.joah.springboot.user.controller;

import com.joah.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joah
 * @Date: 2019/6/23
 */
@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{user_id}")
    public String GetUser(@PathVariable Long user_id){

        return userService.getOne(user_id).toString();
    }
}
