package com.techelevator;


/*
 * This is just a simple class to wrap a result inside an object. The only reason we are doing
 * this is so we can show unit testing working with various objects. 
 */
public class Result {
	
	int result;
	
	public Result(int result) {
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public String toString() {
		return "Result:" + result;
		
	}

}
