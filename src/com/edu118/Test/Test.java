package com.edu118.Test;

import com.edu118.adminlogin.Login;
import com.edu118.been.Admin;
import com.edu118.been.Student;
import com.edu118.managestu.ShowPage;

public class Test {

	public static final Student[] students = new Student[100];
	// 存放学生信息
	
	public static void main(String[] args) {
		/*
		 * 1.登录模块 2.操作模块
		 */
		Admin admin1 = new Admin("daisy", "hz");
		// Admin admin2 = new Admin("atom", "me");
		// Admin[] admins = new Admin[]{admin1, admin2};

		new Login().login(admin1.getName(), admin1.getPassword());

		ShowPage page = new ShowPage();
		page.handleStu();


	}
}
