package dek.root;

import java.io.FileNotFoundException;

public class rootCLI {
	public static void main(String args[]) throws FileNotFoundException {
		//System.out.println("Hello world!");
		
		FileReader fr = new FileReader();
		fr.OpenFile();
		
		String nextLine = "";
		while (nextLine != null) {
			nextLine = fr.ReadNextLine();
			System.out.println(nextLine);
		}
	}
}
