package com.mysql.demo.entity;

import java.io.Serializable;

/**
 * (Salaries)实体类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public class Salaries implements Serializable {
    private static final long serialVersionUID = -43960448245248510L;
    
    private Integer empNo;
    
    private Integer salary;
    
    private Object fromDate;
    
    private Object toDate;


    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Object getFromDate() {
        return fromDate;
    }

    public void setFromDate(Object fromDate) {
        this.fromDate = fromDate;
    }

    public Object getToDate() {
        return toDate;
    }

    public void setToDate(Object toDate) {
        this.toDate = toDate;
    }

}