package com.edu118.managestudent.interf;

import com.edu118.managestudent.bean.StudentBean;

public interface IManageStu {
	/*
	 * ÔöÉ¾¸Ä²é
	 */
	public abstract void insert(StudentBean stu);
	public abstract void delete(String id);
	public abstract void modify(String id);
	public abstract void searchAll();
}
