package com.yy.dao;

import com.yy.entity.Games;

public interface GamesDao {
    int deleteByPrimaryKey(Integer gId);

    int insert(Games record);

    int insertSelective(Games record);

    Games selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(Games record);

    int updateByPrimaryKey(Games record);
}