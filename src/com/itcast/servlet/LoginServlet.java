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

public class LoginServlet extends HttpServlet {
	
	Logger logger = Logger.getLogger(this.getClass());
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String srand=request.getParameter("yanzheng");
		String code= (String) request.getSession().getAttribute("code");
		
		
		if(srand.equals(code)){
			
			User u = new User();
			logger.debug("WRONG VERIFY CODE"+"INPUT VALUE IS:"+srand+"--"+"VERITY CODE IS:"+code+"NEXT STEP");
			
			String username=request.getParameter("username");
			String pwd=request.getParameter("pwd");
			
			u.setUsername(username);
			u.setPwd(pwd);
			logger.debug("INFORMATION£ºUSERNAME=" + username + ",PASSWORD=" + pwd);
			
			UserService us= new UserServiceImpl();
			User uresut = us.selectUser(u);
			if(uresut!=null){
				
				HttpSession session = request.getSession();
				
				session.setAttribute("user", uresut);
				
				
				request.getRequestDispatcher("Main.jsp").forward(request, response);
			}else{
				
				request.setAttribute("fail", "INCORRECT USERNAME AND PASSWORD£¬PLEASE TRY AGAIN");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else{
			request.setAttribute("fail", "WRONG VERIFY CODE");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			doGet(request, response);
	}

	
}
