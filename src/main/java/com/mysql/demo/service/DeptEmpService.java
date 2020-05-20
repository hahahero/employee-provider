package com.mysql.demo.service;

import com.mysql.demo.entity.DeptEmp;
import java.util.List;

/**
 * (DeptEmp)表服务接口
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public interface DeptEmpService {

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    DeptEmp queryById(Integer empNo);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DeptEmp> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param deptEmp 实例对象
     * @return 实例对象
     */
    DeptEmp insert(DeptEmp deptEmp);

    /**
     * 修改数据
     *
     * @param deptEmp 实例对象
     * @return 实例对象
     */
    DeptEmp update(DeptEmp deptEmp);

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    boolean deleteById(Integer empNo);

}