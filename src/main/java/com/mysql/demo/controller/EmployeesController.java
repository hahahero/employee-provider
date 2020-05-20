package com.mysql.demo.controller;

import com.mysql.demo.entity.Employees;
import com.mysql.demo.service.EmployeesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employees)表控制层
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@RestController
@RequestMapping("employees")
public class EmployeesController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeesService employeesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employees selectOne(Integer empNo) {
        return this.employeesService.queryById(empNo);
    }

}