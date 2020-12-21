package dek.root;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/*
 * Controller object for Root Insurance Kata
 * 
 * @author	Dave Kruse
 * @version 1.0
 * @since	2020-12-20
 * 
 */
public class RootController {
	private FileReader fr;
	private String inputFileName;
	private DriverList driverList = new DriverList();
	private TripList tripList = new TripList();
	
	/*
	 * Sets the input file name to process.
	 */
	public RootController(String inputFileName) {
		this.inputFileName = inputFileName;
	}
	
	/*
	 * Opens and process the provided input file.
	 */
	public void InitializeAndRun() throws FileNotFoundException {
		fr = new FileReader(inputFileName);
		fr.OpenFile();
		buildMemoryWorkingLists();
		cleanLists();
		generateReport();
		fr.CloseFile();
	}
	
	/*
	 * Builds the working list of drivers and trips in memory.
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
	
	/*
	 * Removes the trips that are automatically eliminated via the rules.
	 * That is trips that average < 5 mph or > 100 mph.
	 */
	private void cleanLists() {
		// Process Trip List eliminating trips that average <5 mph or >100 mph.
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
		}
	}
	
	/*
	 * Method that generates the final report.
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
}
