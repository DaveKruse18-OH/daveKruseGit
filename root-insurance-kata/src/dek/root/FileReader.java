package dek.root;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	
	public FileReader() {
		// Do nothing.
	}
	
	public void ReadFile( ) throws FileNotFoundException {
		DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("c:\\Users\\dave_\\gitRepository\\daveKruseGit\\root-insurance-kata\\src\\dek\\root\\input.txt")));
		
		String line = null;
		try {
			line = input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(line);
	}
}
