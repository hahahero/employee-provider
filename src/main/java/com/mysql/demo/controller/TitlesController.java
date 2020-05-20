package com.mysql.demo.controller;

import com.mysql.demo.entity.Titles;
import com.mysql.demo.service.TitlesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Titles)表控制层
 *
 * @author makejava
 * @since 2020-04-03 00:25:01
 */
@RestController
@RequestMapping("titles")
public class TitlesController {
    /**
     * 服务对象
     */
    @Resource
    private TitlesService titlesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Titles selectOne(Integer id) {
        return this.titlesService.queryById(id);
    }

}