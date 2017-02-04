package com.yy.entity;

import java.util.Date;

public class UserGameInfo {
    private Integer ugiId;

    private Integer gGameType;

    private String ugiWinNum;

    private String ugiLoseNum;

    private Float ugiWinProportion;

    private Date ugiLastModify;

    public Integer getUgiId() {
        return ugiId;
    }

    public void setUgiId(Integer ugiId) {
        this.ugiId = ugiId;
    }

    public Integer getgGameType() {
        return gGameType;
    }

    public void setgGameType(Integer gGameType) {
        this.gGameType = gGameType;
    }

    public String getUgiWinNum() {
        return ugiWinNum;
    }

    public void setUgiWinNum(String ugiWinNum) {
        this.ugiWinNum = ugiWinNum == null ? null : ugiWinNum.trim();
    }

    public String getUgiLoseNum() {
        return ugiLoseNum;
    }

    public void setUgiLoseNum(String ugiLoseNum) {
        this.ugiLoseNum = ugiLoseNum == null ? null : ugiLoseNum.trim();
    }

    public Float getUgiWinProportion() {
        return ugiWinProportion;
    }

    public void setUgiWinProportion(Float ugiWinProportion) {
        this.ugiWinProportion = ugiWinProportion;
    }

    public Date getUgiLastModify() {
        return ugiLastModify;
    }

    public void setUgiLastModify(Date ugiLastModify) {
        this.ugiLastModify = ugiLastModify;
    }
}