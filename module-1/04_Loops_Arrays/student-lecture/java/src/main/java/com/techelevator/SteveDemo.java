package com.techelevator;

public class SteveDemo {

	public static void main(String[] args) {
		
		// IDEAS FOR SELF STUDY AND REVIEW 
		//can you declare an array of ints, longs, double, floats, Strings?
		// can you initialize and array of various sizes and data
		// can you update an element with a value
		//can you pull the data value out of an array?
		//can you get the size of an array?
		//can you access the first element, last element or element at some index?
		//can you write a for loop that loops from 1 to 10?
		// can you loop through and print all even or odd numbers?
		//can you loop through an array and find a specific value?
		//can you reverse the contents of an array?
		//can you remove duplicates from an array?
		// can you loop backwards through a loop? loop backwards through an array?
		// can you write a while loop? 
		//can you write a while loop and exit based on some condition?
		
	
		//examples of declaring arrays of various data types of size 10
		int[] arrayOfInts = new int[10];
		long[] arrayOfLongs = new long[10];
		double[] arrayOfDoubles = new double[10];
		String[] students  = new String[10];
		byte[] arrayOfBytes = new byte[10];
		
		
		//declare AND initialize at the same time
		String[] classList = new String[] {"Math", "Science", "Gym"};
		
		int[] ageOfStudents = new int[1000];
		ageOfStudents[0] = 16;   // set the first element to 16
		ageOfStudents[5] = 21;   //set the 6th element to 21
		ageOfStudents[999] = 19;  //set last element to 19
		ageOfStudents[ageOfStudents.length - 1] = 45;  //another way to access end of array
		
		
		System.out.println("Size of arrayOfDoubles: " + arrayOfDoubles.length);
		
		System.out.println("Class list for science was found! Here it is: " + classList[1] );
		
		ageOfStudents[5] = 22;
		ageOfStudents[5] = ageOfStudents[5] + 3;
		
		int index =0;
		System.out.println("The value at the end is: " + ageOfStudents[index] );
		
		// increment or decrement 
		int a = 0;
		//System.out.println(a);
        a = index++;
		//System.out.println(a);
		
		a = index--;
		a = --index;
		
		//shorthand notation
		int ab = 3;
		ab = ab + 4;  //option one - long way
		
		ab += 4;      //option 2 - shorthand version, same as above
		
		ab -=4;       // same as ab = ab -4
		
		ab *= 3;     //same as ab = ab * 3
		
		
		//for loop
//		for (int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
		
		//next available line
		
//		for (int i=0; i<=100; i+=3) {
//			System.out.println(i);
//		}
		
		for (int i=0; i<=100; i++) {
			if( i % 2 == 0) {    //testing that i is even
//			  System.out.println(i);
			}
		}
				
		//loop through every elemnet of the array from beginning to end
		for (int i = 0; i < classList.length; i++ ) {
			 
//			 System.out.println(classList[i]);
		}
		
		
		//loop backwards through the array
		for (int i = classList.length -1; i>=0; i-- ) {
//			System.out.println(classList[i]);
		}
		
		for (int ix=0; ix<classList.length; ix++) {
			if (classList[ix].equals("Science")) {
				System.out.println(classList[ix]);

			}
			else {
				System.out.println("Not Found!");
			}
		}
		
		
		for (int i = 0; i< 100; i++) {
			
//			System.out.println("i: " + i);
			for (int j=0; j<10; j++) {
//				System.out.println("j: " + j);
			}
			
		}
		
		
		boolean isActive = true;
		
		int ctr = 0;
		while(ctr < 100) {
			//do something
			System.out.println(ctr);
			ctr ++;
		}
		
		
		
		
		

	}

}
