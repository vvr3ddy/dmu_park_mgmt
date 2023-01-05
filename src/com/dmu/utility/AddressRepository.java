package com.dmu.utility;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Address;

/**
 * 
 * @author <Update Author Name here>
 * @description Singleton Repository class containing the utility of Address
 *              Entity
 *
 */
public class AddressRepository {
	private static AddressRepository addressRepository = new AddressRepository();
	private static List<Address> addressList = new ArrayList<>();

	private AddressRepository() {

	}

	public static AddressRepository getAddressRepository() {
		return addressRepository;
	}

	public static List<Address> getAddressList() {
		return addressList;
	}

	public static void setAddressList(List<Address> addressList) {
		AddressRepository.addressList = addressList;
	}
}
