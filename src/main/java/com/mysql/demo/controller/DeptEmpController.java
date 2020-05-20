package com.mysql.demo.controller;

import com.mysql.demo.entity.DeptEmp;
import com.mysql.demo.service.DeptEmpService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DeptEmp)表控制层
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@RestController
@RequestMapping("deptEmp")
public class DeptEmpController {
    /**
     * 服务对象
     */
    @Resource
    private DeptEmpService deptEmpService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DeptEmp selectOne(Integer id) {
        return this.deptEmpService.queryById(id);
    }

}