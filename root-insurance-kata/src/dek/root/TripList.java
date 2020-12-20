package dek.root;

import java.util.ArrayList;
import java.util.List;

public class TripList {
	private List<Trip> tripList = new ArrayList<Trip>();

	/*
	 * 
	 */
	public void addTrip(String name, String start, String stop, String miles) {
		Trip newTrip = new Trip();

		// Set name.
		newTrip.setDriverName(name);
		
		// Set start time.
		String[] startTime = start.split(":");
		newTrip.setStartHour(Integer.parseInt(startTime[0]));
		newTrip.setStartMinute(Integer.parseInt(startTime[1]));
		
		// Set end time.
		String[] stopTime = stop.split(":");
		newTrip.setStopHour(Integer.parseInt(stopTime[0]));
		newTrip.setStopMinute(Integer.parseInt(stopTime[1]));
		
		// Set miles.
		newTrip.setMiles(Double.parseDouble(miles));
		
		// Add new trip to list.
		tripList.add(newTrip);
	}
	
	/*
	 * 
	 */
	public void removeTrip(Trip tripToRemove) {
		tripList.remove(tripToRemove);
	}
	
	/*
	 * 
	 */
	private int getTime(Trip trip) {
		int startMinute = trip.getStartMinute();
		int startHour = trip.getStartHour();
		int startMinutes = (startHour * 60) + startMinute;
		int stopMinute = trip.getStopMinute();
		int stopHour = trip.getStopHour();
		int stopMinutes = (stopHour * 60) + stopMinute;
		
		return stopMinutes - startMinutes;
	}
	
	/*
	 * 
	 */
	private double getDistance(Trip trip) {
		return trip.getMiles();
	}
	
	/*
	 * 
	 */
	public double getMilesPerHour(Trip trip) {
		double timeMinutes = this.getTime(trip);
		double timeHours = (timeMinutes / 60);
		double distanceMiles = this.getDistance(trip);
		
		// Return mph.
		return (distanceMiles / timeHours);
	}
	
	/*
	 * 
	 */
	public List<Trip> getTripList() {
		return tripList;
	}

	/*
	 * 
	 */
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}
	
}
