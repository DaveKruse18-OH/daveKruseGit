package com.techelevator;

public class Elevator {
	private int currentFloor = 0;
	private int numberOfFloors = 0;
	private boolean doorOpen = false;

	public Elevator(int totalNumberOfFloors) {
		numberOfFloors = totalNumberOfFloors;
		currentFloor = 1;
	}
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if ((!doorOpen) && (desiredFloor > currentFloor)) {
			if (desiredFloor > numberOfFloors) {
				currentFloor = numberOfFloors;
			} else {
				currentFloor = desiredFloor;
			}
		}
	}
	
	public void goDown(int desiredFloor) {
		if ((!doorOpen) && (desiredFloor < currentFloor)) {
			if (desiredFloor < 1) {
				currentFloor = 1;
			} else {
				currentFloor = desiredFloor;
			}
		}
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
}
