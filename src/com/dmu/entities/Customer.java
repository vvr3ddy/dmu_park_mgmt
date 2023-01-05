/**
 * Java Entity class for the Customer Entity
 * The Customer entity is responsible for the customer management.
 * @author P2760932 - Eshwar Karthik
 */

package com.dmu.entities;

import java.util.List;

public class Customer {
	private Integer customerId;
	private String customerName;
	private Address address;
	private String emailid;
	private String contactNumber;
	// One customer can have many bookings
	private List<Booking> customerBookings;

	/**
	 * Default constructor to
	 */
	public Customer() {
	}

	/**
	 * @param customerId       - accepts an integer.
	 * @param customerName     - accepts string to store the full name of the
	 *                         customer
	 * @param address          - accepts an address object containing the address of
	 *                         a customer
	 * @param emailid          - accepts a string to store the email id of the
	 *                         customer.
	 * @param contactNumber    - accepts a string to store the phone number in the
	 *                         format +44xxxxxxxxxx
	 * @param customerBookings - accepts a List of bookings which the customer has
	 *                         made recently
	 */
	public Customer(Integer customerId, String customerName, Address address, String emailid, String contactNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.emailid = emailid;
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @return the customerBookings
	 */
	public List<Booking> getCustomerBookings() {
		return customerBookings;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @param customerBookings the customerBookings to set
	 */
	public void setCustomerBookings(List<Booking> customerBookings) {
		this.customerBookings = customerBookings;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", emailid=" + emailid + ", contactNumber=" + contactNumber + ", customerBookings=" + customerBookings
				+ "]";
	}

}
