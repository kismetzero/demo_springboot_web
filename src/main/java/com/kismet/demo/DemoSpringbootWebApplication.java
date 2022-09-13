package com.kismet.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kismet.demo.dao")
public class DemoSpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootWebApplication.class, args);
    }

}
