package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		String ret = null;
		Map<String, String> animalList = new HashMap<String, String>();
		animalList.put("rhino", "Crash");
		animalList.put("giraffe", "Tower");
		animalList.put("elephant", "Herd");
		animalList.put("lion", "Pride");
		animalList.put("crow", "Murder");
		animalList.put("pigeon", "Kit");
		animalList.put("flamingo", "Pat");
		animalList.put("deer", "Herd");
		animalList.put("dog", "Pack");
		animalList.put("crocodile", "Float");

		if ((animalName != null) && (!animalName.equals(""))) {
		//if (!animalName.equals("")) {
			ret = animalList.get(animalName.toLowerCase());
		}
		if (ret == null) {
			ret = "unknown";
		}
			
		return ret;
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		double ret = 0.00;
		Map<String, Double> saleList = new HashMap<String, Double>();
		saleList.put("KITCHEN4001", 0.20);
		saleList.put("GARAGE1070", 0.15);
		saleList.put("LIVINGROOM", 0.10);
		saleList.put("KITCHEN6073", 0.40);
		saleList.put("BEDROOM3434", 0.60);
		saleList.put("BATH0073", 0.15);
	
		if ((itemNumber != null) && (!itemNumber.equals(""))) {
			if (saleList.containsKey(itemNumber.toUpperCase())) {
			//if ((itemNumber != null) && (!itemNumber.equals(""))) {
			//if (!animalName.equals("")) {
				ret = saleList.get(itemNumber.toUpperCase());
			} else {
				ret = 0.00;
			}
		} else {
			ret = 0.0;
		}
			
		return ret;
	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		//Map<String, Integer> ret = new HashMap<String, Integer>();
		Integer peterMoney = peterPaul.get("Peter");
		Integer paulMoney = peterPaul.get("Paul");
		if ((peterMoney > 0) && (paulMoney < 1000)) {
			Integer half = peterMoney / Integer.valueOf(2);
			if ((peterMoney % Integer.valueOf(2)) != 0) {
				half++;
				paulMoney--;
			}
			peterPaul.put("Peter", half);
			peterPaul.put("Paul", paulMoney + half);
		}
		
		return peterPaul;
	}

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		//Map<String, Integer> ret = new HashMap<String, Integer>();
		Integer peterMoney = peterPaul.get("Peter");
		Integer paulMoney = peterPaul.get("Paul");
		if ((peterMoney >= 5000) && (paulMoney >= 10000)) {
			Double peterQtr = peterMoney * 0.25;
			int intPeterQtr = (int)Math.round(peterQtr);
			Double paulQtr = paulMoney * 0.25;
			int intPaulQtr = (int)Math.round(paulQtr);
			peterPaul.put("Peter", peterMoney - intPeterQtr);
			peterPaul.put("Paul", paulMoney - intPaulQtr);
			peterPaul.put("PeterPaulPartnership", intPeterQtr + intPaulQtr);
		}
		
		return peterPaul;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> ret = new HashMap<String, String>();
		
		for (int x = 0; x < words.length; x++) {
			String value = words[x];
			int len = value.length();
			char firstChar = value.charAt(0);
			String first = String.valueOf(firstChar);
			char lastChar = value.charAt(len - 1);
			String last = String.valueOf(lastChar);
			ret.put(first, last);
		}
		
		return ret;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> ret = new HashMap<String, Integer>();
	
		for (int x = 0; x < words.length; x++) {
			String keyValue = words[x];
			if (!ret.containsKey(keyValue)) {
				int cnt = 0;
				for (int y = 0; y < words.length; y++) {
					String tempValue = words[y];
					if (tempValue.equals(keyValue)) {
						cnt++;
					}
				}
				ret.put(keyValue, cnt);
			}	
		}
	
		return ret;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> ret = new HashMap<Integer, Integer>();
		
		for (int x = 0; x < ints.length; x++) {
			int keyValue = ints[x];
			if (!ret.containsKey(keyValue)) {
				int cnt = 0;
				for (int y = 0; y < ints.length; y++) {
					int tempValue = ints[y];
					if (tempValue == keyValue) {
						cnt++;
					}
				}
				ret.put(keyValue, cnt);
			}	
		}
		
		return ret;
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> ret = new HashMap<String, Boolean>();
		
		for (int x = 0; x < words.length; x++) {
			String keyValue = words[x];
			if (!ret.containsKey(keyValue)) {
				int cnt = 0;
				for (int y = 0; y < words.length; y++) {
					String tempValue = words[y];
					if (tempValue.equals(keyValue)) {
						cnt++;
					}
				}
				boolean value = false;
				if (cnt >= 2) {
					value = true;
				}
				ret.put(keyValue, value);
			}	
		}
		
		return ret;
	}

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> ret = new HashMap<String, Integer>();
		
		if (mainWarehouse.isEmpty()) {
			ret = remoteWarehouse;
		}
		else if (remoteWarehouse.isEmpty()) {
			ret = mainWarehouse;
		} else {
			Set<String> mainSet = new HashSet<String>();
			Set<String> remoteSet = new HashSet<String>();
			mainSet = mainWarehouse.keySet();
			remoteSet = remoteWarehouse.keySet();
			
			Iterator<String> itrMain = mainSet.iterator();
			Iterator<String> itrRemote = remoteSet.iterator();
				
			while (itrMain.hasNext()) {
				String mainKey = itrMain.next();
				if (remoteSet.contains(mainKey)) {
					Integer remoteValue = remoteWarehouse.get(mainKey);
					Integer mainValue = mainWarehouse.get(mainKey);
					Integer newValue = mainValue + remoteValue;
					ret.put(mainKey, newValue);
					//mainSet.remove(mainKey);
					remoteSet.remove(mainKey);
				} else {
					Integer mainValue = mainWarehouse.get(mainKey);
					ret.put(mainKey, mainValue);
					//mainSet.remove(mainKey);
				}
			}
			
			remoteSet = new HashSet<String>();
			remoteSet = remoteWarehouse.keySet();
			itrRemote = remoteSet.iterator();
			
			while (itrRemote.hasNext()) {
				String remoteKey = itrRemote.next();
				Integer remoteValue = remoteWarehouse.get(remoteKey);
				ret.put(remoteKey, remoteValue);
				remoteSet.remove(remoteKey);
			}
	
		}
		return ret;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> ret = new HashMap<String, Integer>();
		
		for (int x = 0; x < words.length; x++) {
			String stringToExplore = words[x];
			String stringToMatch = stringToExplore.substring(stringToExplore.length() - 2);
			//System.out.println("stringToExplore: " + stringToExplore);
			//System.out.println("stringToMatch: " + stringToMatch);
			
			int cnt = 0;
			for (int y = 0; y < stringToExplore.length() - 2; y++) {
				String possibleString = stringToExplore.substring(y, y+2);
				//System.out.println("possibleString: " + possibleString);
				if (stringToMatch.equals(possibleString)) {
					cnt++;
				}
			}
			//System.out.println("---------------------------------");
			//System.out.println("stringToMatch: " + stringToMatch);
			//System.out.println("cnt: " + cnt);
			//System.out.println("----------------------------------");
			ret.put(stringToExplore, cnt);
		}
		
		return ret;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		List<String> ret = new ArrayList<String>();
		int sizeOfList = stringList.size();
		for (int x = 0; x < sizeOfList; x++) {
			String temp = stringList.get(x);
			if (!ret.contains(temp)) {
				ret.add(temp);
			}
		}
		
		return ret;
	}

}
