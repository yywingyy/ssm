package com.yy.dao;

import com.yy.entity.Information;

public interface InformationDao {
    int deleteByPrimaryKey(Integer iId);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);
}