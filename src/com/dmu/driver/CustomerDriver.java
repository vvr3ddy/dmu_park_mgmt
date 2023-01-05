package com.dmu.driver;

import java.util.Scanner;

import com.dmu.controller.CustomerController;

public class CustomerDriver {
	CustomerController customerController = new CustomerController();
	Scanner read = new Scanner(System.in);

	public CustomerDriver() {
		System.out.println("Customer Related choices");
		System.out.println("1. Create new Customer");
		System.out.println("2. Find customer by id");
		System.out.println("3. List all customers");
		System.out.println("4. Update customer");
		System.out.println("5. Delete customer");
		System.out.println("Make a selection to continue");
		switch (read.nextInt()) {
		case 1: {
			customerController.saveCustomer();
			break;
		}
		case 2: {
			customerController.findCustomerById();
			break;
		}
		case 3: {
			customerController.listAllCustomers();
			break;
		}
		case 4: {
			customerController.updateCustomer();
			break;
		}
		case 5: {
			customerController.deleteCustomer();
			break;
		}
		default: {
			System.out.println("Invalid choice!!!");
			break;
		}

		}
	}

}
