package com.itcast.service;

import com.itcast.bean.User;

public interface UserService {
	//��ѯ����
	User selectUser(User u);
	//ע�᷽��
	int addUser(User u);
	//���Ҷ�Ӧid���û�
	User selUserById(int userid);
	//�޸��û�����ķ���
	int uppwdByUser(User u);

}
