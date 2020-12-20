package dek.root;

import java.util.ArrayList;
import java.util.List;

/*
 * Driver List object for Root Insurance Kata
 * 
 * @author	Dave Kruse
 * @version 1.0
 * @since	2020-12-20
 * 
 */
public class DriverList {
	List<Driver> driversList = new ArrayList<Driver>();

	/*
	 * Add a new driver object to the drivers list.
	 * @param String - name of the new driver to be added to the list.
	 */
	public void addDriver(String newDriverName) {
		Driver newDriver = new Driver();
		newDriver.setName(newDriverName);
		driversList.add(newDriver);
	}
	
	/*
	 * Stub for method to removeDriver.  Not needed at this time.
	 */
	public void removeDriver() {
		
	}
	
	/*
	 * Returns the current list of drivers.
	 * @return List<Driver> - returns list of Driver objects.
	 */
	public List<Driver> getDriversList() {
		return driversList;
	}

	/*
	 * Sets the current drivers list to a new list of Driver objects.
	 * @param List<Driver> - List of Driver objects to set the current drivers list to.
	 */
	public void setDriversList(List<Driver> driversList) {
		this.driversList = driversList;
	}
	
}
