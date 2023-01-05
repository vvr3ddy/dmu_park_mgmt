package com.dmu.serviceImpl;

import java.util.List;

import com.dmu.entities.Address;
import com.dmu.repo.AddressRepo;
import com.dmu.repoImpl.AddressRepoImpl;
import com.dmu.service.AddressService;

public class AddressServiceImpl implements AddressService {
	AddressRepo addressRepo = new AddressRepoImpl();

	@Override
	public Address findAddressByPostCode(String postCode) {
		return addressRepo.findAddressByPostCode(postCode);
	}

	@Override
	public List<Address> listAllAddresses() {
		return addressRepo.listAllAddresses();
	}

	@Override
	public String saveAddress(Address address) {
		return addressRepo.saveAddress(address);
	}

	@Override
	public String updateAddress(String postCode, Address address) {
		return addressRepo.updateAddress(postCode, address);
	}

}
