package com.edu118.been;

public class Student {
	//id, stu_name, age
	private String id;
	private String stuName;
	private int age;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setDomain(String stuName){
		this.stuName = stuName;
	}
	public String getStuName(){
		return stuName;
	}
	public Student(){}
	public Student(String id, String stuName, int age){
		this.id = id;
		this.stuName = stuName;
		this.age = age;
	}
}
