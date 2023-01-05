package com.dmu.driver;

import java.util.Scanner;

import com.dmu.controller.AdminController;

public class AdminDriver {
	AdminController adminController = new AdminController();
	Scanner read = new Scanner(System.in);

	public AdminDriver() {
		System.out.println("Admin Related choices");
		System.out.println("1. Create new Admin");
		System.out.println("2. Find Admin by id");
		System.out.println("3. List all Admins");
		System.out.println("4. List all parks under Admin");
		System.out.println("5. Update Admin");
		System.out.println("6. Delete Admin");
		switch (read.nextInt()) {
		case 1: {
			adminController.addAdmin();
			break;
		}
		case 2: {
			adminController.findAdminById();
			break;
		}
		case 3: {
			adminController.listAllAdmins();
			break;
		}
		case 4: {
			adminController.listParksUnderAdmin();
			break;
		}
		case 5: {
			adminController.updateAdmin();
			break;
		}
		case 6: {
			adminController.deleteAdmin();
			break;

		}
		default:
			System.out.println("Invalid Choice...");
			break;
		}
	}

}
