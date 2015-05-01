package com.wcj.wb.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wcj.wb.user.model.User;
import com.wcj.wb.user.service.UserService;
 
public class UserTest {
 
private UserService userService;
     
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:config/spring.xml"
                ,"classpath:config/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
        User user = new User();
        user.setNickname("你好6");
        user.setState(9);
        System.out.println(userService.insertUser(user));
    }
    
    @Test
    public void findUser(){
    	User user = userService.getUser(2);
    	System.out.println(user);
    }
}
