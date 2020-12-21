package dek.root;

import java.io.FileNotFoundException;

/*
 * Main for Root Insurance Kata.  Purpose is to launch the associated kata.
 * 
 * @author	Dave Kruse
 * @version 1.0
 * @since	2020-12-20
 * 
 */
public class main {
	
	/*
	 * Program main method to get things started.  Starts by establishing a new File
	 * Reader object and then opening the input file.  File needs to exist in the same
	 * root directory where this program lives...
	 * Absolute path: c:\\users\\dave_\\gitRepository\\daveKruseGit\\root-insurance-kata
	 */
	public static void main(String args[]) throws FileNotFoundException {
		RootController cntlr = new RootController(args[0]);
		cntlr.InitializeAndRun();
	}
}
