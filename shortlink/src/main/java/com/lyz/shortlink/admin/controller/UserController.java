package com.lyz.shortlink.admin.controller;

import com.lyz.shortlink.admin.convention.result.Result;
import com.lyz.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.lyz.shortlink.admin.dto.resp.UserRespDTO;
import com.lyz.shortlink.admin.service.UserService;
import com.lyz.shortlink.admin.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public Result<UserRespDTO> getUserByUsername(String username){
        return userService.getUserByUsername(username);


    }
}
