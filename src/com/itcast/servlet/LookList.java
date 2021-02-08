package com.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.itcast.bean.Inverst;
import com.itcast.service.InverstService;
import com.itcast.service.impl.InverstServiceImpl;

public class LookList extends HttpServlet {

	Logger logger = Logger.getLogger(this.getClass());
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		InverstService is = new InverstServiceImpl();
		List<Inverst> list=is.selectInverstMark();
		
		request.setAttribute("list", list);
		//转发到这个页面
		request.getRequestDispatcher("Show.jsp").forward(request, response);
		logger.debug("把集合内容发送到Show.jsp");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
		
	}

	

}
