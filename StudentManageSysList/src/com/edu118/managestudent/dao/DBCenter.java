package com.edu118.managestudent.dao;

import java.util.ArrayList;
import java.util.List;

import com.edu118.managestudent.bean.AdminBean;
import com.edu118.managestudent.bean.StudentBean;

public class DBCenter {
	public static List<AdminBean> admins = new ArrayList<>();
	public static List<StudentBean> students = new ArrayList<>();
	
	static{
		admins.add(new AdminBean("admin1", "hz"));
		admins.add(new AdminBean("admin2", "hz"));
		admins.add(new AdminBean("admin3", "hz"));	
		
		students.add(new StudentBean("111", "coco",18));
		students.add(new StudentBean("112", "Jane",24));
		students.add(new StudentBean("113", "sherlock",29));
	}
}
