/**
 * Java Entity class for Booking Entity
 * The booking entity completely handles the booking section of the project.
 * This helps isolate and restrict the usage of entity there by trying to achieve SOLID.
 * @author P2761885 Sri Laxmi
 */

package com.dmu.entities;

import java.util.Date;

public class Booking {
	private String bookingId;
	private Date bookingDate;
	// Each booking has a unique customer
	private Customer customer;
	private Integer quantity;
	private Park park;

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	/**
	 * Default constructor for the Booking Entity
	 */
	public Booking() {
	}

	/**
	 * @param bookingId   - accepts string value in the format SNNN where S, String,
	 *                    N, Integer
	 * @param customer    - accepts a customer object, to who the booking has to be
	 *                    linked.
	 * @param bookingDate - accepts a date string to store the date of booking
	 * @param quantity    - accepts an Integer value to store the number of bookings
	 *                    of this type made for a particular customer
	 */
	public Booking(String bookingId, Date bookingDate, Customer customer, Integer quantity) {
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.customer = customer;
		this.quantity = quantity;
	}

	/**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @return the bookingId
	 */
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", customer=" + customer
				+ ", quantity=" + quantity + "]";
	}

}
