package com.itcast.dao.impl;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	//��̬���ڼ�����ʱ���У�����mybatis���õ�����xml�ļ�
	static {

		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("configuration.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����SqlSessionFactory����
		ssf = new SqlSessionFactoryBuilder().build(reader);

	}

	//2��˽�о�̬������
	private static SqlSessionFactory ssf;
	private static SqlSession session;

	//���session����ķ���
	public static SqlSession getSession() {

		//���session��Ϊ�գ���Ҫ��session�����ÿ�
		if (session != null) {
			session = null;
		}
		//��ssf�����л��һ�����õ�session����

		session = ssf.openSession();
		//�����������
		return session;

	}

	//�ر�session�ķ���
	public static void closeSession() {
		session.close();
	}

}
