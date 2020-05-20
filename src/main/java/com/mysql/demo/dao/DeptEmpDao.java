package com.mysql.demo.dao;

import com.mysql.demo.entity.DeptEmp;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DeptEmp)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public interface DeptEmpDao {

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    DeptEmp queryById(Integer empNo);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DeptEmp> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param deptEmp 实例对象
     * @return 对象列表
     */
    List<DeptEmp> queryAll(DeptEmp deptEmp);

    /**
     * 新增数据
     *
     * @param deptEmp 实例对象
     * @return 影响行数
     */
    int insert(DeptEmp deptEmp);

    /**
     * 修改数据
     *
     * @param deptEmp 实例对象
     * @return 影响行数
     */
    int update(DeptEmp deptEmp);

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 影响行数
     */
    int deleteById(Integer empNo);

}