package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReportFileWriter {
	
	private File report;
	private PrintWriter writer;
	
	public ReportFileWriter(String absoluteFilePath, String fileName) throws IOException, ReportExistsException {
		report = new File(absoluteFilePath, fileName);  //creates an object that represents file or directory data
		
		if (report.exists()) {
			throw new ReportExistsException("Report Already Exists!", 100);  //example of custom exception type
		}
		else {
			try {
				report.createNewFile();   // creates the actual file or directory
			} 
			catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		}
		
		writer = new PrintWriter(report);
	
		
	}
	
	
	/**
	 * This method takes a formatted string (report line item) and writes it to the report file
	 * @param formattedString
	 */
	public void writeLine(String formattedString) {
		
		writer.println(formattedString);
		writer.flush();
		
	}
	

}
