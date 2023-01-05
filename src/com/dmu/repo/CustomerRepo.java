package com.dmu.repo;

import java.util.List;

import com.dmu.entities.Customer;

public interface CustomerRepo {
	public String deleteCustomer(Integer customerId);

	public Customer findCustomerById(Integer customerId);

	public List<Customer> listAllCustomers();

	public String saveCustomer(Customer customer);

	public String updateCustomer(Integer customerId, Customer customer);

}
