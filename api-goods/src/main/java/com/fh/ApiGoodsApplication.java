package com.fh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.mapper")
public class ApiGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGoodsApplication.class, args);
    }

}
