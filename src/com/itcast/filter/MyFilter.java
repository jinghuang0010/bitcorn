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
		// ���봦��
				
				//
				// ef ���� ������ ����֮��� request ����  ֻҪ ��ͨ��   ef  ȡֵ ���� �����˱���֮���
				// ȡ��ǰ��¼��
				HttpServletRequest req=(HttpServletRequest)request;
				EncodingFilter ef = new EncodingFilter(req);// EncodingFilter request ����  ���� ����Ķ���
				
				// �ж� ��ǰ����·����ʲô
				String path = req.getRequestURI();
				System.out.println("path-----------"+path);
				if(path.contains("login.jsp") || path.contains("LoginServlet") || path.contains("css/") || path.contains("js/")|| path.contains("images/")){
					// ����¼ ���� ����һЩ css js  png 
					chain.doFilter(ef, response);
				}else{
					//��������¼
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
