/**
 * Test class implementation to test the functionality of Address Entity.
 *
 */
package com.dmu.tests;

import com.dmu.entities.Address;

public class AddressTest {
	public static void main(String[] args) {
		// Creating an Address Object and using the parameterized constructor
		Address address = new Address(01, "City center", "LE1 3AJ");
		System.out.println("============Address 01==============");
		System.out.println("Postcode: " + address.getPostCode());
		System.out.println("====================================");
		System.out.println(address.toString());
	}
}
