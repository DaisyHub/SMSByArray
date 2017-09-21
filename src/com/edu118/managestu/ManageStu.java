package com.edu118.managestu;

import java.util.Scanner;

import com.edu118.Test.Test;
import com.edu118.been.Student;
import com.edu118.interf.IManageStu;

public class ManageStu implements IManageStu {

	Scanner sc = new Scanner(System.in);

	@Override
	public void insert(Student stu) {
		/*
		 * 1.输入信息 3.将信息插入到Student[]数组
		 */
		int age = 0;

		System.out.println("请输入id、姓名和年龄:");
		String id = sc.nextLine();
		String stuName = sc.nextLine();// NoSuchElementException
		String data = sc.nextLine();
		age = Integer.parseInt(data);
		stu = new Student(id, stuName, age);

		// 存放在数组中

		Test.students[ShowPage.count] = stu;
		System.out.println("学生信息添加成功");

		// sc.close();
		// 如何才能让测试类访问其它类中的数组 ：用public static final修饰
		// 测试看是否能从数组中得到学生的信息
		// System.out.println("学号：" + Test.students[ShowPage.count].getId());
		// System.out.println("姓名：" +
		// Test.students[ShowPage.count].getStuName());
		// System.out.println("年龄：" + Test.students[ShowPage.count].getAge());
	}

	@Override
	public void delete(String id) {
		/*
		 * 根据获取的id去删除该学生 1.从键盘输入id
		 * 2.在数组中遍历查找该id：若找不到，提示没有该学生；若找到，将该位置的Student对象赋值null(相当于删除)
		 */
		System.out.println("输入你要删除的学生的id:");
		id = sc.nextLine();
		for (int i = 0; i < ShowPage.count; i++) {
			try {
				if (id.equals(Test.students[i].getId())) {// bug:id没有处理，不唯一
					// 找到了就将该对象初始化为null
					Test.students[i] = null;
					System.out.println("已删除");
				}
			} catch (NullPointerException e) {
				System.out.println("没有这个人，是不是记错了");
				new ShowPage().handleStu();
			}
		}

	}

	@Override
	public void modify(String id) {
		//先找到该学生所在的位置，将原来的信息替换成新信息
		
		
	}

	@Override
	public void search(String id) {
		// 通过学生id查找学生信息
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的学生id:");
		id = sc.nextLine();
		try {
			for (int i = 0; i < Test.students.length; i++) {
				if (id.equals(Test.students[i].getId())) {// NullPointerException

					System.out.println("id为" + Test.students[i].getId() + "的学生姓名：" + Test.students[i].getStuName());
					System.out.println("id为" + Test.students[i].getId() + "的学生年龄：" + Test.students[i].getAge());
					break;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("找不到该学生的信息");
		}
	}
}
