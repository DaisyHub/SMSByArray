package com.edu118.managestudent.dao;

import com.edu118.managestudent.bean.AdminBean;

public class AdminDao {
	// ÑéÖ¤µÇÂ¼
	public boolean login(AdminBean adminBean) {

		// inputInfor();

		for (AdminBean admin : DBCenter.admins) {
			if (adminBean.getName().equals(admin.getName()) &&
					adminBean.getPassword().equals(admin.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
