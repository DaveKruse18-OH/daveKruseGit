package dek.root.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import dek.root.RootController;

public class RootControllerTest {

	@Test
	public void testRootController() throws FileNotFoundException {
		RootController cntrl = new RootController("input.txt");
		cntrl.InitializeAndRun();
	}

}
