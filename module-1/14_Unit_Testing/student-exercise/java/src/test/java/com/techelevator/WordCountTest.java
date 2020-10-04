package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.TreeSet;

//import junit.framework.Assert;
import org.junit.Assert;

public class WordCountTest {
	private WordCount wordCount;
	
	@Before
	public void beforeAllTests() {
		wordCount = new WordCount();
	}
	
	@Test
	public void testHashMapNoRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"this", "that", "other"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("this", 1);
		checkMap.put("that", 1);
		checkMap.put("other", 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
	
	@Test
	public void testHashMapRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"this", "that", "other", "that"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("this", 1);
		checkMap.put("that", 2);
		checkMap.put("other", 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}

	@Test
	public void testHashMapMultipleRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"this", "that", "this", "other", "that", "this"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("this", 3);
		checkMap.put("that", 2);
		checkMap.put("other", 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
	
	@Test
	public void testHashMapMixedCaseMultipleRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"this", "that", "other", "This", "tHat", "otHer"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("this", 1);
		checkMap.put("that", 1);
		checkMap.put("other", 1);
		checkMap.put("This", 1);
		checkMap.put("tHat", 1);
		checkMap.put("otHer", 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
	
	@Test
	public void testHashMapEmptyString() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"this", "that", "", "This", "tHat", "otHer"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("this", 1);
		checkMap.put("that", 1);
		checkMap.put("", 1);
		checkMap.put("This", 1);
		checkMap.put("tHat", 1);
		checkMap.put("otHer", 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
	
	@Test
	public void testHashMapEmptyStringRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"", "that", "", "", "tHat", "otHer"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("", 3);
		checkMap.put("that", 1);
		checkMap.put("tHat", 1);
		checkMap.put("otHer", 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
	
	@Test
	public void testHashMapNullStringNoRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"", "that", "", null, "tHat", "otHer"};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("", 2);
		checkMap.put("that", 1);
		checkMap.put("tHat", 1);
		checkMap.put("otHer", 1);
		checkMap.put(null, 1);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
	
	@Test
	public void testHashMapNullStringRepeats() {
		// Arrange (see @Before)
		
		// Act
		String[] words = new String[] {"", "that", "", null, "tHat", "otHer", null, null};
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		returnMap = wordCount.getCount(words);
		
		// Assert
		// Setup check map.
		Map<String, Integer> checkMap = new HashMap<String, Integer>();
		checkMap.put("", 2);
		checkMap.put("that", 1);
		checkMap.put("tHat", 1);
		checkMap.put("otHer", 1);
		checkMap.put(null, 3);
		
		Set<String> returnKs = returnMap.keySet();
		Set<String> checkKs = checkMap.keySet();
		for (String tempKey : checkKs) {
			boolean isInReturnKs = returnKs.contains(tempKey);
			
			if (isInReturnKs) {
				Assert.assertEquals(checkMap.get(tempKey), returnMap.get(tempKey));
			} else {
				Assert.fail();
			}
		}
	}
}
