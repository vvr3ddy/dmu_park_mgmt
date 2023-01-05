package com.dmu.utility;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Booking;

public class BookingRepository {
	private static BookingRepository bookingRepository = new BookingRepository();
	private static List<Booking> bookingList = new ArrayList<>();

	private BookingRepository() {

	}

	public BookingRepository getBookingRepository() {
		return bookingRepository;
	}

	public static List<Booking> getBookingList() {
		return bookingList;
	}

	public static void setBookingList(List<Booking> bookingList) {
		BookingRepository.bookingList = bookingList;
	}

}
