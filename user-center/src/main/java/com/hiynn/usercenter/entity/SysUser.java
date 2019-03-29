package com.hiynn.usercenter.entity;

/**
 * @Author: kehaiyong
 * @Description:
 * @Date: 2018/4/23 13:35
 * @ModifiedBy:
 */
public class SysUser {

    private Integer userId;
    private String  userName;
    private String  trueName;
    private String  password;
    private String  contactNo;
    private String  email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
