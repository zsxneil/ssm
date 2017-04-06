package com.my.ssm.demo.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.ssm.demo.model.User;
import com.my.ssm.demo.service.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Resource
	IUserService userService;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public User findUser(@RequestParam(name="userId") int userId) {
		User user = userService.getUserById(userId);
		return user;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String addUser() {
		return "user-add";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(User user) {
		user.setBirthday(new Date());
		userService.saveUser(user);
		return "redirect:save";
	}
}
