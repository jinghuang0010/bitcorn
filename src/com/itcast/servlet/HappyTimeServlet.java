package com.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.itcast.bean.Inverst;
import com.itcast.service.InverstService;
import com.itcast.service.impl.InverstServiceImpl;

public class HappyTimeServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//CREAT OBJECT
		InverstService is= new InverstServiceImpl();
		Logger logger = Logger.getLogger(this.getClass());
		
		request.setCharacterEncoding("utf-8");
		
		
		String shoppingDate=request.getParameter("shoppingdate");
		int inverstMoney=Integer.parseInt(request.getParameter("shoppingmoney"));
		int shopingNumber=Integer.parseInt(request.getParameter("sumnumber"));
		String remark=request.getParameter("remark");
		logger.debug("FOUR PARAMETER"+shoppingDate+","+shoppingDate+","+shopingNumber+","+remark);
		//IF SIS NOT CHOOSE TIME ,DEFAULT TODAY
		if(shoppingDate==null||shoppingDate==""){ 
			Date d= new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			shoppingDate=sdf.format(d);
		}
		//NO TEMARK
		if(remark==null||remark==""){
			remark="NOTHING";
		}
		//VALUE
		Inverst i = new Inverst();
		i.setInverstDate(shoppingDate);
		i.setRemark(remark);
		i.setInverstMoney(inverstMoney);
		i.setSumNumber(shopingNumber);
		logger.debug("创建对象成功");
		int flag=is.inputInverstMessage(i);
		logger.debug("返回插入数据的受影响行数"+flag);
		//AFTER SUCESS GO BACK LOOKLIST
		//1 IS SUCESS
		if(flag==1){
			
			//BACK TO PAGE
			response.sendRedirect("LookList.do");
			logger.debug("INSERT SUESS，GO BACK LogkList.do");
			
		}else{
			//INSERT FAIL
			response.sendRedirect("Failjsp.jsp");
			logger.debug("INSERT FAIL");
		}

		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}

	
}
