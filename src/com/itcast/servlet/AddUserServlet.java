package com.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.bean.User;
import com.itcast.service.UserService;
import com.itcast.service.impl.UserServiceImpl;

public class AddUserServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("����ע�᷽��");
			UserService us=new UserServiceImpl();
			//���ղ���������������
			String username=request.getParameter("username");
			String userpwd=request.getParameter("pwd");
			
			User u =new User();
			u.setPwd(userpwd);
			u.setUsername(username);
			//�Ѷ�����뷽��������ע��
			int a=us.addUser(u);
			//����ע��ɹ�ҳ��
			if(a!=-1){
				//���������-1��˵�����ӳɹ������ص�¼����
				response.sendRedirect("login.jsp");
			}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	

		doGet(request, response);
	}

}
