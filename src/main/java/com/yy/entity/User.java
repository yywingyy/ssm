package com.yy.entity;

import java.util.Date;

public class User {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private String uNickname;

    private Date uLastModify;

    private Date uLastLoginTime;

    private String uSex;

    private Integer uAge;

    private Integer uFlag;

    private Integer uIsDelete;

    private Date uRegisterTime;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public Date getuLastModify() {
        return uLastModify;
    }

    public void setuLastModify(Date uLastModify) {
        this.uLastModify = uLastModify;
    }

    public Date getuLastLoginTime() {
        return uLastLoginTime;
    }

    public void setuLastLoginTime(Date uLastLoginTime) {
        this.uLastLoginTime = uLastLoginTime;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public Integer getuFlag() {
        return uFlag;
    }

    public void setuFlag(Integer uFlag) {
        this.uFlag = uFlag;
    }

    public Integer getuIsDelete() {
        return uIsDelete;
    }

    public void setuIsDelete(Integer uIsDelete) {
        this.uIsDelete = uIsDelete;
    }

    public Date getuRegisterTime() {
        return uRegisterTime;
    }

    public void setuRegisterTime(Date uRegisterTime) {
        this.uRegisterTime = uRegisterTime;
    }
}