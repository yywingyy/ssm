package com.yy.entity;

import java.util.Date;

public class Games {
    private Integer gId;

    private Integer gGameType;

    private String gGameName;

    private String gGamePartition;

    private Integer gGameFlag;

    private Date gLastModify;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getgGameType() {
        return gGameType;
    }

    public void setgGameType(Integer gGameType) {
        this.gGameType = gGameType;
    }

    public String getgGameName() {
        return gGameName;
    }

    public void setgGameName(String gGameName) {
        this.gGameName = gGameName == null ? null : gGameName.trim();
    }

    public String getgGamePartition() {
        return gGamePartition;
    }

    public void setgGamePartition(String gGamePartition) {
        this.gGamePartition = gGamePartition == null ? null : gGamePartition.trim();
    }

    public Integer getgGameFlag() {
        return gGameFlag;
    }

    public void setgGameFlag(Integer gGameFlag) {
        this.gGameFlag = gGameFlag;
    }

    public Date getgLastModify() {
        return gLastModify;
    }

    public void setgLastModify(Date gLastModify) {
        this.gLastModify = gLastModify;
    }
}