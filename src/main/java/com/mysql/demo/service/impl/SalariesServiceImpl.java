package com.mysql.demo.service.impl;

import com.mysql.demo.entity.Salaries;
import com.mysql.demo.dao.SalariesDao;
import com.mysql.demo.service.SalariesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Salaries)表服务实现类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
@Service("salariesService")
public class SalariesServiceImpl implements SalariesService {
    @Resource
    private SalariesDao salariesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    @Override
    public Salaries queryById(Integer empNo) {
        return this.salariesDao.queryById(empNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Salaries> queryAllByLimit(int offset, int limit) {
        return this.salariesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param salaries 实例对象
     * @return 实例对象
     */
    @Override
    public Salaries insert(Salaries salaries) {
        this.salariesDao.insert(salaries);
        return salaries;
    }

    /**
     * 修改数据
     *
     * @param salaries 实例对象
     * @return 实例对象
     */
    @Override
    public Salaries update(Salaries salaries) {
        this.salariesDao.update(salaries);
        return this.queryById(salaries.getEmpNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empNo) {
        return this.salariesDao.deleteById(empNo) > 0;
    }
}