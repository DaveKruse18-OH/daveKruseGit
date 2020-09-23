package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		
		Map<String, String> customers = new HashMap<String, String> ();

		customers.put("555-555-5555", "Matt Im Hungry Jones");
		customers.put("555-555-4545", "George Jones");
		customers.put("343-555-4555", "Sally Smith");
		
		
		
		String cust = customers.get("343-555-4555");
		System.out.println("Customers Name is: " + cust);
		
		String name = customers.get("ABC");
		System.out.println(name);
		
		if (name == null) {
			//we did not find the name
			name = "John Doe";
		}
		
		
		if (customers.containsKey("555-5555-5555")) {
			//found
		}
		else {
			//not found
		}
		
		
		Set<String> mapKeys = customers.keySet();
		
		for (String key: mapKeys) {
			System.out.println(key);
			System.out.println(customers.get(key));
		}
		
	
		
		
		
		
		
		
//		Map<String, Customer> customerMap = new HashMap<String, Customer> ();
//		
//		Customer customer1 = new Customer();
//		customer1.setAddressLine1("123 Oak Street");
//		customer1.setFirstName("Steve");
//		customer1.setLastName("Pizza Eater");
//		
//		customerMap.put("911", customer1);
		
		
		
		
		
		

	}

}
