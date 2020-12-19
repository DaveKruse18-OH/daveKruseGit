package dek.root;

import java.util.ArrayList;
import java.util.List;

public class DriverList {
	List<Driver> driversList = new ArrayList<Driver>();

	public void addDriver(String newDriverName) {
		Driver newDriver = new Driver();
		newDriver.setName(newDriverName);
		driversList.add(newDriver);
	}
	
	public void removeDriver() {
		
	}
	
	public List<Driver> getDriversList() {
		return driversList;
	}

	public void setDriversList(List<Driver> driversList) {
		this.driversList = driversList;
	}
	
}
