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
			System.out.println("进入注册方法");
			UserService us=new UserServiceImpl();
			//接收参数，并创建对象
			String username=request.getParameter("username");
			String userpwd=request.getParameter("pwd");
			
			User u =new User();
			u.setPwd(userpwd);
			u.setUsername(username);
			//把对象加入方法，进行注册
			int a=us.addUser(u);
			//返回注册成功页面
			if(a!=-1){
				//如果不等于-1，说明增加成功，返回登录界面
				response.sendRedirect("login.jsp");
			}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	

		doGet(request, response);
	}

}
