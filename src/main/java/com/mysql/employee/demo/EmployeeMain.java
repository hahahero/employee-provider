package com.mysql.employee.demo;


import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@DubboComponentScan({"com.mysql.employee.demo.controller","com.mysql.employee.demo.service.impl"}) //因为这些文件用到了注解，需要加扫描，可扫很多注解
@SpringBootApplication
@MapperScan("com.mysql.employee.demo.dao") //扫描Mybatis，即dao文件下接口，该扫描专门用来扫Mybatis
public class EmployeeMain {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class);
    }
}
