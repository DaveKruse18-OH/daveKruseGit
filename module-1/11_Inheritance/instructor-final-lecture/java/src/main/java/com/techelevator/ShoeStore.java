package com.techelevator;

import java.math.BigDecimal;

public class ShoeStore {

	public static void main(String[] args) {
		
		
		
		//

		
		System.out.println("");
        RunningShoe runningShoes = new RunningShoe(10, 100.00);
        runningShoes.walk();
        
        
        
        BasketballShoe bbShoe = new BasketballShoe(12, 200.00);
        bbShoe.walk();
        
        
        BigDecimal amount = new BigDecimal("9.99");
        double x = amount.doubleValue();
        
        
       
	}

}
