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
	
	//ע��ķ���
	public int addUser(User u) {
		// TODO Auto-generated method stub
		return ud.adduser(u);
		
	}
	//����id�����û�
	public User selUserById(int userid) {
		// TODO Auto-generated method stub
		return ud.selUserById(userid);
	}
	
	//�޸��û�����ķ���
	public int uppwdByUser(User u) {
		// TODO Auto-generated method stub
		return ud.uppwdByUser(u);
	}
	
}
