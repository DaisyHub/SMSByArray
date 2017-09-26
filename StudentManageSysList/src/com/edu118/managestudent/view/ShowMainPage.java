package com.edu118.managestudent.view;

import java.util.Scanner;

import com.edu118.managestudent.bean.StudentBean;
import com.edu118.managestudent.dao.StudentDao;

public class ShowMainPage {
	int number = 0;
	Scanner sc = new Scanner(System.in);

	private void showPage() {
		System.out.println("**************************");

		System.out.println("1.���ѧ��");
		System.out.println("2.ɾ��ѧ��");
		System.out.println("3.�޸�ѧ��");
		System.out.println("4.����ѧ��");
		System.out.println("5.�˳�");
		System.out.println("��ѡ��1-5ѡ����в���:");

		number = sc.nextInt();

	}

	public void handleStu() {
		while (true) {
			showPage();
			StudentBean stu = new StudentBean();
			String id = stu.getId();
			StudentDao studentDao = new StudentDao();
			if (number > 0 && number < 6) {// �ж������Ƿ����
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
					System.out.println("-------------��ʾ����ѧ��-----------");
					studentDao.searchAll();
					break;
				case 5:
					//
					// flag = false;
				}
			} else {
				System.out.println("���ڷ�Χ������������");
			}
		}
	}
}
