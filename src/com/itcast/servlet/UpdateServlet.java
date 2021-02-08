
package com.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.itcast.bean.User;
import com.itcast.service.UserService;
import com.itcast.service.impl.UserServiceImpl;

public class UpdateServlet extends HttpServlet {
	Logger logger = Logger.getLogger(this.getClass());
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		logger.debug("进入修改用户信息的方法");
		
		HttpSession session = request.getSession();
		
		User u = (User)session.getAttribute("user");
		
		UserService us = new UserServiceImpl();
		int userid=u.getUserid();
		User userbak=us.selUserById(userid);
		
		request.setAttribute("ubak", userbak);
		
		request.getRequestDispatcher("updateUser.jsp").forward(request, response);
		logger.debug("sent object to updateUser.jsp");
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
