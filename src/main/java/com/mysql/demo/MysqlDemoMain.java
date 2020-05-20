package com.mysql.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mysql.demo.controller","com.mysql.demo.service.impl"}) //因为这些文件用到了注解，需要加扫描，可扫很多注解
@MapperScan("com.mysql.demo.dao") //扫描Mybatis，即dao文件下接口，该扫描专门用来扫Mybatis
public class MysqlDemoMain {
    public static void main(String[] args) {
        SpringApplication.run(MysqlDemoMain.class);
    }
}
