package com.dmu.serviceImpl;

import java.util.List;

import com.dmu.entities.Employee;
import com.dmu.entities.Park;
import com.dmu.repo.ParkRepo;
import com.dmu.repoImpl.ParkRepoImpl;
import com.dmu.service.ParkService;

public class ParkServiceImpl implements ParkService {
	ParkRepo parkRepo = new ParkRepoImpl();

	@Override
	public String addEmployeeToPark(String employeeId, String parkId) {
		return parkRepo.addEmployeeToPark(employeeId, parkId);
	}

	@Override
	public String deletePark(String parkId) {
		return parkRepo.deletePark(parkId);
	}

	@Override
	public Park findParkById(String parkId) {
		return parkRepo.findParkById(parkId);
	}

	@Override
	public List<Employee> listAllParkEmployees(String parkId) {
		return parkRepo.listAllParkEmployees(parkId);
	}

	@Override
	public List<Park> listAllParks() {
		return parkRepo.listAllParks();
	}

	@Override
	public String savePark(Park park) {
		return parkRepo.savePark(park);
	}

	@Override
	public String updatePark(String parkId, Park park) {
		return parkRepo.updatePark(parkId, park);
	}

}
