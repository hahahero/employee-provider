package com.mysql.demo.service.impl;

import com.mysql.demo.entity.Titles;
import com.mysql.demo.dao.TitlesDao;
import com.mysql.demo.service.TitlesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Titles)表服务实现类
 *
 * @author makejava
 * @since 2020-04-03 00:25:01
 */
@Service("titlesService")
public class TitlesServiceImpl implements TitlesService {
    @Resource
    private TitlesDao titlesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    @Override
    public Titles queryById(Integer empNo) {
        return this.titlesDao.queryById(empNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Titles> queryAllByLimit(int offset, int limit) {
        return this.titlesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param titles 实例对象
     * @return 实例对象
     */
    @Override
    public Titles insert(Titles titles) {
        this.titlesDao.insert(titles);
        return titles;
    }

    /**
     * 修改数据
     *
     * @param titles 实例对象
     * @return 实例对象
     */
    @Override
    public Titles update(Titles titles) {
        this.titlesDao.update(titles);
        return this.queryById(titles.getEmpNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empNo) {
        return this.titlesDao.deleteById(empNo) > 0;
    }
}