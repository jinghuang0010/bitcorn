package com.itcast.bean;

public class Inverst {
	
	private int id;
	private String inverstDate;
	private int inverstMoney;
	private int shopingNumber;
	private int sumNumber;
	private int sumInvertMoney;
	
	private int marketValue;
	private double increase;
	private int holdingcost;
	private String remark;
	private int value;
	
	public Inverst() {
		// TODO Auto-generated constructor stub
	}

	public Inverst(int id, String inverstDate, int inverstMoney,
			int shopingNumber, int sumNumber, int sumInvertMoney,
			int marketValue, double increase, int holdingcost, String remark,
			int value) {
		super();
		this.id = id;
		this.inverstDate = inverstDate;
		this.inverstMoney = inverstMoney;
		this.shopingNumber = shopingNumber;
		this.sumNumber = sumNumber;
		this.sumInvertMoney = sumInvertMoney;
		this.marketValue = marketValue;
		this.increase = increase;
		this.holdingcost = holdingcost;
		this.remark = remark;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInverstDate() {
		return inverstDate;
	}

	public void setInverstDate(String inverstDate) {
		this.inverstDate = inverstDate;
	}

	public int getInverstMoney() {
		return inverstMoney;
	}

	public void setInverstMoney(int inverstMoney) {
		this.inverstMoney = inverstMoney;
	}

	public int getShopingNumber() {
		return shopingNumber;
	}

	public void setShopingNumber(int shopingNumber) {
		this.shopingNumber = shopingNumber;
	}

	public int getSumNumber() {
		return sumNumber;
	}

	public void setSumNumber(int sumNumber) {
		this.sumNumber = sumNumber;
	}

	public int getSumInvertMoney() {
		return sumInvertMoney;
	}

	public void setSumInvertMoney(int sumInvertMoney) {
		this.sumInvertMoney = sumInvertMoney;
	}

	public int getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
	}

	public double getIncrease() {
		return increase;
	}

	public void setIncrease(double increase) {
		this.increase = increase;
	}

	public int getHoldingcost() {
		return holdingcost;
	}

	public void setHoldingcost(int holdingcost) {
		this.holdingcost = holdingcost;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
	
	
	
	
	
	

}
