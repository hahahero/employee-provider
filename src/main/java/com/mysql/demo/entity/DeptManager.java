package com.mysql.demo.entity;

import java.io.Serializable;

/**
 * (DeptManager)实体类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public class DeptManager implements Serializable {
    private static final long serialVersionUID = 798024157791582067L;
    
    private Integer empNo;
    
    private String deptNo;
    
    private Object fromDate;
    
    private Object toDate;


    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
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