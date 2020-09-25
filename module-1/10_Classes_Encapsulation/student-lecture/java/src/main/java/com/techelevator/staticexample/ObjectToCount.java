package com.techelevator.staticexample;


public class ObjectToCount {

	   public static int count = 0;       // Let's change this to private later
	                                     
	   
	  
	   public void increment()
	   {
	       count++;
	   }
	   
	   public static int getCount() {
		   return count;
	   }

}
