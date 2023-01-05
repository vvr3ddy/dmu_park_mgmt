package com.dmu.repoImpl;

import java.util.List;

import com.dmu.entities.Admin;
import com.dmu.entities.Park;
import com.dmu.repo.AdminRepo;
import com.dmu.utility.AdminRepository;
import com.dmu.utility.ParkRepository;

public class AdminRepoImpl implements AdminRepo {
	List<Admin> adminList = AdminRepository.getAdminList();

	@Override
	public String addAdmin(Admin admin) {
		if (!adminList.contains(admin)) {
			adminList.add(admin);
			return "Admin added successfully!!";
		}
		return "Admin already exists";
	}

	@Override
	public String addParkToAdmin(String parkId, String adminId) {
		Admin admin = adminList.stream().filter(a -> a.getAdminId().equals(adminId)).findFirst().orElse(null);
		if (admin != null) {
			Park park = ParkRepository.getParkList().stream().filter(p -> p.getParkId().equals(parkId)).findFirst()
					.orElse(null);
			if (park != null) {
				admin.getAllParks().add(park);
				return "Park assigned to admin successfully!";
			}
			return "Park does not exist in records!!";
		}
		return "Admin does not exist in records!!";
	}

	@Override
	public String deleteAdmin(Admin admin) {
		for (Admin a : adminList) {
			if (a.equals(admin)) {
				adminList.remove(a);
				return "Admin Removed successfully";
			}
		}
		return "Admin does not exist in records";
	}

	@Override
	public Admin findAdminById(String adminId) {
		for (Admin a : adminList) {
			if (a.getAdminId().equals(adminId)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Admin> listAllAdmins() {
		return adminList;
	}

	@Override
	public List<Park> listParksUnderAdmin(Admin admin) {
		for (Admin a : adminList) {
			if (a.equals(admin))
				return a.getAllParks();
		}
		return null;
	}

	@Override
	public String updateAdmin(String adminId, Admin admin) {
		for (int i = 0; i < adminList.size(); i++) {
			if (adminList.get(i).getAdminId().equals(adminId)) {
				adminList.set(i, admin);
				return "Admin updated successfully";
			}
		}
		return "Admin not found in records";
	}

}
