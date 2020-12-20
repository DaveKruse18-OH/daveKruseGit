package dek.root;

import java.util.ArrayList;
import java.util.List;

/*
 * Trip list object for Root Insurance Kata
 * 
 * @author	Dave Kruse
 * @version 1.0
 * @since	2020-12-20
 * 
 */
public class TripList {
	private List<Trip> tripList = new ArrayList<Trip>();

	/*
	 * Adds a Trip object to the tripList.
	 * @param String - driver name of the object being added.
	 * @param String - start time of the object being added.
	 * @param String - stop time of the object being added.
	 * @param String - miles of the object being added.
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
	 * Removes Trip object from the current trip list.
	 * @param Trip - trip to remove.
	 */
	public void removeTrip(Trip tripToRemove) {
		tripList.remove(tripToRemove);
	}
	
	/*
	 * Gets time, in minutes, of the trip being handed in.
	 * @param Trip - trip being requested.
	 * @return - minutes of total time of trip.
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
	 * Gets distance of the trip being handed in.
	 * @param Trip - trip being requested.
	 * @return double - total miles of the trip.
	 */
	private double getDistance(Trip trip) {
		return trip.getMiles();
	}
	
	/*
	 * Gets mph of the trip being handed in.
	 * @param Trip - trip being requested.
	 * @return double - average mph of the trip.
	 */
	public double getMilesPerHour(Trip trip) {
		double timeMinutes = this.getTime(trip);
		double timeHours = (timeMinutes / 60);
		double distanceMiles = this.getDistance(trip);
		
		// Return mph.
		return (distanceMiles / timeHours);
	}
	
	/*
	 * Gets the current trip list.
	 * @return List<Trip> - current list of Trip objects.
	 */
	public List<Trip> getTripList() {
		return tripList;
	}

	/*
	 * Sets the current trip list.
	 * @param List<Trip> - new trip list.
	 */
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}
}
