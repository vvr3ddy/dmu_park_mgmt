package com.dmu.repoImpl;

import java.util.List;

import com.dmu.entities.Employee;
import com.dmu.entities.Park;
import com.dmu.repo.EmployeeRepo;
import com.dmu.utility.EmployeeRepository;
import com.dmu.utility.ParkRepository;

public class EmployeeRepoImpl implements EmployeeRepo {
	List<Employee> employeeList = EmployeeRepository.getEmployeeList();
	List<Park> parkList = ParkRepository.getParkList();

	@Override
	public String deleteEmployee(String employeeId) {
		for (Employee e : employeeList) {
			if (e.getEmployeeId().equals(employeeId)) {
				employeeList.remove(e);
				return "Employee removed from records";
			}
		}
		return "Employee doesnt exist in records";

	}

	@Override
	public Employee fetchEmployeeById(String employeeId) {
		for (Employee e : employeeList) {
			if (e.getEmployeeId().equals(employeeId)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> listAllEmployees() {

		return employeeList;
	}

	@Override
	public String saveEmployee(Employee employee) {
		if (!employeeList.contains(employee)) {
			employeeList.add(employee);
			return "Employee saved to records!";
		}
		return "Employee already Exists in records!";
	}

	@Override
	public String updateEmployee(String employeeId, Employee employee) {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getEmployeeId().equals(employeeId)) {
				employeeList.set(i, employee);
				return "Employee updated successfully!";
			}
		}
		return "Employee doesn't exist in records!";
	}

	@Override
	public String addParkToEmployee(String parkId, String employeeId) {
		Park park = parkList.stream().filter(p -> p.getParkId().equals(parkId)).findFirst().orElse(null);
		if (park != null) {
			Employee employee = employeeList.stream().filter(e -> e.getEmployeeId().equals(employeeId)).findFirst()
					.orElse(null);
			if (employee != null) {
				employee.setPark(park);
				return "Employee associated to Park.";
			} else {
				return "Employee does not exist in records.";
			}
		}
		return "Park does not exist in records";
	}

}
