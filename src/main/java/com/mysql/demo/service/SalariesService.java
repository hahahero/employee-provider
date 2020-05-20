package com.mysql.demo.service;

import com.mysql.demo.entity.Salaries;
import java.util.List;

/**
 * (Salaries)表服务接口
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public interface SalariesService {

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    Salaries queryById(Integer empNo);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Salaries> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param salaries 实例对象
     * @return 实例对象
     */
    Salaries insert(Salaries salaries);

    /**
     * 修改数据
     *
     * @param salaries 实例对象
     * @return 实例对象
     */
    Salaries update(Salaries salaries);

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    boolean deleteById(Integer empNo);

}