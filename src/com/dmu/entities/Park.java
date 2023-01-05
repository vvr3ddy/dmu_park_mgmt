package com.dmu.entities;

import java.util.List;

/**
 * @author P2760932
 *
 */
public class Park {
	private String parkId;
	private String parkName;
	private Address parkAddress;
	private List<Employee> parkEmployees;
	private Integer bookingCount = 0;

	/**
	 *
	 */
	public Park() {
		super();
	}

	/**
	 *
	 * @param parkName
	 * @param parkAddress
	 * @param parkEmployees
	 */
	public Park(String parkId, String parkName, Address parkAddress) {
		this.parkId = parkId;
		this.parkName = parkName;
		this.parkAddress = parkAddress;
	}

	/**
	 * @return the bookingCount
	 */
	public Integer getBookingCount() {
		return bookingCount;
	}

	/**
	 * @return the parkAddress
	 */
	public Address getParkAddress() {
		return parkAddress;
	}

	/**
	 * @return the parkEmployees
	 */
	public List<Employee> getParkEmployees() {
		return parkEmployees;
	}

	/**
	 * @return the parkId
	 */
	public String getParkId() {
		return parkId;
	}

	/**
	 * @return the parkName
	 */
	public String getParkName() {
		return parkName;
	}

	/**
	 * @param bookingCount the bookingCount to set
	 */
	public void setBookingCount(Integer bookingCount) {
		this.bookingCount = bookingCount;
	}

	/**
	 * @param parkAddress the parkAddress to set
	 */
	public void setParkAddress(Address parkAddress) {
		this.parkAddress = parkAddress;
	}

	/**
	 * @param parkEmployees the parkEmployees to set
	 */
	public void setParkEmployees(List<Employee> parkEmployees) {
		this.parkEmployees = parkEmployees;
	}

	/**
	 * @param parkId the parkId to set
	 */
	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	/**
	 * @param parkName the parkName to set
	 */
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	@Override
	public String toString() {
		return "Park [parkId=" + parkId + ", parkName=" + parkName + ", parkAddress=" + parkAddress + ", bookingCount="
				+ bookingCount + "]";
	}

}
