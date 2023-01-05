/**
 * Java Entity class for Address entity.
 * The Address enitity is created with the aim of separation of logic and data abstraction.
 * Here, it also helps in making sure the use of the class is Single use.
 * @author P2762090 Ruben P Manoj
 */

package com.dmu.entities;

public class Address {
	private Integer doorNumber;
	private String streetAddress;
	private String streetAddress2;
	private String postCode;

	/**
	 *
	 */
	public Address() {
	}

	/**
	 * @param doorNumber    - Door Number of the address, takes an integer only
	 * @param streetAddress - Street Address 1, mandatory field
	 * @param postCode      - Pin code, Mandatory field, accepts a string
	 */
	public Address(Integer doorNumber, String streetAddress, String postCode) {
		this.doorNumber = doorNumber;
		this.streetAddress = streetAddress;
		this.postCode = postCode;
	}

	/**
	 * @return the doorNumber
	 */
	public Integer getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @return the streetAddress2
	 */
	public String getStreetAddress2() {
		return streetAddress2;
	}

	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(Integer doorNumber) {
		this.doorNumber = doorNumber;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @param streetAddress2 the streetAddress2 to set
	 */
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetAddress=" + streetAddress + ", streetAddress2="
				+ streetAddress2 + ", postCode=" + postCode + "]";
	}

}
