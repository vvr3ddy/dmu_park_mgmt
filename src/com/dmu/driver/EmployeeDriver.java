package com.dmu.driver;

import java.util.Scanner;

import com.dmu.controller.EmployeeController;

/**
 * 
 * @author <Update author name here>
 * @description Driver class for the Employee Entity. Menu driven Constructor
 *              which when invoked triggers the Employee Controller.
 *
 *
 */
public class EmployeeDriver {
	EmployeeController employeeController = new EmployeeController();
	Scanner read = new Scanner(System.in);

	public EmployeeDriver() {
		System.out.println("Employee Related Choices..");
		System.out.println("1. Add new employee");
		System.out.println("2. Add Park to Employee");
		System.out.println("3. List Employees");
		System.out.println("4. Find employee by id");
		System.out.println("5. Update employee");
		System.out.println("6. Delete Employee");
		System.out.println("Make your selection...");
		switch (read.nextInt()) {
		case 1: {
			employeeController.saveEmployee();
			break;
		}
		case 2: {
			employeeController.addParkToEmployee();
			break;
		}
		case 3: {
			employeeController.listAllEmployees();
			break;
		}
		case 4: {
			employeeController.fetchEmployeeById();
			break;
		}
		case 5: {
			employeeController.updateEmployee();
			break;
		}
		case 6: {
			employeeController.deleteEmployee();
			break;
		}
		default: {
			System.out.println("Invalid choice...");
			break;
		}
		}
	}

}
