package com.itcast.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

// 编码处理的类     请求中的数据  
public class EncodingFilter extends HttpServletRequestWrapper {

	// request 	走过滤器 要进行编码处理的  request 请求
	HttpServletRequest request;
	public EncodingFilter(HttpServletRequest request) {
		super(request);
		this.request=request;
	}
	// 重写  用户  获取  request 请求 这个方法  getParameter  客户根据  name 的属性值 获取  value的属性值
	public String getParameter(String name) {
		//对这个方法进行重写   根据  不同的提交方法  做不同的处理
		String method = request.getMethod();
		if("GET".equals(method)){
			// get 处理
			String newName = request.getParameter(name);// 乱码
			try {
				if(newName != null && !"".equals(newName)){
					newName= new String(newName.getBytes("iso-8859-1"),"utf-8");
				}
				
				return newName;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		if("POST".equals(method)){
			// post 提交方式  
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return super.getParameter(name);
	}

	
	
}
