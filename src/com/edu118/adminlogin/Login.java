package com.edu118.adminlogin;

import java.util.Scanner;

import com.edu118.managestu.ManageStu;

public class Login {
	/*
	 * 1.�����û��������� 2.�ж��Ƿ���� 3.�����ڣ��������ģ�飻�����ڣ��ظ��������ܵ�¼
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
				System.out.println("�û������������������" + (2 - i) + "�λ���");
			}
		}

	}

	private void inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		name1 = sc.nextLine();
		System.out.println("���������룺");
		password1 = sc.nextLine();
	}
}
