

package Barber;

import java.util.*;

public class BarbershopTest {
	public static void main(String[] args) {

		// PART 1: SET (CUSTOMERS)
	

		System.out.println("---- PART 1: Managing Customers ----\n");

		// Create Set (no duplicates)
		Set<String> customers = new LinkedHashSet<String>();

		// 1. Add customers
		System.out.println("Adding Customers:");
		System.out.println("Add Kandy: " + customers.add("Kandy"));
		System.out.println("Add Anmol: " + customers.add("Anmol"));
		System.out.println("Add Shreya: " + customers.add("Shreya"));
		System.out.println("Add Vastav: " + customers.add("Vastav"));

		// Try duplicate
		System.out.println("Add duplicate Kandy: " + customers.add("Kandy"));

		// 2. Display all customers
		System.out.println("\nList of Customers:");
		for (String c : customers) {
			System.out.println(c);
		}

		// 3. Check specific customer
		System.out.println("\nChecking Appointment:");
		System.out.println("Is Anmol in list? " + customers.contains("Anmol"));

		// 4. Remove customer
		System.out.println("\nRemoving Customer (Shreya cancels):");
		customers.remove("Shreya");

		System.out.println("Updated Customer List:");
		for (String c : customers) {
			System.out.println(c);
		}


		// PART 2: MAP (SERVICES)
		

		System.out.println("\n---- PART 2: Managing Services ----\n");

		// Create Map
		Map<String, Integer> services = new LinkedHashMap<String, Integer>();

		// 1. Add services
		System.out.println("Adding Services:");
		services.put("Haircut", 25);
		services.put("Beard Trim", 15);
		services.put("Shave", 20);
		services.put("Hair Wash", 10);

		// 2. Display services
		System.out.println("\nServices and Prices:");
		Set<String> keySet = services.keySet();
		for (String service : keySet) {
			System.out.println(service + " = $" + services.get(service));
		}

		// 3. Get price of specific service
		System.out.println("\nRetrieving Price:");
		System.out.println("Price of Haircut: $" + services.get("Haircut"));
	}
}