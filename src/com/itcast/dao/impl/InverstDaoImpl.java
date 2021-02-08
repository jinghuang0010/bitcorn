package com.itcast.dao.impl;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.itcast.bean.Inverst;
import com.itcast.dao.InverstDao;

public class InverstDaoImpl implements InverstDao{
	
	public List<Inverst> selectInverstMark() {
		// TODO Auto-generated method stub

		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		List<Inverst> list=session.selectList("selectInverstMark"); 
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ���
		return list;
	}
	//ʵ�ֲ�ѯ�������ķ���
	public int selectCount() {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		int count=session.selectOne("selectCont"); 
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ���
		return count;
	}
	//�������ݵ��㷨
	public int inpuinputInverstMessage(Inverst i) {
		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		int count=session.insert("addInfo",i);
		//�ύ
		session.commit();
		System.out.println(count);
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ���
		return count;
	}
	//��ѯ���id����Ϣ����
	public Inverst selectMaxIdInfo() {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session���ò�ѯ����
		Inverst inver=session.selectOne("selectMaxIdInfo");
		//�ͷ���Դ
		SessionFactory.closeSession();
		//���ؼ���
		return inver;
	}
	//ɾ�����ݵ��㷨
	//�������ݵ��㷨
		public int delfino(int id){
			SqlSession session=SessionFactory.getSession();
			//session���ò�ѯ����
			int count=session.delete("delInfo",id);
			//�ύ
			session.commit();
			System.out.println(count);
			//�ͷ���Դ
			SessionFactory.closeSession();
			//���ؼ���
			return count;
		}

}
