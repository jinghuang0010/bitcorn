package com.itcast.service;

import java.util.List;

import com.itcast.bean.Inverst;

public interface InverstService {
	//������Ϣ�ķ���
	int inputInverstMessage(Inverst i);
	//�鿴��Ϣ�б�
	public List<Inverst> selectInverstMark();
	//ɾ����Ϣ�ķ���
	int delinfo(int id);
	
	
	
	
	

}
