///**
// * Test class to test the functionality of the Customer Entity Class
// * @author P2760932 - Eshwar Karthik
// */
//
//package com.dmu.tests;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.dmu.entities.Address;
//import com.dmu.entities.Booking;
//import com.dmu.entities.Customer;
//
//public class CustomerTest {
//	/**
//	 *
//	 * @param customerTest Test class to evaluate the Customer Entity
//	 *
//	 */
//	public static void main(String[] args) {
//
//		//Create an address object since the Customer entity requires an address.
//		Address address01 = new Address(101,"Charles Street","LE1 1AA");
//		//Create a new Customer object.
//		Customer customer01 = new Customer();
//		//Create a List of Bookings
//		List<Booking> bookings01 = new ArrayList<Booking>();
//		bookings01.add(new Booking("T01",customer01,3));
//		customer01 = new Customer(0101, "John Doe", address01, "customer01@gmail.com", "+447800001122", bookings01);
//		System.out.println("==Customer 01==");
//		System.out.println(customer01.toString());
//	}
//}
