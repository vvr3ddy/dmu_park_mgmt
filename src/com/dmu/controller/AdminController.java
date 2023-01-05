package com.dmu.controller;

import java.util.List;
import java.util.Scanner;

import com.dmu.entities.Admin;
import com.dmu.entities.Park;
import com.dmu.service.AdminService;
import com.dmu.serviceImpl.AdminServiceImpl;

public class AdminController {
	AdminService adminService = new AdminServiceImpl();
	Scanner read = new Scanner(System.in);

	public void addAdmin() {
		String parkId;
		System.out.println("=====================");
		System.out.println(" Creating new admin");
		System.out.println("=====================");
		Admin admin = new Admin();
		System.out.println("Admin id:");
		admin.setAdminId(read.nextLine());
		System.out.println("Admin Name:");
		admin.setFullName(read.nextLine());
		System.out.println("Admin Email:");
		admin.setEmailId(read.nextLine());
		System.out.println("Adding Parks to Admin...");
		do {
			parkId = read.nextLine();
			addParkToAdmin(parkId, admin.getAdminId());
			System.out.println("Continue? [Y/n]:");
		} while (read.nextLine().charAt(0) != 'n' || read.nextLine().charAt(0) != 'N');
		adminService.addAdmin(admin);
	}

	public void addParkToAdmin(String parkId, String adminId) {
		System.out.println(adminService.addParkToAdmin(parkId, adminId));
	}

	public void deleteAdmin() {
		System.out.println("Enter admin Id to delete:");
		String adminId = read.nextLine();
		Admin admin = adminService.findAdminById(adminId);
		if (admin != null) {
			System.out.println(adminService.deleteAdmin(admin));
		} else {
			System.out.println("Admin does not exist in records");
		}
	}

	public void findAdminById() {
		System.out.println("Enter admin id:");
		String adminId = read.nextLine();
		System.out.println(adminService.findAdminById(adminId));
	}

	public void listAllAdmins() {
		System.out.println("List of all admins:");
		List<Admin> admins = adminService.listAllAdmins();
		for (Admin a : admins) {
			System.out.println(a.getAdminId() + ": " + a.getFullName());
		}
	}

	public void listParksUnderAdmin() {
		System.out.println("Admin ID:");
		String adminId = read.nextLine();
		Admin admin = adminService.findAdminById(adminId);
		List<Park> parkList = adminService.listParksUnderAdmin(admin);
		System.out.println("List of Parks under " + admin.getFullName());
		parkList.forEach(System.out::println);

	}

	public void updateAdmin() {
		System.out.println("Enter the admin id to change:");
		String adminId = read.nextLine();
		Admin admin = adminService.findAdminById(adminId);
		System.out.println("Enter updated details");
		System.out.println("Admin Name:");
		admin.setFullName(read.nextLine());
		System.out.println("Admin Email:");
		admin.setEmailId(read.nextLine());
		System.out.println(adminService.updateAdmin(adminId, admin));
	}
}
