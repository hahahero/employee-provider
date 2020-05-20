package com.mysql.demo.controller;

import com.mysql.demo.entity.Salaries;
import com.mysql.demo.service.SalariesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Salaries)表控制层
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@RestController
@RequestMapping("salaries")
public class SalariesController {
    /**
     * 服务对象
     */
    @Resource
    private SalariesService salariesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Salaries selectOne(Integer id) {
        return this.salariesService.queryById(id);
    }

}