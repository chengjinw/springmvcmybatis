package com.wcj.wb.user.service;

import com.wcj.framework.datasource.DataSource;
import com.wcj.wb.user.model.User;

public interface UserService {
	 
    public int insertUser(User user);
    @DataSource("read")
    public User getUser(Integer uid);
}
