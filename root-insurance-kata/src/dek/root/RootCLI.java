package dek.root;

import java.io.FileNotFoundException;

public class RootCLI {
	static FileReader fr;
	
	/*
	 * 
	 */
	public RootCLI() {
		// Do nothing.
	}
	
	/*
	 * 
	 */
	public void Initialize() throws FileNotFoundException {
		fr = new FileReader();
		fr.OpenFile();
		processInputFile();
	}
	
	/*
	 * 
	 */
	private void processInputFile() {
		String nextLine = "";
		while (nextLine != null) {
			nextLine = fr.ReadNextLine();
			System.out.println(nextLine);
		}
	}
}
