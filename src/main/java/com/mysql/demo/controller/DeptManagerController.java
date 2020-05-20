package com.mysql.demo.controller;

import com.mysql.demo.entity.DeptManager;
import com.mysql.demo.service.DeptManagerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DeptManager)表控制层
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@RestController
@RequestMapping("deptManager")
public class DeptManagerController {
    /**
     * 服务对象
     */
    @Resource
    private DeptManagerService deptManagerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DeptManager selectOne(Integer id) {
        return this.deptManagerService.queryById(id);
    }

}