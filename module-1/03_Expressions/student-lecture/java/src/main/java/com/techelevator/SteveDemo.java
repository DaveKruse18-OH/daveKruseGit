package com.techelevator;

public class SteveDemo {

	public static void main(String[] args) {

		SteveDemo demo = new SteveDemo();

		int a = 6;
		int b = 5;
		int c = 8;
		int sumResult = demo.sum(a, b);
		
		boolean isAdult = false;

		if (!isAdult) {
			// I am an adult logic here
		}	

		if (a < c) {
			
			
		}

		if (c <= b){
			
		} 
		else {
			
		}

		if (a > b && c >= a) { // <=, ==, >=, <, >
			System.out.println("A is greater than B!");
		
		} 
		else if (b >= a)  {
            System.out.println("B is greater than A!");
		}
		else if (a == b) {
			
		}
		else {
			 System.out.println("B is equal than A!");
		}
		
		
		
		

		System.out.println("All Done! The sum is: " + sumResult);

		b = 7;
		a = 4;

		sumResult = demo.sum(a, b);
		System.out.println("All Done! The sum is: " + sumResult);

	}

	public void doSomething() {
		System.out.println("A is greater than B!");
	}

	public int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
