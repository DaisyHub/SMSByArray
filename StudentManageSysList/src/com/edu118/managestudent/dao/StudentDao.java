package com.edu118.managestudent.dao;

import java.util.Scanner;

import com.edu118.managestudent.bean.StudentBean;
import com.edu118.managestudent.interf.IManageStu;

public class StudentDao implements IManageStu {
	Scanner scan = new Scanner(System.in);
	int len = DBCenter.students.size();

	@Override
	public void insert(StudentBean stu) {
		// ��ѧ��id��������������ӵ�DBCenter.students��
		System.out.println("-------------���ѧ��-----------");
		System.out.println("������ѧ����ѧ�ţ�");
		String id = scan.nextLine();
		System.out.println("������ѧ����������");
		String name = scan.nextLine();
		System.out.println("������ѧ�������䣺");
		int age = scan.nextInt();
		DBCenter.students.add(new StudentBean(id, name, age));
		System.out.println("��ӳɹ�");

	}

	@Override
	public void delete(String id) {
		// ��ʾ����ѧ������Ϣ��Ȼ�����idɾ��
		System.out.println("-------------ɾ��ѧ��-----------");
		searchAll();
		System.out.println("ѡ��Ҫɾ����ѧ��id��");
		id = scan.nextLine();
//		System.out.println("ȷ���Ƿ�Ҫɾ��(Y/N)");
//		String sure = scan.next();

		for (int i = 0; i < len; i++) {
			if (id.equals(DBCenter.students.get(i).getId())) {
				DBCenter.students.remove(i);
				System.out.println("ɾ��ѧ���ɹ�");
				break;
			} else {
				System.out.println("û��ɾ��");
				break;
			}

		}

		// searchAll();
	}

	@Override
	public void modify(String id) {
		// ����ʾ����ѧ��������id�������ҵ������µ��������������ԭ���ģ������޸�id
		System.out.println("-------------�޸�ѧ��-----------");
		searchAll();
		System.out.println("����Ҫ�޸ĵ�ѧ����id:");
		id = scan.nextLine();
		for (int i = 0; i < len; i++) {
			if (id.equals(DBCenter.students.get(i).getId())) {
				System.out.println("ѧ��\t����\t����");
				System.out.print(DBCenter.students.get(i).getId() + "\t");
				System.out.print(DBCenter.students.get(i).getStuName() + "\t");
				System.out.println(DBCenter.students.get(i).getAge());
				System.out.println("�����µ�ѧ������:");
				String name = scan.nextLine();
				System.out.println("�����µ�ѧ������:");
				int age = scan.nextInt();
				DBCenter.students.get(i).setStuName(name);
				DBCenter.students.get(i).setAge(age);
				System.out.println("�޸ĳɹ�");
			}
		}
		searchAll();

	}

	public void searchAll() {
		// ����DBCenter�е�����
		System.out.println("ѧ��\t����\t����");
		for (int i = 0; i < len; i++) {
			System.out.print(DBCenter.students.get(i).getId() + "\t");
			System.out.print(DBCenter.students.get(i).getStuName() + "\t");
			System.out.println(DBCenter.students.get(i).getAge());
		}

	}

}
