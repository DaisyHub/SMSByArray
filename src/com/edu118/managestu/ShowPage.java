package com.edu118.managestu;

import java.util.Scanner;

import com.edu118.been.Student;

public class ShowPage {
	int number = 0;
	public static int count = 0;
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
		ManageStu manageStu = new ManageStu();
		Student stu = new Student();
		// String name = stu.getStuName();
		String id = stu.getId();
		boolean flag = true;

		while (flag) {// ����ѭ��
			showPage();
			if (number > 0 && number < 6) {// �ж������Ƿ����
				switch (number) {
				case 1:
					manageStu.insert(stu);
					// try {
					// Thread.sleep(5000);// ����5s�����
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
				System.out.println("���ڷ�Χ������������");
			}

		}
		sc.close();
	}

}
