package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Review ArrayLists
		
		List<String> studentNames = new ArrayList<String>();
		
        studentNames.add("Bob");
        studentNames.add("Sally");
        studentNames.add("George");
        
        
        String sally = studentNames.get(1);
        
        for (int i = 0; i<studentNames.size(); i++) {
        	System.out.println(studentNames.get(i));
        }
        
        for (String s : studentNames) {
        	System.out.println(s);
        	if (s.equals("Sally")) {
        		break;
        	}
        }
        
        
        int ctr = 0;
        while (ctr < studentNames.size()) {
        	System.out.println(studentNames.get(ctr++));
        }
        
        
        if (studentNames.contains("George")) {
        	System.out.println("George was found!");
        }
        
        String s = new String("Initial Value");   //constructor
        char c = s.charAt(2);   //method
        
        
        studentNames.remove(2);
        String removedStudent = studentNames.remove(2);
        
        if (studentNames.isEmpty()) {
        	//I have an empty list.
        }
        
        if (studentNames != null) {
        	//do something
        }
        else {
        	List<String> newList = new ArrayList<String>();
        }
        

	}

}
