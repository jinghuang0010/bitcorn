package com.itcast.dao.impl;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.itcast.bean.Inverst;
import com.itcast.dao.InverstDao;

public class InverstDaoImpl implements InverstDao{
	
	public List<Inverst> selectInverstMark() {
		// TODO Auto-generated method stub

		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		List<Inverst> list=session.selectList("selectInverstMark"); 
		//释放资源
		SessionFactory.closeSession();
		//返回集合
		return list;
	}
	//实现查询总条数的方法
	public int selectCount() {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		int count=session.selectOne("selectCont"); 
		//释放资源
		SessionFactory.closeSession();
		//返回集合
		return count;
	}
	//插入数据的算法
	public int inpuinputInverstMessage(Inverst i) {
		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		int count=session.insert("addInfo",i);
		//提交
		session.commit();
		System.out.println(count);
		//释放资源
		SessionFactory.closeSession();
		//返回集合
		return count;
	}
	//查询最大id的信息内容
	public Inverst selectMaxIdInfo() {
		// TODO Auto-generated method stub
		SqlSession session=SessionFactory.getSession();
		//session调用查询方法
		Inverst inver=session.selectOne("selectMaxIdInfo");
		//释放资源
		SessionFactory.closeSession();
		//返回集合
		return inver;
	}
	//删除数据的算法
	//插入数据的算法
		public int delfino(int id){
			SqlSession session=SessionFactory.getSession();
			//session调用查询方法
			int count=session.delete("delInfo",id);
			//提交
			session.commit();
			System.out.println(count);
			//释放资源
			SessionFactory.closeSession();
			//返回集合
			return count;
		}

}
