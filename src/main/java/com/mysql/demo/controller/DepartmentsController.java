package com.mysql.demo.controller;

import com.mysql.demo.entity.Departments;
import com.mysql.demo.service.DepartmentsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Departments)表控制层
 *
 * @author makejava
 * @since 2020-04-03 00:24:59
 */
@RestController
@RequestMapping("departments")
public class DepartmentsController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentsService departmentsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Departments selectOne(String id) {
        return this.departmentsService.queryById(id);
    }

}