package dek.root;

import java.util.ArrayList;
import java.util.List;

public class TripList {
	private List<Trip> tripList = new ArrayList<Trip>();

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
	
	public List<Trip> getTripList() {
		return tripList;
	}

	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}
	
}
