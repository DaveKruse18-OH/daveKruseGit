package com.techelevator;

public class Airplane {
	private String planeNumber = null;
	private int bookedFirstClassSeats = 0;
	private int availableFirstClassSeats = 0;
	private int totalFirstClassSeats = 0;
	private int bookedCoachSeats = 0;
	private int availableCoachSeats = 0;
	private int totalCoachSeats = 0;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		availableFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		availableCoachSeats = totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		boolean ret = false;
		
		if (forFirstClass) {
			if (availableFirstClassSeats >= totalNumberOfSeats) {
				availableFirstClassSeats = availableFirstClassSeats - totalNumberOfSeats;
				bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
				ret = true;
			}
		} else if (!forFirstClass) {
			if (availableCoachSeats >= totalNumberOfSeats) {
				availableCoachSeats = availableCoachSeats - totalNumberOfSeats;
				bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
				ret = true;
			}
		}
		
		return ret;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		return availableFirstClassSeats;
	}
	
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	
	public int getAvailableCoachSeats() {
		return availableCoachSeats;
	}
	
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
}
