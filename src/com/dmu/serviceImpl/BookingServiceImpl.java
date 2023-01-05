package com.dmu.serviceImpl;

import java.util.List;

import com.dmu.entities.Booking;
import com.dmu.entities.Customer;
import com.dmu.repo.BookingRepo;
import com.dmu.repoImpl.BookingRepoImpl;
import com.dmu.service.BookingService;

public class BookingServiceImpl implements BookingService {
	BookingRepo bookingRepo = new BookingRepoImpl();

	@Override
	public String deleteBooking(String bookingId) {
		return bookingRepo.deleteBooking(bookingId);
	}

	@Override
	public Booking findBookingById(String bookingId) {
		return bookingRepo.findBookingById(bookingId);
	}

	@Override
	public List<Booking> listAllBookings() {
		return bookingRepo.listAllBookings();
	}

	@Override
	public List<Booking> listBookingsByCustomer(Customer customer) {

		return bookingRepo.listBookingsByCustomer(customer);
	}

	@Override
	public String saveBooking(Booking booking) {
		return bookingRepo.saveBooking(booking);

	}

	@Override
	public String updateBooking(String bookingId, Booking booking) {
		return bookingRepo.updateBooking(bookingId, booking);
	}

}
