package com.edu118.been;

public class Admin {
	private String name;
	private String password;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
	public Admin(String name, String password){
		this.name = name;
		this.password = password;
	}
}
