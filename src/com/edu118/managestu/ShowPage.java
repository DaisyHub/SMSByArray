package com.edu118.managestu;

import java.util.Scanner;

import com.edu118.been.Student;

public class ShowPage {
	int number = 0;
	public static int count = 0;
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
		ManageStu manageStu = new ManageStu();
		Student stu = new Student();
		// String name = stu.getStuName();
		String id = stu.getId();
		boolean flag = true;

		while (flag) {// 无限循环
			showPage();
			if (number > 0 && number < 6) {// 判断数字是否合适
				switch (number) {
				case 1:
					manageStu.insert(stu);
					// try {
					// Thread.sleep(5000);// 休眠5s后继续
					// } catch (InterruptedException e) {
					// e.printStackTrace();
					// }
					count++;
					break;
				case 2:
					manageStu.delete(id);
					break;
				case 3:
					manageStu.modify(id);
					break;
				case 4:
					manageStu.search(id);
					break;
				case 5:
					//
					// flag = false;
				}
			} else {
				System.out.println("不在范围，请重新输入");
			}

		}
		sc.close();
	}

}
