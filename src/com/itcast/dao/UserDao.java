package com.itcast.dao;

import com.itcast.bean.User;

public interface UserDao {

	User selectUser(User u);
	//ע�᷽��
	int adduser(User u);
	//�����û�id�����û�
	User selUserById(int userid);
	//�޸��û�����ķ���
	int uppwdByUser(User u);

}
