package com.wcj.wb.user.handler;

import java.util.HashMap;
import java.util.Map;

import com.wcj.wb.user.model.User;
import com.wcj.wb.user.service.UserService;

public class Register {
	private UserService userService;
	
	public Map<String, Object> getUserByUid(Integer uid) {
		User user = userService.getUser(uid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uid", user.getId());
		map.put("nikename", user.getNickname());
		map.put("state", user.getState());
		return map;
	} 
}
