package com.techelevator.enginewithinterface;

public class GasEngine implements IEngine{
	
	private boolean isStarted;

	@Override
	public boolean startEngine() {
	    isStarted = true;
	    System.out.println("Starting a gasoline engine!");
		return isStarted;
	}

	@Override
	public boolean stopEngine() {

		return false;
	}

	@Override
	public void performMaintenance(String type) {
		
		
	}
	
	
	

}
