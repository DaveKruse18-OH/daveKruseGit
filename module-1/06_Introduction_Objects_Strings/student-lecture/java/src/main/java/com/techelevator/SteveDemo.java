package com.techelevator;

public class SteveDemo {

	public static void main(String[] args) {
	
		
		String text = new String("The quick brown fox jumped over the lazy dogs back");
		System.out.println(text);
		
		
		String text2 = new String("The quick brown fox jumped over the lazy dogs back");
		
		System.out.println(text2);
		
		if (text == text2) {
		   System.out.println("Memory is equal");	
		}
		else {
			System.out.println("Memory is not equal");	
		}
		
		if (text.length() > 0) {
			
			System.out.println(text.substring(4));
			
			System.out.println(text);
		}
		
		if (text.contains("horse")) {
			System.out.println ("What did the fox say?");
		}
		
		char c = text.charAt(7);
		System.out.println(c);
		
        text = "";
		if (text.isEmpty()) {
			System.out.println("empty");
		}
		
		String name = "Steve";
		
		
		if (name == null) {
			System.out.println("we are null!");
		}
		
		String lastName = name.concat("C");
		System.out.println(lastName);
		
		if (lastName.endsWith("C")) {
			System.out.println("ends with C");
		}
		
		
		int indexFox = text2.indexOf("fox");
		System.out.println(indexFox);
		
		String myName = " Steve";
		String myNewName = myName.trim();  // "Steve"
		System.out.println(myName);
		System.out.println(myNewName);
		
		String[] values = text2.split(" ");
		
		for (int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		for (int i=values.length-1; i>=0; i--) {
			System.out.println(values[i]);
		}
		
		
		
		
		char[] charArray = new char[] { 's', 't', 'e', 'v', 'e'};
		String steve = new String(charArray);
		
		char[] newCharArray = steve.toCharArray();

	}

}
