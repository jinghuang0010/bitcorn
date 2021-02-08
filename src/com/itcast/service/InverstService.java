package com.itcast.service;

import java.util.List;

import com.itcast.bean.Inverst;

public interface InverstService {
	//掺入信息的方法
	int inputInverstMessage(Inverst i);
	//查看信息列表
	public List<Inverst> selectInverstMark();
	//删除信息的方法
	int delinfo(int id);
	
	
	
	
	

}
