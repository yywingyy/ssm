package com.yy.dao;

import com.yy.entity.Account;

public interface AccountDao {
    int deleteByPrimaryKey(Integer aId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}