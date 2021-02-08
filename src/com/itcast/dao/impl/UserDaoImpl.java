package com.itcast.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itcast.bean.Inverst;
import com.itcast.bean.User;
import com.itcast.dao.UserDao;

public class UserDaoImpl implements UserDao{
	//��ѯ�����½�ķ���
	public User selectUser(User u) {
		// TODO Auto-generated method stub
		
		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		User uresult=session.selectOne("selectUser", u); 
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ�
		return uresult;
	}
	
	public int adduser(User u) {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		int uresult=session.update("addUser", u); 
		//�ύ
		session.commit();
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ�
		return uresult;
	}
	
	public User selUserById(int userid) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				SqlSession session=SessionFactory.getSession();
				//session���ò�ѯ����
				User uresult=session.selectOne("selectUserById", userid); 
				//�ͷ���Դ
				SessionFactory.closeSession();
				//���ؼ�
				return uresult;
	}
	
	//�޸��û�����ķ���
	public int uppwdByUser(User u) {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		int num=session.update("uppwdByUser", u); 
		//�ύ
		session.commit();
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ�
		return num;
	}
	
}
