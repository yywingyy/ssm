package com.yy.service.impl;

import com.yy.dao.UserDao;
import com.yy.entity.User;
import com.yy.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yy on 2017/2/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    @Override
    public User userLogin(String username) {
        return userDao.findUserByUsername(username);
    }
}
