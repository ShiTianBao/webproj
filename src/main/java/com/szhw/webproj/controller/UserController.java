package com.szhw.webproj.controller;


import com.szhw.webproj.common.RESTResult;
import com.szhw.webproj.persistent.user.User;
import com.szhw.webproj.persistent.user.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HJF
 * @date 2018/11/16 19:14
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserRepository userRepository;

    @GetMapping("/add")
    public RESTResult addUser(User user) {
        RESTResult result = new RESTResult();
        userRepository.save(user);
        return result;
    }

    @GetMapping("/update")
    public RESTResult updateUser(User user) {
        RESTResult result = new RESTResult();
        userRepository.saveAndFlush(user);
        return result;
    }
}
