package com.dmu.repoImpl;

import java.util.List;

import com.dmu.entities.Customer;
import com.dmu.repo.CustomerRepo;
import com.dmu.utility.CustomerRepository;

public class CustomerRepoImpl implements CustomerRepo {
	List<Customer> customerList = CustomerRepository.getCustomerList();

	@Override
	public String deleteCustomer(Integer customerId) {
		for (Customer c : customerList) {
			if (c.getCustomerId().equals(customerId)) {
				customerList.remove(c);
				return "Customer removed successfully!!";
			}
		}
		return "Customer not found in records";
	}

	@Override
	public Customer findCustomerById(Integer customerId) {
		for (Customer c : customerList) {
			if (c.getCustomerId().equals(customerId)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Customer> listAllCustomers() {
		return customerList;
	}

	@Override
	public String saveCustomer(Customer customer) {
		if (!customerList.contains(customer)) {
			customerList.add(customer);
		}
		return "Customer already exists in records";
	}

	@Override
	public String updateCustomer(Integer customerId, Customer customer) {
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getCustomerId().equals(customerId)) {
				customerList.set(i, customer);
				return "Customer Updated Successfully";
			}
		}
		return "Customer not found in records";
	}

}
