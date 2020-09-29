package com.techelevator.enginewithinterface;


public class EngineApp {

	public static void main(String[] args) {
		
		GasEngine g = new GasEngine();
		SteamEngine se = new SteamEngine();
		
		IEngine[] engineArray = new IEngine[2];
		
		engineArray[0] = g;
		engineArray[1] = se;
		
		for (int x = 0; x < engineArray.length; x++ ) {
			IEngine eng = engineArray[x];
			eng.startEngine();   //calls method on interface
			
			if (eng instanceof SteamEngine) {    //handle differently if steam engine
				SteamEngine steam = (SteamEngine) eng;   //cast from generic IEngine to more specific Steam Engine
				steam.shovelCoal(5);   // now I can call specific steam engine methods
				System.out.println("Stand back!");
			}
			
		}
		
		

	}

}
