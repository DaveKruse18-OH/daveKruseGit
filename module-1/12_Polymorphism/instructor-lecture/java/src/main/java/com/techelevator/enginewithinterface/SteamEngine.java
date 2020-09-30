package com.techelevator.enginewithinterface;

public class SteamEngine implements IEngine {
	
	private boolean isStarted;

	@Override
	public boolean startEngine() {
		isStarted = true;
		System.out.println("Starting a steam engine... please stand by");
		return isStarted;
	}

	@Override
	public boolean stopEngine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void performMaintenance(String type) {
		// TODO Auto-generated method stub

	}
	
	
	public void shovelCoal(int numberOfShovels) {
		// pretend I was shoveling...
	}

}
