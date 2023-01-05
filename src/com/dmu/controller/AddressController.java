package com.dmu.controller;

import java.util.List;
import java.util.Scanner;

import com.dmu.entities.Address;
import com.dmu.service.AddressService;
import com.dmu.serviceImpl.AddressServiceImpl;

public class AddressController {
	AddressService addressService = new AddressServiceImpl();
	Scanner read = new Scanner(System.in);

	public void addAddress() {
		System.out.println("Adding a new address to records");
		Address address = new Address();
		System.out.println("Door Number:");
		address.setDoorNumber(read.nextInt());
		read.nextLine();
		System.out.println("Street Address:");
		address.setStreetAddress(read.nextLine());
		System.out.println("Street Address 2:");
		address.setStreetAddress2(read.nextLine());
		System.out.println("Post Code:");
		address.setPostCode(read.nextLine());
		System.out.println(addressService.saveAddress(address));
	}

	public void findAddressByPostCode() {
		System.out.println("Enter the post code to search:");
		String postCode = read.nextLine();
		System.out.println(addressService.findAddressByPostCode(postCode));
	}

	public void listAllAddresses() {
		List<Address> addresses = addressService.listAllAddresses();
		System.out.println("All addresses available in the record");
		addresses.forEach(System.out::println);
	}

	public void updateAddress() {
		System.out.println("Enter the address postcode to update:");
		String postCode = read.nextLine();
		Address address = addressService.findAddressByPostCode(postCode);
		if (address != null) {
			System.out.println("Door Number:");
			address.setDoorNumber(read.nextInt());
			read.nextLine();
			System.out.println("Street Address 1:");
			address.setStreetAddress(read.nextLine());
			System.out.println("Street Address 2:");
			address.setStreetAddress(read.nextLine());
			System.out.println("Post Code:");
			address.setPostCode(read.nextLine());
			System.out.println(addressService.updateAddress(postCode, address));
		} else {
			System.out.println("Address not found in records!!");
		}
	}
}
