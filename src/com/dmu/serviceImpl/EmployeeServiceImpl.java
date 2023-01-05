package com.dmu.serviceImpl;

import java.util.List;

import com.dmu.entities.Employee;
import com.dmu.repo.EmployeeRepo;
import com.dmu.repoImpl.EmployeeRepoImpl;
import com.dmu.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo employeeRepo = new EmployeeRepoImpl();

	@Override
	public String addParkToEmployee(String parkId, String employeeId) {
		return employeeRepo.addParkToEmployee(parkId, employeeId);
	}

	@Override
	public String deleteEmployee(String employeeId) {
		return employeeRepo.deleteEmployee(employeeId);
	}

	@Override
	public Employee fetchEmployeeById(String employeeId) {
		return employeeRepo.fetchEmployeeById(employeeId);
	}

	@Override
	public List<Employee> listAllEmployees() {
		return employeeRepo.listAllEmployees();
	}

	@Override
	public String saveEmployee(Employee employee) {
		return employeeRepo.saveEmployee(employee);
	}

	@Override
	public String updateEmployee(String employeeId, Employee employee) {
		return employeeRepo.updateEmployee(employeeId, employee);
	}

}
