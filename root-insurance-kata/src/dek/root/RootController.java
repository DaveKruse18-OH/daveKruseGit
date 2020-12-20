package dek.root;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

public class RootController {
	private FileReader fr;
	private String inputFileName;
	private DriverList driverList = new DriverList();
	private TripList tripList = new TripList();
	
	/*
	 * 
	 */
	public RootController(String inputFileName) {
		this.inputFileName = inputFileName;
	}
	
	/*
	 * 
	 */
	public void Initialize() throws FileNotFoundException {
		fr = new FileReader(inputFileName);
		fr.OpenFile();
		buildMemoryWorkingLists();
		cleanLists();
		generateReport();
		fr.CloseFile();
		//showLists();
	}
	
	/*
	 * 
	 */
	private void buildMemoryWorkingLists() {
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
	}
	
	private void cleanLists() {
		// Process Trip List eliminating trips that average <5 mph or >100 mph.
		//try {
		List<Trip> tl = tripList.getTripList();
		Iterator<Trip> itr = tl.iterator();
		while (itr.hasNext()) {
			Trip temp = itr.next();
			double mph = tripList.getMilesPerHour(temp);
			if ((mph < 5.0) || (mph > 100.0)) {
				tripList.removeTrip(temp);
				// Reset list after removal of element.
				tl = tripList.getTripList();
				itr = tl.iterator();
			}
			//System.out.println("mph: " + mph);
		}
		//}
		//catch(Exception e) {
			// Error iterating beyond end of list due to removal of element.
			// Eat the error.
		//	System.out.println("Error: " + e);
		//}
	}
	
	/*
	 * 
	 */
	private void generateReport() {
		TripReport tr = new TripReport();
		//List<Driver> dl = driverList.getDriversList();
		List<Trip> tl = tripList.getTripList();
		
		// Process the drivers one at a time.
		List<Driver> dl = driverList.getDriversList();
		Iterator<Driver> itr = dl.iterator();
		while (itr.hasNext()) {
			Driver nextDriver = itr.next();
			String driverName = nextDriver.getName();
			tr.buildUserReport(driverName, tl);
		}
		
		tr.displayFinalReport();
	}
	
	private void showLists() {
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
