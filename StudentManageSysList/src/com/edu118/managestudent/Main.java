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
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String password = sc.nextLine();

			boolean isLogin = new AdminDao().login(new AdminBean(name, password));
			if(isLogin){
				System.out.println("��¼�ɹ�");
				//������ҳ��
				new ShowMainPage().handleStu();
			}else{
				System.out.println("�û�������������㻹��"+--i+"�λ���");
			}
		}
	}
}
