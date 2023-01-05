package com.dmu.driver;

import java.util.Scanner;

import com.dmu.controller.AddressController;

public class AddressDriver {
	AddressController addressController = new AddressController();
	Scanner read = new Scanner(System.in);

	public AddressDriver() {
		System.out.println("Address Related Choices");
		System.out.println("1. Add new address");
		System.out.println("2. Find address by postcode");
		System.out.println("3. List all addresses");
		System.out.println("4. Update address");
		System.out.println("Enter your choice to proceed...");
		switch (read.nextInt()) {
		case 1: {
			addressController.addAddress();
			break;
		}
		case 2: {
			addressController.findAddressByPostCode();
			break;

		}
		case 3: {
			addressController.listAllAddresses();
			break;
		}
		case 4: {
			addressController.updateAddress();
			break;
		}
		default: {
			System.out.println("Invalid choice...");
			break;
		}
		}
	}

}
