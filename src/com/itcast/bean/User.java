package com.itcast.bean;

public class User {
	


	private int userid;
	private String username;
	private String pwd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String username, String pwd) {
		super();
		this.userid = userid;
		this.username = username;
		this.pwd = pwd;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
