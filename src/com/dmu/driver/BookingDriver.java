package com.dmu.driver;

import java.text.ParseException;
import java.util.Scanner;

import com.dmu.controller.BookingController;

public class BookingDriver {
	BookingController bookingController = new BookingController();
	Scanner read = new Scanner(System.in);

	public BookingDriver() throws ParseException {
		System.out.println("Booking Related choices");
		System.out.println("1. Create booking");
		System.out.println("2. Find booking by id");
		System.out.println("3. List all bookings");
		System.out.println("4. List Bookings by customer");
		System.out.println("5. Update booking");
		System.out.println("6. Delete booking");
		switch (read.nextInt()) {
		case 1: {
			bookingController.saveBooking();
			break;
		}
		case 2: {
			bookingController.findBookingById();
			break;
		}
		case 3: {
			bookingController.listAllBookings();
			break;
		}
		case 4: {
			bookingController.listBookingsByCustomer();
			break;
		}
		case 5: {
			bookingController.updateBooking();
			break;
		}
		case 6: {
			bookingController.deleteBooking();
			break;
		}
		default: {
			System.out.println("Invalid choice!!!");
			break;
		}

		}
	}
}
