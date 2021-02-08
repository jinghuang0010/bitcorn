package com.itcast.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itcast.bean.Inverst;
import com.itcast.bean.User;
import com.itcast.dao.UserDao;

public class UserDaoImpl implements UserDao{
	//查询对象登陆的方法
	public User selectUser(User u) {
		// TODO Auto-generated method stub
		
		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		User uresult=session.selectOne("selectUser", u); 
		//释放资源
		SessionFactory.closeSession();
		//返回集
		return uresult;
	}
	
	public int adduser(User u) {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		int uresult=session.update("addUser", u); 
		//提交
		session.commit();
		//释放资源
		SessionFactory.closeSession();
		//返回集
		return uresult;
	}
	
	public User selUserById(int userid) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				SqlSession session=SessionFactory.getSession();
				//session调用查询方法
				User uresult=session.selectOne("selectUserById", userid); 
				//释放资源
				SessionFactory.closeSession();
				//返回集
				return uresult;
	}
	
	//修改用户密码的方法
	public int uppwdByUser(User u) {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		int num=session.update("uppwdByUser", u); 
		//提交
		session.commit();
		//释放资源
		SessionFactory.closeSession();
		//返回集
		return num;
	}
	
}
