package com.mysql.demo.entity;

import java.io.Serializable;

/**
 * (Departments)实体类
 *
 * @author makejava
 * @since 2020-04-03 00:24:54
 */
public class Departments implements Serializable {
    private static final long serialVersionUID = 927072846626404874L;
    
    private String deptNo;
    
    private String deptName;


    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}