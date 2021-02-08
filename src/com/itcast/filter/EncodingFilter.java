package com.itcast.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

// ���봦�����     �����е�����  
public class EncodingFilter extends HttpServletRequestWrapper {

	// request 	�߹����� Ҫ���б��봦���  request ����
	HttpServletRequest request;
	public EncodingFilter(HttpServletRequest request) {
		super(request);
		this.request=request;
	}
	// ��д  �û�  ��ȡ  request ���� �������  getParameter  �ͻ�����  name ������ֵ ��ȡ  value������ֵ
	public String getParameter(String name) {
		//���������������д   ����  ��ͬ���ύ����  ����ͬ�Ĵ���
		String method = request.getMethod();
		if("GET".equals(method)){
			// get ����
			String newName = request.getParameter(name);// ����
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
			// post �ύ��ʽ  
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return super.getParameter(name);
	}

	
	
}
