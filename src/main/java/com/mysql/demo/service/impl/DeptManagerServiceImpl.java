package com.mysql.demo.service.impl;

import com.mysql.demo.entity.DeptManager;
import com.mysql.demo.dao.DeptManagerDao;
import com.mysql.demo.service.DeptManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DeptManager)表服务实现类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@Service("deptManagerService")
public class DeptManagerServiceImpl implements DeptManagerService {
    @Resource
    private DeptManagerDao deptManagerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    @Override
    public DeptManager queryById(Integer empNo) {
        return this.deptManagerDao.queryById(empNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DeptManager> queryAllByLimit(int offset, int limit) {
        return this.deptManagerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param deptManager 实例对象
     * @return 实例对象
     */
    @Override
    public DeptManager insert(DeptManager deptManager) {
        this.deptManagerDao.insert(deptManager);
        return deptManager;
    }

    /**
     * 修改数据
     *
     * @param deptManager 实例对象
     * @return 实例对象
     */
    @Override
    public DeptManager update(DeptManager deptManager) {
        this.deptManagerDao.update(deptManager);
        return this.queryById(deptManager.getEmpNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empNo) {
        return this.deptManagerDao.deleteById(empNo) > 0;
    }
}