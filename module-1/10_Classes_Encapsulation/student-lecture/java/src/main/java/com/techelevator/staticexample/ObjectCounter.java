package com.techelevator.staticexample;

public class ObjectCounter {

	public static void main(String args[]) {
		
		// showing static variable
		
		System.out.println("Static variables:");
		
		System.out.println("What is my current count?: " + ObjectToCount.getCount());
		
		ObjectToCount obj1 = new ObjectToCount();
		ObjectToCount obj2 = new ObjectToCount();
		obj1.increment();
		obj1.increment();
		obj2.increment();
		
		System.out.println("Obj1: count is=" + ObjectToCount.count);
		System.out.println("Obj2: count is=" + ObjectToCount.count);
		System.out.println("Obj1: count is=" + ObjectToCount.getCount());
		System.out.println("Obj2: count is=" + ObjectToCount.getCount());
		
		//showing non-static variables
		System.out.println("\nNon-static variables:");
		AnotherObjectToCount obj3 = new AnotherObjectToCount();
		AnotherObjectToCount obj4 = new AnotherObjectToCount();
		obj3.increment();
		obj4.increment();
		obj4.increment();
		obj4.increment();
		System.out.println("Obj3: count is=" + obj3.getCount());
		System.out.println("Obj4: count is=" + obj4.getCount());
		
		

		
	}

}
