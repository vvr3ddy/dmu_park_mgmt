package com.dmu.serviceImpl;

import java.util.List;

import com.dmu.entities.Admin;
import com.dmu.entities.Park;
import com.dmu.repo.AdminRepo;
import com.dmu.repoImpl.AdminRepoImpl;
import com.dmu.service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminRepo adminRepo = new AdminRepoImpl();

	@Override
	public String addAdmin(Admin admin) {
		return adminRepo.addAdmin(admin);
	}

	@Override
	public String addParkToAdmin(String parkId, String adminId) {
		return adminRepo.addParkToAdmin(parkId, adminId);
	}

	@Override
	public String deleteAdmin(Admin admin) {
		return adminRepo.deleteAdmin(admin);
	}

	@Override
	public Admin findAdminById(String adminId) {
		return adminRepo.findAdminById(adminId);
	}

	@Override
	public List<Admin> listAllAdmins() {
		return adminRepo.listAllAdmins();
	}

	@Override
	public List<Park> listParksUnderAdmin(Admin admin) {
		return adminRepo.listParksUnderAdmin(admin);
	}

	@Override
	public String updateAdmin(String adminId, Admin admin) {
		return adminRepo.updateAdmin(adminId, admin);
	}

}
