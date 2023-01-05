package com.dmu.controller;

import java.util.List;
import java.util.Scanner;

import com.dmu.entities.Employee;
import com.dmu.service.EmployeeService;
import com.dmu.serviceImpl.EmployeeServiceImpl;

public class EmployeeController {
	EmployeeService employeeService = new EmployeeServiceImpl();
	Scanner read = new Scanner(System.in);

	public void deleteEmployee() {
		String employeeId = read.nextLine();
		System.out.println(employeeService.deleteEmployee(employeeId));
	}

	public void fetchEmployeeById() {
		System.out.println(employeeService.fetchEmployeeById(read.nextLine()));
	}

	public void listAllEmployees() {
		List<Employee> employeeList = employeeService.listAllEmployees();
		employeeList.forEach(System.out::println);
	}

	public void saveEmployee() {
		Employee employee = new Employee();
		System.out.println("Enter employee details:");
		System.out.println("Enter employee id:");
		employee.setEmployeeId(read.nextLine());
		System.out.println("Enter employee Name:");
		employee.setFullName(read.nextLine());
		System.out.println("Enter employee email id:");
		employee.setEmailId(read.nextLine());
		System.out.println("Enter employee phone number:");
		employee.setPhoneNumber(read.nextLine());
		employeeService.saveEmployee(employee);
	}

	public void updateEmployee() {
		String employeeId = read.nextLine();
		Employee employee = employeeService.fetchEmployeeById(employeeId);
		if (employee != null) {
			System.out.println("Enter employee name:");
			employee.setFullName(read.nextLine());
			System.out.println("Enter employee email id:");
			employee.setEmailId(read.nextLine());
			System.out.println("Enter employee phone number:");
			employee.setPhoneNumber(read.nextLine());
			System.out.println(employeeService.updateEmployee(employeeId, employee));

		} else {
			System.out.println("Employee not found in records");
		}
	}

	public void addParkToEmployee() {
		System.out.println("Enter park id:");
		String parkId = read.nextLine();
		System.out.println("Enter Employee to link:");
		String employeeId = read.nextLine();
		System.out.println(employeeService.addParkToEmployee(parkId, employeeId));
	}
}
