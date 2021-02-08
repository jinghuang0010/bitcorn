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

public class UpdUserPwdServlet extends HttpServlet {
	UserService us = new UserServiceImpl();
		
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int uid=Integer.parseInt(request.getParameter("userid"));
		String pwd=request.getParameter("pwd");
		
		User u = new User();
		u.setPwd(pwd);
		u.setUserid(uid);
		int num=us.uppwdByUser(u);
		
		//if num!=-1£¬means success
		if(num!=-1){
			
			response.sendRedirect("login.jsp");
			
			
		}
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
