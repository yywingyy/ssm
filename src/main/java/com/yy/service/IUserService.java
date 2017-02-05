package com.yy.service;

/**
 * Created by yy on 2017/2/3.
 */
import com.yy.entity.User;
public interface IUserService {
    public User getUserById(int userId);
    public User userLogin(String username);
}
