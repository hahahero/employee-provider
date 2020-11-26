package com.mysql.employee.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.mysql.employee.demo.entity.Employees;
import com.mysql.employee.demo.dao.EmployeesDao;
import com.mysql.employee.demo.service.api.EmployeesService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employees)表服务实现类
 *
 * @author makejava
 * @since 2020-06-01 14:02:28
 */
@Service
@Component
public class EmployeesServiceImpl implements EmployeesService {

    private final static Logger logger = LoggerFactory.getLogger(EmployeesServiceImpl.class);

    @Resource
    private EmployeesDao employeesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    @Override
    public Employees queryById(Integer empNo) {
        Employees employeesVo = this.employeesDao.queryById(empNo);
//        logger.info("根据id查询员工信息为：{}", JSON.toJSONString(employeesVo));
        return this.employeesDao.queryById(empNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Employees> queryAllByLimit(int offset, int limit) {
        return this.employeesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees insert(Employees employees) {
        this.employeesDao.insert(employees);
        return employees;
    }

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees update(Employees employees) {
        this.employeesDao.update(employees);
        return this.queryById(employees.getEmpNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empNo) {
        return this.employeesDao.deleteById(empNo) > 0;
    }
}