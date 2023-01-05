package com.dmu.service;

import java.util.List;

import com.dmu.entities.Address;

public interface AddressService {
	public Address findAddressByPostCode(String postCode);

	public List<Address> listAllAddresses();

	public String saveAddress(Address address);

	public String updateAddress(String postCode, Address address);
}
