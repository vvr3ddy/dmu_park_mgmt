package com.dmu.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.dmu.entities.Address;
import com.dmu.entities.Admin;
import com.dmu.entities.Booking;
import com.dmu.entities.Customer;
import com.dmu.entities.Employee;
import com.dmu.entities.Park;

public class StubDataPopulator {
	public static void populateStubData() throws ParseException {
		AdminRepository adminRepository;
		BookingRepository bookingRepository;
		CustomerRepository customerRepository;
		EmployeeRepository employeeRepository;
		ParkRepository parkRepository;

		List<Address> addresses = new ArrayList<Address>();
		Address add1 = new Address(1, "John street", "LE1 1AA");
		addresses.add(add1);
		Address add2 = new Address(110, "London Road", "LE2 2AZ");
		addresses.add(add2);
		Address add3 = new Address(234, "Stoughton Drive", "LE2 4AB");
		addresses.add(add3);

		List<Customer> customers = new ArrayList<Customer>();
		Customer cust1 = new Customer(1, "John Snow", add1, "jon@abc.com", "7700112233");
		Customer cust2 = new Customer(2, "David Smith", add2, "dave@hi2.in", "7766554422");
		customers.add(cust1);
		customers.add(cust2);

		List<Booking> bookings = new ArrayList<Booking>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		Date date = sdf.parse("01-JAN-2023");
		Booking book1 = new Booking("B001", date, cust1, 2);
		date = sdf.parse("31-JAN-2023");
		Booking book2 = new Booking("B002", date, cust2, 4);
		Booking book3 = new Booking("B003", date, cust1, 2);
		bookings.add(book1);
		bookings.add(book2);
		bookings.add(book3);

		List<Park> parks = new ArrayList<Park>();
		Park park1 = new Park("p001", "Park 01", add3);
		Park park2 = new Park("p002", "Park 02", add1);
		parks.add(park1);
		parks.add(park2);

		List<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee("E001", "Emp1", "01166223344", "e1@p001.co.uk", park1);
		employees.add(e1);
		Employee e2 = new Employee("E002", "Emp2", "01122334455", "e1@p002.co.uk", park2);
		employees.add(e2);

		List<Admin> admins = new ArrayList<Admin>();
		admins.add(new Admin("A001", "Admin 01", "ad01@aa.uk", parks, employees));
		
		AddressRepository.setAddressList(addresses);
		AdminRepository.setAdminList(admins);
		BookingRepository.setBookingList(bookings);
		CustomerRepository.setCustomerList(customers);
		EmployeeRepository.setEmployeeList(employees);
		ParkRepository.setParkList(parks);
	}
	
}
