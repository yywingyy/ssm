package com.yy.entity;

import java.util.Date;

public class Account {
    private Integer aId;

    private Integer iId;

    private Integer uMoney;

    private Integer uPoint;

    private Integer uScore;

    private Integer uGameMoney;

    private Integer uGameVip;

    private Date aLastModify;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getuMoney() {
        return uMoney;
    }

    public void setuMoney(Integer uMoney) {
        this.uMoney = uMoney;
    }

    public Integer getuPoint() {
        return uPoint;
    }

    public void setuPoint(Integer uPoint) {
        this.uPoint = uPoint;
    }

    public Integer getuScore() {
        return uScore;
    }

    public void setuScore(Integer uScore) {
        this.uScore = uScore;
    }

    public Integer getuGameMoney() {
        return uGameMoney;
    }

    public void setuGameMoney(Integer uGameMoney) {
        this.uGameMoney = uGameMoney;
    }

    public Integer getuGameVip() {
        return uGameVip;
    }

    public void setuGameVip(Integer uGameVip) {
        this.uGameVip = uGameVip;
    }

    public Date getaLastModify() {
        return aLastModify;
    }

    public void setaLastModify(Date aLastModify) {
        this.aLastModify = aLastModify;
    }
}