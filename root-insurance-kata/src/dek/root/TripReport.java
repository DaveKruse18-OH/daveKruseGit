package dek.root;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TripReport {
	private List<Trip> workingTripList = new ArrayList<Trip>();
	private List<DriverTripReport> driverReport = new ArrayList<DriverTripReport>();
	
	public void buildUserReport(String driverName, List<Trip> tripList) {
		System.out.println("User Name: " + driverName);
		System.out.println("tripList: " + tripList);
		
		// Process the drivers one at a time.
		// Build working list for current driver of all their trips.
		workingTripList.clear();     // Clear to start over with the next driver.
		Iterator<Trip> itr = tripList.iterator();
		while (itr.hasNext()) {
			// If Driver of trip matches the driver name, move trip to working list.
			Trip nextTrip = itr.next();
			String name = nextTrip.getDriverName();
			if (name.toLowerCase().equals(driverName.toLowerCase())) {
				workingTripList.add(nextTrip);
			}
		}
		
		double totalUserTime = calculateTotalTime();
		double totalUserMiles = calculateTotalMiles();
		
		DriverTripReport dtr = new DriverTripReport();
		dtr.setDriverName(driverName);
		dtr.setTotalTime(totalUserTime);
		dtr.setTotalMiles(totalUserMiles);
		if ((totalUserTime == 0) || (totalUserMiles == 0)) {
			dtr.setAvgMph(0.0);
		} else {
			dtr.setAvgMph((60 / totalUserTime) * totalUserMiles);
		}
		driverReport.add(dtr);
		
		System.out.println("break");
	}
	
	public void displayFinalReport() {
		// Look through final list for the driver with the most miles.
		DriverTripReport driverToReport = null;
		//double milesDriven = 0.0;
		
		
		while (!driverReport.isEmpty()) {
			double milesDriven = 0.0;
			// Loop through the driverTripReport list, reporting on each driver, till it is exhausted.
			Iterator<DriverTripReport> itr = driverReport.iterator();
			while (itr.hasNext()) {
				DriverTripReport nextDriverReport = itr.next();
				double tempMilesDriven = nextDriverReport.getTotalMiles();
				if (tempMilesDriven >= milesDriven) {
					driverToReport = nextDriverReport;
					milesDriven = driverToReport.getTotalMiles();
				}
			}
			
			// Report!
			System.out.printf("Report: %s %f miles @ %f mph\n",
					driverToReport.getDriverName(),
					driverToReport.getTotalMiles(),
					driverToReport.getAvgMph());
			driverReport.remove(driverToReport);
			//itr = driverReport.iterator();	// Reset iterator.
		}
	}
	
	private double calculateTotalTime() {
		// Process working list.
		//System.out.println("break");
		double totalTime = 0.0;
		Iterator<Trip> itr = workingTripList.iterator();
		while (itr.hasNext()) {
			Trip nextTrip = itr.next();
			int startMinute = nextTrip.getStartMinute();
			int startHour = nextTrip.getStartHour();
			int startMinutes = (startHour * 60) + startMinute;
			int stopMinute = nextTrip.getStopMinute();
			int stopHour = nextTrip.getStopHour();
			int stopMinutes = (stopHour * 60) + stopMinute;
				
			totalTime = totalTime + (stopMinutes - startMinutes);
		}
		
		return totalTime;
	}
	
	private double calculateTotalMiles() {
		double totalMiles = 0.0;
		Iterator<Trip> itr = workingTripList.iterator();
		while (itr.hasNext()) {
			Trip nextTrip = itr.next();
			totalMiles = totalMiles + nextTrip.getMiles();
		}
		
		return totalMiles;
	}
}
