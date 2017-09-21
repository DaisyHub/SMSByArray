package com.edu118.interf;

import com.edu118.been.Student;

public interface IManageStu {
	/*
	 * ÔöÉ¾¸Ä²é
	 */
	public abstract void insert(Student stu);
	public abstract void delete(String id);
	public abstract void modify(String id);
	public abstract void search(String id);
}
