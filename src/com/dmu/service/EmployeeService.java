package com.dmu.service;

import java.util.List;

import com.dmu.entities.Employee;

public interface EmployeeService {
	public String addParkToEmployee(String parkId, String employeeId);

	public String deleteEmployee(String employeeId);

	public Employee fetchEmployeeById(String employeeId);

	public List<Employee> listAllEmployees();

	public String saveEmployee(Employee employee);

	public String updateEmployee(String employeeId, Employee employee);
}
