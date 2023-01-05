package com.dmu.service;

import java.util.List;

import com.dmu.entities.Employee;
import com.dmu.entities.Park;

public interface ParkService {
	public String addEmployeeToPark(String employeeId, String parkId);

	public String deletePark(String parkId);

	public Park findParkById(String parkId);

	public List<Employee> listAllParkEmployees(String parkId);

	public List<Park> listAllParks();

	public String savePark(Park park);

	public String updatePark(String parkId, Park park);
}
