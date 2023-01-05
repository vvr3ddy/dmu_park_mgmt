package com.dmu.utility;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Customer;

public class CustomerRepository {
	private static CustomerRepository customerRepository = new CustomerRepository();
	private static List<Customer> customerList = new ArrayList<>();

	private CustomerRepository() {

	}

	public static List<Customer> getCustomerList() {
		return customerList;
	}

	public static void setCustomerList(List<Customer> customerList) {
		CustomerRepository.customerList = customerList;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

}
