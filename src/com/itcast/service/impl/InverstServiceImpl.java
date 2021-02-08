

package com.itcast.service.impl;

import java.text.DecimalFormat;
import java.util.List;

import com.itcast.bean.Inverst;
import com.itcast.dao.InverstDao;
import com.itcast.dao.impl.InverstDaoImpl;
import com.itcast.service.InverstService;


public class InverstServiceImpl implements InverstService{
	//��������
			InverstDao id= new InverstDaoImpl();
	//������Ϣ�ķ���
	public  int inputInverstMessage(Inverst i) {
		
		// TODO Auto-generated method stub
		//�Ȳ��������û�����ݣ�
		int count=id.selectCount();
		System.out.println("��������������Ϊ"+count);
		//���û��,����һ���㷨
		if(count==0){
			//���ָ�ֵ����󴴽�����
			//��һ�ι��򣬱��ι����������ڸ�����������ֵ
			i.setShopingNumber(i.getSumNumber());
			//������гɱ�
			i.setHoldingcost((int)((double)(i.getInverstMoney())/i.getShopingNumber()*100000000));
			//��Ͷ�ʽ��==���ι�����
			i.setSumInvertMoney(i.getInverstMoney());
			//��ֵ==���ι�����
			i.setMarketValue(i.getInverstMoney());
			//������
			i.setIncrease(0);
			i.setValue(i.getHoldingcost());
			return id.inpuinputInverstMessage(i);
		}else{
			
			Inverst ilast=id.selectMaxIdInfo();
			
			//���ι�������=Ŀǰ��������-��һ�γ�������
			i.setShopingNumber(i.getSumNumber()-ilast.getSumNumber());
			System.out.println("���ι�������"+i.getShopingNumber());
			//��Ͷ�ʽ��
			i.setSumInvertMoney(i.getInverstMoney()+ilast.getSumInvertMoney());
			i.setValue((int)((double)(i.getInverstMoney())/i.getShopingNumber()*100000000));
			
			
			System.out.println("��Ͷ�ʽ��"+i.getSumInvertMoney());
			System.out.println("����"+i.getValue());
			//��ֵ���ڳ�������/100000*����
			i.setMarketValue((int)(((double)i.getSumNumber()/100000000)*i.getValue()));//��ֵ
			System.out.println("��ֵ"+i.getMarketValue());
			//���гɱ�
			i.setHoldingcost((int)(i.getSumInvertMoney()/((double)i.getSumNumber()/100000000)));
			System.out.println("���гɱ�"+i.getHoldingcost());
			//Ͷ��������
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
		
		//��������
		InverstDao id= new InverstDaoImpl();
		//���ؽ��
		return id.selectInverstMark();
	}
	
	//ɾ����Ϣ�ķ���
		public int delinfo(int id) {
			int num =this.id.delfino(id);
			return num;
		}
	
}
