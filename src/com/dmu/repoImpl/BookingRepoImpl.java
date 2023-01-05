package com.dmu.repoImpl;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Booking;
import com.dmu.entities.Customer;
import com.dmu.repo.BookingRepo;
import com.dmu.utility.BookingRepository;

public class BookingRepoImpl implements BookingRepo {
	List<Booking> bookings = BookingRepository.getBookingList();

	@Override
	public String deleteBooking(String bookingId) {
		for (Booking b : bookings) {
			if (b.getBookingId().equals(bookingId)) {
				bookings.remove(b);
				return "Booking deleted successfully!";
			}
		}
		return "Unable to find booking with given Id!!!";
	}

	@Override
	public Booking findBookingById(String bookingId) {
		for (Booking b : bookings) {
			if (b.getBookingId().equals(bookingId)) {
				return b;
			}
		}
		return null;
	}

	@Override
	public List<Booking> listAllBookings() {
		return bookings;
	}

	@Override
	public List<Booking> listBookingsByCustomer(Customer customer) {
		List<Booking> customerBookings = new ArrayList<>();
		for (Booking b : bookings) {
			if (b.getCustomer().equals(customer)) {
				customerBookings.add(b);
			}
		}
		return customerBookings;
	}

	@Override
	public String saveBooking(Booking booking) {
		if (!bookings.contains(booking)) {
			bookings.add(booking);
			return "Booking Created Successfully";
		}

		return "Booking already Exists";

	}

	@Override
	public String updateBooking(String bookingId, Booking booking) {
		for (Booking b : bookings) {
			if (b.getBookingId().equals(bookingId)) {
				b = booking;
				return "Booking Updated Successfully";
			}
		}
		return "Unable to find Booking with given id!!!";
	}

}
