package com.dmu.repo;

import java.util.List;

import com.dmu.entities.Employee;

public interface EmployeeRepo {
	public String deleteEmployee(String employeeId);

	public Employee fetchEmployeeById(String employeeId);

	public List<Employee> listAllEmployees();

	public String addParkToEmployee(String parkId, String employeeId);

	public String saveEmployee(Employee employee);

	public String updateEmployee(String employeeId, Employee employee);
}
