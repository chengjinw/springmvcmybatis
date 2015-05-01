package com.wcj.wb.user.dao;

import com.wcj.wb.user.model.User;
 
 
public interface UserDao {
 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
     
    public User getUserInfo(Integer uid);
     
}
