package dek.root;

/*
 * Driver Trip Report object for Root Insurance Kata
 * 
 * @author	Dave Kruse
 * @version 1.0
 * @since	2020-12-20
 * 
 */
public class DriverTripReport {
	private String driverName;
	private double totalTime;
	private double totalMiles;
	private double avgMph;
	
	/*
	 * Gets drivers name for current Driver Trip Report object.
	 * @return String - drivers name of the current object.
	 */
	public String getDriverName() {
		return driverName;
	}
	
	/*
	 *  Sets drivers name for the current Driver Trip Report object.
	 *  @param String - drivers name of the current object.
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	/*
	 * Gets total time for the current Driver Trip Report object.
	 * @return double - total time of the current object in minutes.
	 */
	public double getTotalTime() {
		return totalTime;
	}
	
	/*
	 * Sets total time (in minutes) for the current Driver Trip Report object.
	 * @param double - total time of the current object in minutes.
	 */
	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}
	
	/*
	 * Gets total miles for the current Driver Trip Report object.
	 * @return double - total miles of the current object.
	 */
	public double getTotalMiles() {
		return totalMiles;
	}
	
	/*
	 * Sets total miles for the current Driver Trip Report object.
	 * @param double - total miles of the current object.
	 */
	public void setTotalMiles(double totalMiles) {
		this.totalMiles = totalMiles;
	}
	
	/*
	 * Gets average mph for the current Driver Trip Report object.
	 * @return double - average mph of the current object.
	 */
	public double getAvgMph() {
		return avgMph;
	}
	
	/*
	 * Sets the average mph for the current Driver Trip Report object.
	 * @param double - average mph of the current object.
	 */
	public void setAvgMph(double avgMph) {
		this.avgMph = avgMph;
	}
}
