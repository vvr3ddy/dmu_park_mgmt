/**
 * 	Java Entity class for Admin Entity
 * 	The Admin entity is aimed at performing site maintenance and acts as the superuser for the project.
 * @author P2746009 Srikaran Chinta
 */

package com.dmu.entities;

import java.util.List;

public class Admin {
	private String adminId;
	private String fullName;
	private String emailId;
	private List<Park> allParks;
	private List<Employee> employeeList;

	/**
	 *
	 */
	public Admin() {
	}

	/**
	 * @param adminId
	 * @param fullName
	 * @param emailId
	 * @param allParks
	 * @param employeeList
	 */
	public Admin(String adminId, String fullName, String emailId, List<Park> allParks, List<Employee> employeeList) {
		this.adminId = adminId;
		this.fullName = fullName;
		this.emailId = emailId;
		this.allParks = allParks;
		this.employeeList = employeeList;
	}

	/**
	 * @return the adminId
	 */
	public String getAdminId() {
		return adminId;
	}

	/**
	 * @return the allParks
	 */
	public List<Park> getAllParks() {
		return allParks;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @return the employeeList
	 */
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	/**
	 * @param allParks the allParks to set
	 */
	public void setAllParks(List<Park> allParks) {
		this.allParks = allParks;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", fullName=" + fullName + ", emailId=" + emailId + ", allParks="
				+ allParks + ", employeeList=" + employeeList + "]";
	}

}
