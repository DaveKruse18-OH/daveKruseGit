package dek.root.test;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import org.junit.Test;
import dek.root.main;

public class mainTest {

	@Test
	public void testMain() throws FileNotFoundException {
		String[] args = {"input.txt"};
		main testMain = new main();
		testMain.main(args);
	}

}
