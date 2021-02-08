package com.itcast.service.impl;

import com.itcast.bean.User;
import com.itcast.dao.UserDao;
import com.itcast.dao.impl.UserDaoImpl;
import com.itcast.service.UserService;

public class UserServiceImpl implements UserService{
	UserDao ud = new UserDaoImpl();
	
	public User selectUser(User u) {
		// TODO Auto-generated method stub
		
		
		User uresult=ud.selectUser(u);
		return uresult;
	}
	
	//注册的方法
	public int addUser(User u) {
		// TODO Auto-generated method stub
		return ud.adduser(u);
		
	}
	//根据id查找用户
	public User selUserById(int userid) {
		// TODO Auto-generated method stub
		return ud.selUserById(userid);
	}
	
	//修改用户密码的方法
	public int uppwdByUser(User u) {
		// TODO Auto-generated method stub
		return ud.uppwdByUser(u);
	}
	
}
