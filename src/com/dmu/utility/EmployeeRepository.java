package com.dmu.utility;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Employee;

public class EmployeeRepository {
	private static EmployeeRepository employeeRepository = new EmployeeRepository();
	private static List<Employee> employeeList = new ArrayList<>();

	private EmployeeRepository() {

	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public static List<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(List<Employee> employeeList) {
		EmployeeRepository.employeeList = employeeList;
	}

}
