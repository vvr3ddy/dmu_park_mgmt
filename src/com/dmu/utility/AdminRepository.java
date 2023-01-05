package com.dmu.utility;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Admin;

public class AdminRepository {
	private AdminRepository adminRepository = new AdminRepository();
	private static List<Admin> adminList = new ArrayList<>();

	private AdminRepository() {

	}

	public static void setAdminList(List<Admin> adminList) {
		AdminRepository.adminList = adminList;
	}

	public static List<Admin> getAdminList() {
		return adminList;
	}

}
