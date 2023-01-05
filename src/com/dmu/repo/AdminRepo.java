package com.dmu.repo;

import java.util.List;

import com.dmu.entities.Admin;
import com.dmu.entities.Park;

public interface AdminRepo {
	public String addAdmin(Admin admin);

	public String addParkToAdmin(String parkId, String adminId);

	public String deleteAdmin(Admin admin);

	public Admin findAdminById(String adminId);

	public List<Admin> listAllAdmins();

	public List<Park> listParksUnderAdmin(Admin admin);

	public String updateAdmin(String adminId, Admin admin);
}
