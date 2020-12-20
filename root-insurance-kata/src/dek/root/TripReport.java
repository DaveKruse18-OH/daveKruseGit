package dek.root;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Trip report object for Root Insurance Kata
 * 
 * @author	Dave Kruse
 * @version 1.0
 * @since	2020-12-20
 * 
 */
public class TripReport {
	private List<Trip> workingTripList = new ArrayList<Trip>();
	private List<DriverTripReport> driverReport = new ArrayList<DriverTripReport>();
	
	/*
	 * Builds working list by driver of all of their trips.
	 * @param String - driver name of list to build.
	 * @param List<Trip> - current comprehensive trip list to pull current driver's
	 * trips from.
	 */
	public void buildUserReport(String driverName, List<Trip> tripList) {
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
	}
	
	/*
	 * Method to display the final report.
	 */
	public void displayFinalReport() {
		// Look through final list for the driver with the most miles.
		DriverTripReport driverToReport = null;
		
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
			if (driverToReport.getTotalMiles() != 0) {
				System.out.printf("%s %-1.0f miles @ %-1.0f mph\n",
					driverToReport.getDriverName(),
					driverToReport.getTotalMiles(),
					driverToReport.getAvgMph());
				//driverReport.remove(driverToReport);
			} else {
				System.out.printf("%s %-1.0f miles\n",
					driverToReport.getDriverName(),
					driverToReport.getTotalMiles());
			}
			driverReport.remove(driverToReport);
		}
	}
	
	/*
	 * Private method to calculate the total time for a specific driver.
	 * @return double - total time driven for a specific driver, in minutes.
	 */
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
	
	/*
	 * Private method to calculate the total miles for a specific driver.
	 * return double - total miles driven for a specific driver.
	 */
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
