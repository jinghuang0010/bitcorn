package com.itcast.dao.impl;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	//静态块在加载类时运行，解析mybatis配置的所有xml文件
	static {

		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("configuration.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//返回SqlSessionFactory对象
		ssf = new SqlSessionFactoryBuilder().build(reader);

	}

	//2个私有静态的属性
	private static SqlSessionFactory ssf;
	private static SqlSession session;

	//获得session对象的方法
	public static SqlSession getSession() {

		//如果session不为空，需要将session对象置空
		if (session != null) {
			session = null;
		}
		//从ssf对象中获得一个可用的session对象

		session = ssf.openSession();
		//返回这个对象
		return session;

	}

	//关闭session的方法
	public static void closeSession() {
		session.close();
	}

}
