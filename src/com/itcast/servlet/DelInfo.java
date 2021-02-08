package com.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.itcast.service.InverstService;
import com.itcast.service.impl.InverstServiceImpl;

public class DelInfo extends HttpServlet {
	
	InverstService is = new InverstServiceImpl();
	Logger logger = Logger.getLogger(this.getClass());

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int id=Integer.parseInt(request.getParameter("id"));
			
			//���ص�showjspҳ��
			int flag=is.delinfo(id);
			if(flag!=-1){
				response.sendRedirect("LookList.do");
				
				logger.debug("ɾ�����ݳɹ���ת������LogkList.do");
			}
			
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}


}
