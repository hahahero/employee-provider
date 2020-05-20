package com.mysql.demo.service.impl;

import com.mysql.demo.entity.DeptEmp;
import com.mysql.demo.dao.DeptEmpDao;
import com.mysql.demo.service.DeptEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DeptEmp)表服务实现类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@Service("deptEmpService")
public class DeptEmpServiceImpl implements DeptEmpService {
    @Resource
    private DeptEmpDao deptEmpDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    @Override
    public DeptEmp queryById(Integer empNo) {
        return this.deptEmpDao.queryById(empNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DeptEmp> queryAllByLimit(int offset, int limit) {
        return this.deptEmpDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param deptEmp 实例对象
     * @return 实例对象
     */
    @Override
    public DeptEmp insert(DeptEmp deptEmp) {
        this.deptEmpDao.insert(deptEmp);
        return deptEmp;
    }

    /**
     * 修改数据
     *
     * @param deptEmp 实例对象
     * @return 实例对象
     */
    @Override
    public DeptEmp update(DeptEmp deptEmp) {
        this.deptEmpDao.update(deptEmp);
        return this.queryById(deptEmp.getEmpNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empNo) {
        return this.deptEmpDao.deleteById(empNo) > 0;
    }
}