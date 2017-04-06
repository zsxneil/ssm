package com.my.ssm.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.ssm.demo.mapper.UserMapper;
import com.my.ssm.demo.model.User;
import com.my.ssm.demo.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	UserMapper userDao;
	
	public User getUserById(int userId) {
		
		return userDao.selectByPrimaryKey(userId);
	}

	public int saveUser(User user) {
		return userDao.insertSelective(user);
	}

}
