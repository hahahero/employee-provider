package com.mysql.demo.entity;

import java.io.Serializable;

/**
 * (Titles)实体类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public class Titles implements Serializable {
    private static final long serialVersionUID = -20290387260511645L;
    
    private Integer empNo;
    
    private String title;
    
    private Object fromDate;
    
    private Object toDate;


    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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