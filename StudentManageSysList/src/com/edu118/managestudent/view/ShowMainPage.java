package com.edu118.managestudent.view;

import java.util.Scanner;

import com.edu118.managestudent.bean.StudentBean;
import com.edu118.managestudent.dao.StudentDao;

public class ShowMainPage {
	int number = 0;
	Scanner sc = new Scanner(System.in);

	private void showPage() {
		System.out.println("**************************");

		System.out.println("1.添加学生");
		System.out.println("2.删除学生");
		System.out.println("3.修改学生");
		System.out.println("4.查找学生");
		System.out.println("5.退出");
		System.out.println("请选择1-5选项进行操作:");

		number = sc.nextInt();

	}

	public void handleStu() {
		while (true) {
			showPage();
			StudentBean stu = new StudentBean();
			String id = stu.getId();
			StudentDao studentDao = new StudentDao();
			if (number > 0 && number < 6) {// 判断数字是否合适
				switch (number) {
				case 1:
					studentDao.insert(stu);
					break;
				case 2:
					studentDao.delete(id);
					break;
				case 3:
					studentDao.modify(id);
					break;
				case 4:
					System.out.println("-------------显示所有学生-----------");
					studentDao.searchAll();
					break;
				case 5:
					//
					// flag = false;
				}
			} else {
				System.out.println("不在范围，请重新输入");
			}
		}
	}
}
