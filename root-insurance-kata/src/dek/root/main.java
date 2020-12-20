package dek.root;

import java.io.FileNotFoundException;

public class main {
	
	/*
	 * Program main method to get things started.  Starts by establishing a new File
	 * Reader object and then opening the input file.
	 */
	public static void main(String args[]) throws FileNotFoundException {
		RootController cntlr = new RootController(args[0]);
		cntlr.Initialize();
	}
}
