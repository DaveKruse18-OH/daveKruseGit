package dek.root;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

public class RootCLI {
	FileReader fr;
	String inputFileName;
	
	/*
	 * 
	 */
	public RootCLI(String inputFileName) {
		this.inputFileName = inputFileName;
	}
	
	/*
	 * 
	 */
	public void Initialize() throws FileNotFoundException {
		fr = new FileReader(inputFileName);
		fr.OpenFile();
		processInputFile();
	}
	
	/*
	 * 
	 */
	private void processInputFile() {
		DriverList driverList = new DriverList();
		TripList tripList = new TripList();
		String nextLine = "";
		
		while (nextLine != null) {
			nextLine = fr.ReadNextLine();
			if (nextLine != null) {
				
				String[] line = nextLine.split(" ");
				if (line[0].toLowerCase().equals("driver")) {
					// Build drivers list.
					driverList.addDriver(line[1]);
				}
				else if (line[0].toLowerCase().equals("trip")) {
					//Build trip list.
					tripList.addTrip(line[1], line[2], line[3], line[4]);
				}
			}
		}
		
		List<Driver> dl = driverList.getDriversList();
		Iterator<Driver> itr = dl.iterator();
		while (itr.hasNext()) {
			Driver tempDriver = itr.next();
			System.out.println("Driver Name: " + tempDriver.getName());
		}
		
		List<Trip> tl = tripList.getTripList();
		Iterator<Trip> itr2 = tl.iterator();
		while (itr2.hasNext()) {
			Trip tempTrip = itr2.next();
			System.out.println("Trip : " + tempTrip.getDriverName() + " " +
					tempTrip.getStartHour() + ":" + tempTrip.getStartMinute() + " " +
					tempTrip.getStopHour() + ":" + tempTrip.getStopMinute() + " " +
					tempTrip.getMiles());
		}
	}
}
