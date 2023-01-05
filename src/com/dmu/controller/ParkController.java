package com.dmu.controller;

import java.util.List;
import java.util.Scanner;

import com.dmu.entities.Address;
import com.dmu.entities.Employee;
import com.dmu.entities.Park;
import com.dmu.service.AddressService;
import com.dmu.service.EmployeeService;
import com.dmu.service.ParkService;
import com.dmu.serviceImpl.AddressServiceImpl;
import com.dmu.serviceImpl.EmployeeServiceImpl;
import com.dmu.serviceImpl.ParkServiceImpl;

public class ParkController {
	AddressService addressService = new AddressServiceImpl();
	EmployeeService employeeService = new EmployeeServiceImpl();
	ParkService parkService = new ParkServiceImpl();
	Scanner read = new Scanner(System.in);

	public void addEmployeeToPark() {
		System.out.println("Adding employee to Park");
		System.out.println("Enter Employee Id:");
		String employeeId = read.nextLine();
		Employee employee = employeeService.fetchEmployeeById(employeeId);
		if (employee == null) {
			System.out.println("Employee does not exist in records");
		} else {
			System.out.println("Enter Park Id:");
			String parkId = read.nextLine();
			Park p = parkService.findParkById(parkId);
			if (p != null) {
				p.getParkEmployees().add(employee);
				System.out.println("Employee added to Park successfully.");
			} else {
				System.out.println("Park does not exist in records");
			}
		}
	}

	public void deletePark() {
		System.out.println("Enter parkId to delete:");
		String parkId = read.nextLine();
		System.out.println(parkService.deletePark(parkId));
	}

	public void findParkById() {
		System.out.println("Enter park Id to fetch Park details:");
		String parkId = read.nextLine();
		System.out.println(parkService.findParkById(parkId));
	}

	public void listAllParkEmployees() {
		System.out.println("Enter Park Id:");
		String parkId = read.nextLine();
		List<Employee> employeeList = parkService.listAllParkEmployees(parkId);
		employeeList.forEach(System.out::println);
	}

	public void listAllParks() {
		List<Park> parkList = parkService.listAllParks();
		parkList.forEach(System.out::println);
	}

	public void savePark() {
		Park park = new Park();
		System.out.println("Enter park details:");
		System.out.println("Enter park id:");
		park.setParkId(read.nextLine());
		System.out.println("Enter park Name:");
		park.setParkName(read.nextLine());
		System.out.println("Enter park post code:");
		String postCode = read.nextLine();
		Address address = addressService.findAddressByPostCode(postCode);
		park.setParkAddress(address);
		System.out.println("Adding park employee details:");
		do {
			System.out.println("Enter employee Id:");
			addEmployeeToPark();
			System.out.println("Do you wish to add more?[Y/n]:");

		} while (read.nextLine().charAt(0) != 'n' || read.nextLine().charAt(0) != 'N');
		System.out.println(parkService.savePark(park));

	}

	public void updatePark() {
		System.out.println("Enter the park id to update:");
		String parkId = read.nextLine();
		Park park = parkService.findParkById(parkId);
		if (park != null) {
			System.out.println("Enter the park name:");
			park.setParkName(read.nextLine());
			System.out.println("Enter the park postCode:");
			String postCode = read.nextLine();
			Address address = addressService.findAddressByPostCode(postCode);
			park.setParkAddress(address);
			parkService.updatePark(parkId, park);
		}
	}
}
