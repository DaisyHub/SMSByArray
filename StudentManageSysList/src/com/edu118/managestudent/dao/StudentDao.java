package com.edu118.managestudent.dao;

import java.util.Scanner;

import com.edu118.managestudent.bean.StudentBean;
import com.edu118.managestudent.interf.IManageStu;

public class StudentDao implements IManageStu {
	Scanner scan = new Scanner(System.in);
	int len = DBCenter.students.size();

	@Override
	public void insert(StudentBean stu) {
		// 将学生id、姓名，年龄添加到DBCenter.students中
		System.out.println("-------------添加学生-----------");
		System.out.println("输入新学生的学号：");
		String id = scan.nextLine();
		System.out.println("输入新学生的姓名：");
		String name = scan.nextLine();
		System.out.println("输入新学生的年龄：");
		int age = scan.nextInt();
		DBCenter.students.add(new StudentBean(id, name, age));
		System.out.println("添加成功");

	}

	@Override
	public void delete(String id) {
		// 显示所有学生的信息，然后根据id删除
		System.out.println("-------------删除学生-----------");
		searchAll();
		System.out.println("选择要删除的学生id：");
		id = scan.nextLine();
//		System.out.println("确认是否要删除(Y/N)");
//		String sure = scan.next();

		for (int i = 0; i < len; i++) {
			if (id.equals(DBCenter.students.get(i).getId())) {
				DBCenter.students.remove(i);
				System.out.println("删除学生成功");
				break;
			} else {
				System.out.println("没有删除");
				break;
			}

		}

		// searchAll();
	}

	@Override
	public void modify(String id) {
		// 先显示所有学生，根据id遍历，找到后用新的姓名和年龄替代原来的，不能修改id
		System.out.println("-------------修改学生-----------");
		searchAll();
		System.out.println("输入要修改的学生的id:");
		id = scan.nextLine();
		for (int i = 0; i < len; i++) {
			if (id.equals(DBCenter.students.get(i).getId())) {
				System.out.println("学号\t姓名\t年龄");
				System.out.print(DBCenter.students.get(i).getId() + "\t");
				System.out.print(DBCenter.students.get(i).getStuName() + "\t");
				System.out.println(DBCenter.students.get(i).getAge());
				System.out.println("输入新的学生姓名:");
				String name = scan.nextLine();
				System.out.println("输入新的学生年龄:");
				int age = scan.nextInt();
				DBCenter.students.get(i).setStuName(name);
				DBCenter.students.get(i).setAge(age);
				System.out.println("修改成功");
			}
		}
		searchAll();

	}

	public void searchAll() {
		// 遍历DBCenter中的数据
		System.out.println("学号\t姓名\t年龄");
		for (int i = 0; i < len; i++) {
			System.out.print(DBCenter.students.get(i).getId() + "\t");
			System.out.print(DBCenter.students.get(i).getStuName() + "\t");
			System.out.println(DBCenter.students.get(i).getAge());
		}

	}

}
