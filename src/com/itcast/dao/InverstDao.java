
package com.itcast.dao;

import java.util.List;

import com.itcast.bean.Inverst;

public interface InverstDao {
	
	List<Inverst> selectInverstMark();
	
	int selectCount();
	
	int inpuinputInverstMessage(Inverst i);
	
	Inverst selectMaxIdInfo();
	
	int delfino(int id);
	

}
