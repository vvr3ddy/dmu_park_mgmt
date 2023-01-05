package com.dmu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.dmu.entities.Booking;
import com.dmu.entities.Customer;
import com.dmu.service.BookingService;
import com.dmu.service.CustomerService;
import com.dmu.serviceImpl.BookingServiceImpl;
import com.dmu.serviceImpl.CustomerServiceImpl;

public class BookingController {
	BookingService bookingService = new BookingServiceImpl();
	CustomerService customerService = new CustomerServiceImpl();
	Scanner read = new Scanner(System.in);
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

	public void deleteBooking() {
		System.out.println("Enter booking Id to delete:");
		String bookingId = read.nextLine();
		System.out.println(bookingService.deleteBooking(bookingId));
	}

	public void findBookingById() {
		System.out.println("Enter booking Id to search:");
		String bookingId = read.nextLine();
		System.out.println(bookingService.findBookingById(bookingId));
	}

	public void listAllBookings() {
		List<Booking> bookingList = bookingService.listAllBookings();
		System.out.println("List of all bookings made so far:");
		bookingList.forEach(System.out::println);
	}

	public void listBookingsByCustomer() {
		System.out.println("Fetch Bookings made by customer:");
		Integer customerId = read.nextInt();
		Customer customer = customerService.findCustomerById(customerId);
		if (customer != null) {
			List<Booking> bookingsOfCustomer = bookingService.listBookingsByCustomer(customer);
			bookingsOfCustomer.forEach(System.out::println);
		} else {
			System.out.println("Customer does not exist in records!");
		}
	}

	public void saveBooking() throws ParseException {
		Booking booking = new Booking();
		System.out.println("Creating New Booking");
		System.out.println("Enter the booking id:");
		booking.setBookingId(read.nextLine());
		System.out.println("Enter the date of booking (dd-MMM-yyyy):");
		booking.setBookingDate(formatter.parse(read.nextLine()));
		System.out.println("Enter customer id:");
		Integer customerId = read.nextInt();
		Customer customer = customerService.findCustomerById(customerId);
		if (customer != null) {
			booking.setCustomer(customer);
			System.out.println("Number of tickets:");
			booking.setQuantity(read.nextInt());
			System.out.println(bookingService.saveBooking(booking));
		} else {
			System.out.println("Customer could not be verified!!");
		}
	}

	public void updateBooking() throws ParseException {
		String bookingId = read.nextLine();
		System.out.println("Updating booking details:");
		Booking booking = bookingService.findBookingById(bookingId);
		if (booking != null) {
			System.out.println("Enter booking Date:");
			booking.setBookingDate(formatter.parse(read.nextLine()));
			System.out.println("Enter quantity:");
			booking.setQuantity(read.nextInt());
			System.out.println(bookingService.updateBooking(bookingId, booking));
		}
		System.out.println("Booking could not be found in records!!");
	}
}
