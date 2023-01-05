/**
 * Entity class to store the Employee entity
 * @author P2760578 Kittu
 */
package com.dmu.entities;

public class Employee {
	private String employeeId;
	private String fullName;
	private String phoneNumber;
	private String emailId;
	private Park park;

	/**
	 *
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param employeeId  - the employee Id, takes a string value.
	 * @param fullName    - full name of the employee, takes a string value.
	 * @param phoneNumber - phone number of the employee, enter it in the
	 *                    +44xxxxxxxxxx format
	 * @param emailId     - employee email id
	 */
	public Employee(String employeeId, String fullName, String phoneNumber, String emailId, Park park) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.park = park;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 * @return the Park details
	 */
	public Park getPark() {
		return park;
	}

	/**
	 * 
	 * @param park the Park in which employee works
	 */
	public void setPark(Park park) {
		this.park = park;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + "]";
	}

}
