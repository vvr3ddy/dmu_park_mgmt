package com.dmu.driver;

import java.util.Scanner;

import com.dmu.controller.ParkController;

public class ParkDriver {
	ParkController parkController = new ParkController();
	Scanner read = new Scanner(System.in);

	public ParkDriver() {
		System.out.println("Park Related Choices");
		System.out.println("1. Create New Park");
		System.out.println("2. Find Park by id");
		System.out.println("3. Add employees to park");
		System.out.println("4. List all Parks");
		System.out.println("5. List all Employees of a park");
		System.out.println("6. Update a park");
		System.out.println("7. Delete a park");
		System.out.println("Enter your choice");
		switch (read.nextInt()) {
		case 1: {
			parkController.savePark();
			break;
		}
		case 2: {
			parkController.findParkById();
			break;
		}
		case 3: {
			parkController.addEmployeeToPark();
			break;
		}
		case 4: {
			parkController.listAllParks();
			break;
		}
		case 5: {
			parkController.listAllParkEmployees();
			break;
		}
		case 6: {
			parkController.updatePark();
			break;
		}
		case 7: {
			parkController.deletePark();
			break;
		}
		default: {
			System.out.println("Invalid choice!!!");
			break;
		}
		}
	}
}
