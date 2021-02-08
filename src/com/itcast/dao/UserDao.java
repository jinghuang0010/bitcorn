package com.itcast.dao;

import com.itcast.bean.User;

public interface UserDao {

	User selectUser(User u);
	//注册方法
	int adduser(User u);
	//根据用户id查找用户
	User selUserById(int userid);
	//修改用户密码的方法
	int uppwdByUser(User u);

}
