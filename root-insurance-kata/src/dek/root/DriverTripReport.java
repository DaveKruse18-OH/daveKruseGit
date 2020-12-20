package dek.root;

public class DriverTripReport {
	private String driverName;
	private double totalTime;
	private double totalMiles;
	private double avgMph;
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public double getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}
	public double getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(double totalMiles) {
		this.totalMiles = totalMiles;
	}
	public double getAvgMph() {
		return avgMph;
	}
	public void setAvgMph(double avgMph) {
		this.avgMph = avgMph;
	}
	
	
}
