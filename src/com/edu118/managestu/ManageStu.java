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
		 * 1.������Ϣ 3.����Ϣ���뵽Student[]����
		 */
		int age = 0;

		System.out.println("������id������������:");
		String id = sc.nextLine();
		String stuName = sc.nextLine();// NoSuchElementException
		String data = sc.nextLine();
		age = Integer.parseInt(data);
		stu = new Student(id, stuName, age);

		// �����������

		Test.students[ShowPage.count] = stu;
		System.out.println("ѧ����Ϣ��ӳɹ�");

		// sc.close();
		// ��β����ò���������������е����� ����public static final����
		// ���Կ��Ƿ��ܴ������еõ�ѧ������Ϣ
		// System.out.println("ѧ�ţ�" + Test.students[ShowPage.count].getId());
		// System.out.println("������" +
		// Test.students[ShowPage.count].getStuName());
		// System.out.println("���䣺" + Test.students[ShowPage.count].getAge());
	}

	@Override
	public void delete(String id) {
		/*
		 * ���ݻ�ȡ��idȥɾ����ѧ�� 1.�Ӽ�������id
		 * 2.�������б������Ҹ�id�����Ҳ�������ʾû�и�ѧ�������ҵ�������λ�õ�Student����ֵnull(�൱��ɾ��)
		 */
		System.out.println("������Ҫɾ����ѧ����id:");
		id = sc.nextLine();
		for (int i = 0; i < ShowPage.count; i++) {
			try {
				if (id.equals(Test.students[i].getId())) {// bug:idû�д�����Ψһ
					// �ҵ��˾ͽ��ö����ʼ��Ϊnull
					Test.students[i] = null;
					System.out.println("��ɾ��");
				}
			} catch (NullPointerException e) {
				System.out.println("û������ˣ��ǲ��ǼǴ���");
				new ShowPage().handleStu();
			}
		}

	}

	@Override
	public void modify(String id) {
		//���ҵ���ѧ�����ڵ�λ�ã���ԭ������Ϣ�滻������Ϣ
		
		
	}

	@Override
	public void search(String id) {
		// ͨ��ѧ��id����ѧ����Ϣ
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�ѧ��id:");
		id = sc.nextLine();
		try {
			for (int i = 0; i < Test.students.length; i++) {
				if (id.equals(Test.students[i].getId())) {// NullPointerException

					System.out.println("idΪ" + Test.students[i].getId() + "��ѧ��������" + Test.students[i].getStuName());
					System.out.println("idΪ" + Test.students[i].getId() + "��ѧ�����䣺" + Test.students[i].getAge());
					break;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("�Ҳ�����ѧ������Ϣ");
		}
	}
}
