package com.edu118.managestudent;

import java.util.Scanner;

import com.edu118.managestudent.bean.AdminBean;
import com.edu118.managestudent.dao.AdminDao;
import com.edu118.managestudent.view.ShowMainPage;

public class Main {
	public static void main(String[] args) {

		int i = 3;
		while (i != 0) {

			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String password = sc.nextLine();

			boolean isLogin = new AdminDao().login(new AdminBean(name, password));
			if(isLogin){
				System.out.println("登录成功");
				//进入主页面
				new ShowMainPage().handleStu();
			}else{
				System.out.println("用户名或密码错误，你还有"+--i+"次机会");
			}
		}
	}
}
