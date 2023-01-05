package com.dmu.repoImpl;

import java.util.List;

import com.dmu.entities.Employee;
import com.dmu.entities.Park;
import com.dmu.repo.ParkRepo;
import com.dmu.utility.ParkRepository;

public class ParkRepoImpl implements ParkRepo {
	List<Park> parkList = ParkRepository.getParkList();

	@Override
	public String addEmployeeToPark(String employeeId, String parkId) {
		Employee employee;
		for (Park p : parkList) {
			if (p.getParkId().equals(parkId)) {
				employee = p.getParkEmployees().stream().filter(e -> e.getEmployeeId().equals(employeeId)).findFirst()
						.orElse(null);
				if (employee != null) {
					p.getParkEmployees().add(employee);
					return "Employee Added successfully";
				}
//				park.getParkEmployees().add(null)
			}
		}
		return "Employee or park not found in records";
	}

	@Override
	public String deletePark(String parkId) {
		for (Park p : parkList) {
			if (p.getParkId().equals(parkId)) {
				parkList.remove(p);
				return "Park removed successfully";
			}
		}
		return "Park doesnt exist in records";
	}

	@Override
	public Park findParkById(String parkId) {
		return parkList.stream().filter(p -> p.getParkId().equalsIgnoreCase(parkId)).findFirst().orElse(null);
	}

	@Override
	public List<Employee> listAllParkEmployees(String parkId) {
		Park park = parkList.stream().filter(p -> p.getParkId().equalsIgnoreCase(parkId)).findFirst().orElse(null);
		return park != null ? park.getParkEmployees() : null;
	}

	@Override
	public List<Park> listAllParks() {
		return parkList;
	}

	@Override
	public String savePark(Park park) {
		if (!parkList.contains(park)) {
			parkList.add(park);
			return "Park added to records successfully";
		}
		return "Park already exists in records";
	}

	@Override
	public String updatePark(String parkId, Park park) {
		for (int i = 0; i < parkList.size(); i++) {
			if (parkList.get(i).getParkId().equals(parkId)) {
				parkList.set(i, park);
				return "Park Updated Successfully";
			}
		}
		return "Park doesnt exist in records";
	}

}
