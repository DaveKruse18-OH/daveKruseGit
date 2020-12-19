package dek.root;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	
	//DataInputStream input;
	Scanner input;
	
	public FileReader() {
		// Do nothing.
	}
	
	public void OpenFile() throws FileNotFoundException {
		//input = new DataInputStream(new BufferedInputStream(new FileInputStream("c:\\Users\\dave_\\gitRepository\\daveKruseGit\\root-insurance-kata\\src\\dek\\root\\input.txt")));
		File file = new File("c:\\Users\\dave_\\gitRepository\\daveKruseGit\\root-insurance-kata\\src\\dek\\root\\input.txt");
		input = new Scanner(file);
	
	}
	
	public String ReadNextLine() {
		String nextLine = null;
		//nextLine = input.readLine();\
		if (input.hasNext()) {
			nextLine = input.nextLine();
		}
		
		return nextLine;
	}
}
