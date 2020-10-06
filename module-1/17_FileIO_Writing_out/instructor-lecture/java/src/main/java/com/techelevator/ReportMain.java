package com.techelevator;

import java.io.IOException;

public class ReportMain {

	public static void main(String[] args) {
		
	ReportFileWriter reportWriter = null;

	try {
		reportWriter = new ReportFileWriter("New", "report.txt");
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (ReportExistsException e) {
		e.printStackTrace();
	}
	
	if (reportWriter != null) {
	    reportWriter.writeLine("12-1-2019 SOLD PAINT CAN 3.99");
	    reportWriter.writeLine("12-1-2019 SOLD PAINT CAN 4.99");
	}
	

		

	}

}
