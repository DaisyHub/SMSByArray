package com.edu118.managestudent.bean;

public class AdminBean {
	private String name;
	private String password;
	
	
	public AdminBean() {}
	public AdminBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
