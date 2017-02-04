package com.yy.entity;

import java.util.Date;

public class Information {
    private Integer iId;

    private Integer uId;

    private String uAccountNo;

    private String uQq;

    private String uTel;

    private String uPhone;

    private String uLastLoginAddress;

    private Date iLastModify;

    private String uIdCard;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuAccountNo() {
        return uAccountNo;
    }

    public void setuAccountNo(String uAccountNo) {
        this.uAccountNo = uAccountNo == null ? null : uAccountNo.trim();
    }

    public String getuQq() {
        return uQq;
    }

    public void setuQq(String uQq) {
        this.uQq = uQq == null ? null : uQq.trim();
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuLastLoginAddress() {
        return uLastLoginAddress;
    }

    public void setuLastLoginAddress(String uLastLoginAddress) {
        this.uLastLoginAddress = uLastLoginAddress == null ? null : uLastLoginAddress.trim();
    }

    public Date getiLastModify() {
        return iLastModify;
    }

    public void setiLastModify(Date iLastModify) {
        this.iLastModify = iLastModify;
    }

    public String getuIdCard() {
        return uIdCard;
    }

    public void setuIdCard(String uIdCard) {
        this.uIdCard = uIdCard == null ? null : uIdCard.trim();
    }
}