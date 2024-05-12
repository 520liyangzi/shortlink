package com.lyz.shortlink.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "test";
    }
}
