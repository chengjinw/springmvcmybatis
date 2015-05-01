package com.wcj.wb.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcj.wb.user.dao.UserDao;
import com.wcj.wb.user.model.User;
import com.wcj.wb.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao userDao;
     
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDao.insertUser(user);
    }
    
    public User getUser(Integer uid) {
    	return userDao.getUserInfo(uid);
    }
 
}