package com.my.ssm.demo;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.my.ssm.demo.model.User;
import com.my.ssm.demo.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	
	private Logger log = Logger.getLogger(TestMyBatis.class);
	
    // private ApplicationContext ac = null;
    @Resource
    private IUserService userService;

    // @Before
    // public void before() {
    // ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // userService = (IUserService) ac.getBean("userService");
    // }

    @Test
    public void test() {
        /*User user = userService.getUserById(1);
        log.info(user);*/
        //System.out.println(user);
    	/*User user = new User();
    	user.setAddress("南山区");
    	user.setBirthday(new Date());
    	user.setSex("1");
    	user.setUsername("测试员");
    	int count = userService.saveUser(user);
    	System.out.println(count);*/
    	String name = "王五";
    	PageInfo<User> userList = userService.findUserListByName(name);
    	String list = JSONObject.toJSONString(userList);
    	System.out.println(list);
    }
}
