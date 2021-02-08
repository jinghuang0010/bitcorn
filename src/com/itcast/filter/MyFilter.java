package com.itcast.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


import com.itcast.bean.User;

public class MyFilter implements Filter{
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filter destory--------");
		
	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// 编码处理
				
				//
				// ef 就是 处理了 编码之后的 request 对象  只要 是通过   ef  取值 都是 处理了编码之后的
				// 取当前登录这
				HttpServletRequest req=(HttpServletRequest)request;
				EncodingFilter ef = new EncodingFilter(req);// EncodingFilter request 对象  处理 请求的对象
				
				// 判断 当前访问路径是什么
				String path = req.getRequestURI();
				System.out.println("path-----------"+path);
				if(path.contains("login.jsp") || path.contains("LoginServlet") || path.contains("css/") || path.contains("js/")|| path.contains("images/")){
					// 做登录 或者 加载一些 css js  png 
					chain.doFilter(ef, response);
				}else{
					//不是做登录
					User u = (User)req.getSession().getAttribute("user");
					if(u!= null){
						chain.doFilter(ef, response);
					}else{
						req.setAttribute("error", "please login first");
						req.getRequestDispatcher("login.jsp").forward(req, response);
					}
				}
				
		
	}
	
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter initiate-------------------");
		
	}

}
