package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordCount {
	private Scanner myInputScanner;
	private Scanner myFileScanner;
	private String fileName;
	private String searchWord;
	private String caseSensitive;

	public static void main(String[] args) {
		WordCount wordCount = new WordCount();
		wordCount.getInputs();
		wordCount.performSearch();
		wordCount.closeFile();
	}
	
	private void getInputs() {
		myInputScanner = new Scanner(System.in);
		boolean fileOpened = false;
		while (!fileOpened) {
			try {
				System.out.println("What is the file that should be searched?");
				fileName = myInputScanner.nextLine();
				
				File myFile = new File(fileName);
				myFileScanner = new Scanner(myFile);
				fileOpened = true;
				
				//System.out.println("File successfully opened! " + fileName);
			}
			catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println("");
				System.out.println("ERROR - File Not Found!");
				System.out.println("");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("What is the search word you are looking for?");
		searchWord = myInputScanner.nextLine();
		
		System.out.println("Should the search be case sensitive? (Y\\N)");
		caseSensitive = myInputScanner.nextLine().toUpperCase();
	}
	
	private void performSearch() {
		// Read all lines in the file and process one at a time.
		try {
			int lineNum = 1;
			String line = myFileScanner.nextLine();
			while (line != null) {
				boolean wordFound = searchLine(line);
				if (wordFound) {
					System.out.println(lineNum + ") " + line);
				}
				
				lineNum++;
				line = myFileScanner.nextLine();
			}
		}
		catch (NoSuchElementException e) {
			System.out.println("-- End Of File --");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean searchLine(String lineToSearch) {
		boolean ret = false;
		
		String[] words = lineToSearch.split(" ");
		for (String w : words) {
			if (caseSensitive.equals("Y")) {
				if (w.equals(searchWord)) {
					ret = true;
				}
			} else {
				if (w.equalsIgnoreCase(searchWord)) {
					ret = true;
				}
			}
		}
		return ret;
	}
	
	public void closeFile() {
		myFileScanner.close();
	}

}
