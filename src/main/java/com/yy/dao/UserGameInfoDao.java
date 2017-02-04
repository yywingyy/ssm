package com.yy.dao;

import com.yy.entity.UserGameInfo;

public interface UserGameInfoDao {
    int deleteByPrimaryKey(Integer ugiId);

    int insert(UserGameInfo record);

    int insertSelective(UserGameInfo record);

    UserGameInfo selectByPrimaryKey(Integer ugiId);

    int updateByPrimaryKeySelective(UserGameInfo record);

    int updateByPrimaryKey(UserGameInfo record);
}