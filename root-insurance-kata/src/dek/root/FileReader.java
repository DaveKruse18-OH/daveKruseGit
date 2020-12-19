package dek.root;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	String inputFileName;
	Scanner input;
	
	/*
	 * File Reader class default constructor.
	 */
	public FileReader(String inputFileName) {
		this.inputFileName = inputFileName;
	}
	
	/*
	 * Method to open the default file for this exercise.
	 * Input file is hard coded.
	 */
	public void OpenFile() throws FileNotFoundException {
		File file = new File("c:\\Users\\dave_\\gitRepository\\daveKruseGit\\root-insurance-kata\\src\\dek\\root\\" + inputFileName);
		input = new Scanner(file);
	
	}
	
	/*
	 * Method to read and return the next line in the input file.
	 * @return the just read input string.  If EOF, then return null.
	 */
	public String ReadNextLine() {
		String nextLine = null;
		if (input.hasNext()) {
			nextLine = input.nextLine();
		}
		
		return nextLine;
	}
	
	/*
	 * Clean-up method to close input file stream.
	 */
	public void CloseFile() {
		input.close();
	}
}
