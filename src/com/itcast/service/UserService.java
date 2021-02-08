package com.itcast.service;

import com.itcast.bean.User;

public interface UserService {
	//查询对象
	User selectUser(User u);
	//注册方法
	int addUser(User u);
	//查找对应id的用户
	User selUserById(int userid);
	//修改用户密码的方法
	int uppwdByUser(User u);

}
