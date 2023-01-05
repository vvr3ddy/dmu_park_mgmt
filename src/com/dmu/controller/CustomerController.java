package com.dmu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dmu.entities.Address;
import com.dmu.entities.Booking;
import com.dmu.entities.Customer;
import com.dmu.service.AddressService;
import com.dmu.service.BookingService;
import com.dmu.service.CustomerService;
import com.dmu.serviceImpl.AddressServiceImpl;
import com.dmu.serviceImpl.BookingServiceImpl;
import com.dmu.serviceImpl.CustomerServiceImpl;

public class CustomerController {
	CustomerService customerService = new CustomerServiceImpl();
	BookingService bookingService = new BookingServiceImpl();
	AddressService addressService = new AddressServiceImpl();
	Scanner read = new Scanner(System.in);

	public void deleteCustomer() {
		System.out.println("Enter customer id to delete:");
		Integer customerId = read.nextInt();
		System.out.println(customerService.deleteCustomer(customerId));
	}

	public void findCustomerById() {
		Customer customer = customerService.findCustomerById(read.nextInt());
		System.out.println(customer);
	}

	public void listAllCustomers() {
		List<Customer> customers = customerService.listAllCustomers();
		customers.forEach(System.out::println);
	}

	public void saveCustomer() {
		Customer customer = new Customer();
		List<Booking> bookings = new ArrayList<>();
		System.out.println("Enter customer id:");
		customer.setCustomerId(read.nextInt());
		read.nextLine();
		System.out.println("Enter customer Name:");
		customer.setCustomerName(read.nextLine());
		System.out.println("Enter customer contact number:");
		customer.setContactNumber(read.nextLine());
		System.out.println("Enter Customer email id:");
		customer.setEmailid(read.nextLine());
		System.out.println("Enter customer postcode:");
		String postCode = read.nextLine();
		Address address = addressService.findAddressByPostCode(postCode);
		if (address == null) {
			System.out.println("Customer address not found.");
		} else {
			System.out.println("Added customer address");
			customer.setAddress(address);
			System.out.println("Enter customer booking details:");
			do {
				System.out.println("Enter booking id");
				String bookingId = read.nextLine();
				Booking booking = bookingService.findBookingById(bookingId);
				if (booking != null) {
					bookings.add(booking);
					System.out.println("Booking added successfully");
				} else {
					System.out.println("Booking not found!!!");
				}
				System.out.println("Do you wish to add more bookings[Y/n]:");
			} while (!read.nextLine().equalsIgnoreCase("N"));
			customer.setCustomerBookings(bookings);
			customerService.saveCustomer(customer);
		}
	}

	public void updateCustomer() {
		Integer customerId = read.nextInt();
		read.nextLine();
		Customer customer = customerService.findCustomerById(customerId);
		if (customer != null) {
			System.out.println("Customer found in records!");
			System.out.println("Enter customer name:");
			customer.setCustomerName(read.nextLine());
			System.out.println("Enter customer email:");
			customer.setEmailid(read.nextLine());
			System.out.println("Enter customer contact number:");
			customer.setContactNumber(read.nextLine());
			System.out.println("Enter customer post code");
			String postcode = read.nextLine();
			Address address = addressService.findAddressByPostCode(postcode);
			if (address != null) {
				System.out.println("Updating customer details");
				customer.setAddress(address);
				customerService.updateCustomer(customerId, customer);
			} else {
				System.out.println("Unable to find postcode in records.");
			}
		} else {
			System.out.println("Customer not found in records");
		}

	}
}
