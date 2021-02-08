

package com.itcast.service.impl;

import java.text.DecimalFormat;
import java.util.List;

import com.itcast.bean.Inverst;
import com.itcast.dao.InverstDao;
import com.itcast.dao.impl.InverstDaoImpl;
import com.itcast.service.InverstService;


public class InverstServiceImpl implements InverstService{
	//创建对象
			InverstDao id= new InverstDaoImpl();
	//插入信息的方法
	public  int inputInverstMessage(Inverst i) {
		
		// TODO Auto-generated method stub
		//先查出表里有没有数据，
		int count=id.selectCount();
		System.out.println("表中数据总条数为"+count);
		//如果没有,采用一种算法
		if(count==0){
			//各种赋值，最后创建对象
			//第一次购买，本次购买数量等于给持有总量赋值
			i.setShopingNumber(i.getSumNumber());
			//计算持有成本
			i.setHoldingcost((int)((double)(i.getInverstMoney())/i.getShopingNumber()*100000000));
			//总投资金额==本次购买金额
			i.setSumInvertMoney(i.getInverstMoney());
			//市值==本次购买金额
			i.setMarketValue(i.getInverstMoney());
			//增长率
			i.setIncrease(0);
			i.setValue(i.getHoldingcost());
			return id.inpuinputInverstMessage(i);
		}else{
			
			Inverst ilast=id.selectMaxIdInfo();
			
			//本次购买数量=目前持有总量-上一次持有总量
			i.setShopingNumber(i.getSumNumber()-ilast.getSumNumber());
			System.out.println("本次购买总量"+i.getShopingNumber());
			//总投资金额
			i.setSumInvertMoney(i.getInverstMoney()+ilast.getSumInvertMoney());
			i.setValue((int)((double)(i.getInverstMoney())/i.getShopingNumber()*100000000));
			
			
			System.out.println("总投资金额"+i.getSumInvertMoney());
			System.out.println("单价"+i.getValue());
			//市值等于持有总量/100000*单价
			i.setMarketValue((int)(((double)i.getSumNumber()/100000000)*i.getValue()));//市值
			System.out.println("市值"+i.getMarketValue());
			//持有成本
			i.setHoldingcost((int)(i.getSumInvertMoney()/((double)i.getSumNumber()/100000000)));
			System.out.println("持有成本"+i.getHoldingcost());
			//投资收益率
			DecimalFormat df = new DecimalFormat("#.00");
			double cha=(double)(i.getValue()-i.getHoldingcost());
			double result=cha/i.getHoldingcost()*100;
			System.out.println("result"+result);
			
			
			double shengzhilv=Double.parseDouble(df.format(result));
			i.setIncrease(shengzhilv);
			System.out.println(i.getIncrease());
			
					
		
			
			return id.inpuinputInverstMessage(i);
		}
	}
	
	
	public List<Inverst> selectInverstMark() {
		// TODO Auto-generated method stub
		
		//创建对象
		InverstDao id= new InverstDaoImpl();
		//返回结合
		return id.selectInverstMark();
	}
	
	//删除信息的方法
		public int delinfo(int id) {
			int num =this.id.delfino(id);
			return num;
		}
	
}
