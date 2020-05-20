package com.mysql.demo.dao;

import com.mysql.demo.entity.Salaries;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Salaries)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public interface SalariesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    Salaries queryById(Integer empNo);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Salaries> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param salaries 实例对象
     * @return 对象列表
     */
    List<Salaries> queryAll(Salaries salaries);

    /**
     * 新增数据
     *
     * @param salaries 实例对象
     * @return 影响行数
     */
    int insert(Salaries salaries);

    /**
     * 修改数据
     *
     * @param salaries 实例对象
     * @return 影响行数
     */
    int update(Salaries salaries);

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 影响行数
     */
    int deleteById(Integer empNo);

}