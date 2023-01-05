package com.dmu.repoImpl;

import java.util.List;

import com.dmu.entities.Address;
import com.dmu.repo.AddressRepo;
import com.dmu.utility.AddressRepository;

public class AddressRepoImpl implements AddressRepo {
	List<Address> addressList = AddressRepository.getAddressList();

	@Override
	public Address findAddressByPostCode(String postCode) {
		for (Address a : addressList) {
			if (a.getPostCode().equals(postCode)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Address> listAllAddresses() {

		return addressList;
	}

	@Override
	public String saveAddress(Address address) {
		if (!addressList.contains(address)) {
			addressList.add(address);
			return "Address added successfully!";
		}
		return "Address already exists!!";
	}

	@Override
	public String updateAddress(String postCode, Address address) {
		for (int i = 0; i < addressList.size(); i++) {
			if (addressList.get(i).getPostCode().equals(postCode)) {
				addressList.set(i, address);
				return "Address Updated Successfully";
			}
		}
		return "Address not found in records!!";
	}

}
