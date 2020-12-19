package dek.root;

public class Trip {
	private String driverName;
	private int StartHour;
	private int StartMinute;
	private int StopHour;
	private int StopMinute;
	private double miles;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getStartHour() {
		return StartHour;
	}
	public void setStartHour(int startHour) {
		StartHour = startHour;
	}
	public int getStartMinute() {
		return StartMinute;
	}
	public void setStartMinute(int startMinute) {
		StartMinute = startMinute;
	}
	public int getStopHour() {
		return StopHour;
	}
	public void setStopHour(int stopHour) {
		StopHour = stopHour;
	}
	public int getStopMinute() {
		return StopMinute;
	}
	public void setStopMinute(int stopMinute) {
		StopMinute = stopMinute;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	
	
	
}
