package com.dmu.service;

import java.util.List;

import com.dmu.entities.Booking;
import com.dmu.entities.Customer;

public interface BookingService {
	public String deleteBooking(String bookingId);

	public Booking findBookingById(String bookingId);

	public List<Booking> listAllBookings();

	public List<Booking> listBookingsByCustomer(Customer customer);

	public String saveBooking(Booking booking);

	public String updateBooking(String bookingId, Booking booking);
}
