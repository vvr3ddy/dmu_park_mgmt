package com.dmu.serviceImpl;

import java.util.List;

import com.dmu.entities.Customer;
import com.dmu.repo.CustomerRepo;
import com.dmu.repoImpl.CustomerRepoImpl;
import com.dmu.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	CustomerRepo customerRepo = new CustomerRepoImpl();

	@Override
	public String deleteCustomer(Integer customerId) {
		return customerRepo.deleteCustomer(customerId);
	}

	@Override
	public Customer findCustomerById(Integer customerId) {
		return customerRepo.findCustomerById(customerId);
	}

	@Override
	public List<Customer> listAllCustomers() {
		return customerRepo.listAllCustomers();
	}

	@Override
	public String saveCustomer(Customer customer) {
		return customerRepo.saveCustomer(customer);
	}

	@Override
	public String updateCustomer(Integer customerId, Customer customer) {
		return customerRepo.updateCustomer(customerId, customer);
	}

}
