package com.lyz.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyz.shortlink.admin.dao.mapper")
public class ShortLinkdAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkdAdminApplication.class);
    }
}
