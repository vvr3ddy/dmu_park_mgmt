import java.text.ParseException;
import java.util.Scanner;

import com.dmu.driver.AddressDriver;
import com.dmu.driver.AdminDriver;
import com.dmu.driver.BookingDriver;
import com.dmu.driver.CustomerDriver;
import com.dmu.driver.EmployeeDriver;
import com.dmu.driver.ParkDriver;
import com.dmu.utility.StubDataPopulator;

public class Main {
	public static void main(String[] args) throws ParseException {
		StubDataPopulator.populateStubData();
		Scanner read = new Scanner(System.in);
		String input = new String();
		Integer choice;
		do {
			System.out.println("Welcome to Hyde Park Management");
			System.out.println("1. Address Section.");
			System.out.println("2. Customer Section.");
			System.out.println("3. Employee Section.(requires special permissions)");
			System.out.println("4. Park Section.");
			System.out.println("5. Booking Section.");
			System.out.println("6. Admin Section.(requires special permissions)");
			System.out.println("Make a selection to continue...");
			choice = read.nextInt();
			read.nextLine();
			switch (choice) {
			case 1: {
				AddressDriver addressDriver = new AddressDriver();
				break;
			}
			case 2:
				CustomerDriver customerDriver = new CustomerDriver();
				break;
			case 3:
				EmployeeDriver employeeDriver = new EmployeeDriver();
				break;
			case 4:
				ParkDriver parkDriver = new ParkDriver();
				break;
			case 5:
				BookingDriver bookingDriver = new BookingDriver();
				break;
			case 6:
				AdminDriver adminDriver = new AdminDriver();
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you wish to continue?[Y/n]:");
			input = read.nextLine();
		} while (!input.equalsIgnoreCase("N"));

		read.close();
	}
}
