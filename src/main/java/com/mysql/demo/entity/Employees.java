package com.mysql.demo.entity;

import java.io.Serializable;

/**
 * (Employees)实体类
 *
 * @author makejava
 * @since 2020-04-03 00:25:00
 */
public class Employees implements Serializable {
    private static final long serialVersionUID = 844898853982713812L;
    
    private Integer empNo;
    
    private Object birthDate;
    
    private String firstName;
    
    private String lastName;
    
    private Object gender;
    
    private Object hireDate;


    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Object getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Object birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getHireDate() {
        return hireDate;
    }

    public void setHireDate(Object hireDate) {
        this.hireDate = hireDate;
    }

}