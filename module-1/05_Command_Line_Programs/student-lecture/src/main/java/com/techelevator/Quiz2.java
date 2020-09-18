package com.techelevator;

public class Quiz2 {

	public static void main(String[] args) {
		
		//#2 --------------------------------------------------------------------
		
		int answer = 0;
		for (int i = 0; i<10; i++) {
			if (i %2 == 0) {
				answer = answer + i;
			}
		}
		System.out.println(answer);
		
		
		//#3 ---------------------------------------------------------------------
		
		int sum = 0;
		
		for (int i = 10; i > 0; i -=3) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
       //#5	-----------------------------------------------------------------------	
		
		boolean[] first = { true, true, false, false };
		boolean[] second = first;

		first[0] = false;
		second[2] = true;

		for(int ix = 0; ix < first.length; ix++) {

		    boolean b = first[ix];
		     System.out.print(b+" ");     // <-- remember the space in your output
		}

		
		
		 System.out.print("\n"); 
		
		//#6 -------------------------------------------------------------------------
		
		for(int i = 0; i < 5; i++) {
			int sum2 = 0;

	         sum2 += i;

	         System.out.print(sum2 + " "); 
	    }
		
		
		
		 System.out.print("\n"); 
		 
		 
		//#7 --------------------------------------------------------------------------
		
		int[] numbers = new int[10];

		for(int ix = 0; ix < numbers.length; ix++) {

		    numbers[ix] = ix * 2;

		}

		int result = numbers[3];
		
		System.out.println(result);

		
		
		
		
		
	}	
	
}
