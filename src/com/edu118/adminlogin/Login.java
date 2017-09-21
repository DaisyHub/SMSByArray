package com.edu118.adminlogin;

import java.util.Scanner;

import com.edu118.managestu.ManageStu;

public class Login {
	/*
	 * 1.输入用户名与密码 2.判断是否存在 3.若存在，进入管理模块；不存在，重复三次则不能登录
	 */
	String name1 = null;
	String password1 = null;

	public void login(String name, String password) {

		for (int i = 0; i < 3; i++) {
			inputInfor();
			if ((name1.equals(name)) && (password1.equals(password))) {
				new ManageStu();
				break;
			} else {
				System.out.println("用户名或密码错误，您还有" + (2 - i) + "次机会");
			}
		}

	}

	private void inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		name1 = sc.nextLine();
		System.out.println("请输入密码：");
		password1 = sc.nextLine();
	}
}
