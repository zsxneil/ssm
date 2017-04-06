package com.my.ssm.demo.service;

import com.github.pagehelper.PageInfo;
import com.my.ssm.demo.model.User;

public interface IUserService {
	User getUserById(int userId);
	
	int saveUser(User user);

	PageInfo<User> findUserListByName(String name);
	
}
