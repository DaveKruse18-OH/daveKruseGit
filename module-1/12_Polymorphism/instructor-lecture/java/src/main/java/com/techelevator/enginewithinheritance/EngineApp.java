package com.techelevator.enginewithinheritance;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EngineApp {

	public static void main(String[] args) {
		
		ElectricEngine e = new ElectricEngine();
		GasEngine g = new GasEngine();
		SteamEngine se = new SteamEngine();
		
		
		Map<Integer, Engine> engineMap = new TreeMap<Integer,Engine> ();
		
		engineMap.put(1,e);
		engineMap.put(2, g);
		engineMap.put(3,se);
		
		Set<Integer> keys = engineMap.keySet();
		
		for (Integer key : keys) {
			Engine engine = engineMap.get(key);
			if (engine.startEngine()) {
				System.out.println("Woohooo we got power!");
			}
			
		}
		
		
		
	
		

	}

}
