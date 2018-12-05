package fr.uga.projet1.genericite;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.uga.projet1.poo.Contact;

public class PermutToolTest{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		PermutTool<Integer> testPermut = new PermutTool();
		testPermut.a = 2;
		testPermut.b = 10;
		testPermut.permute();
		assertTrue(testPermut.a==10);
		assertTrue(testPermut.b==10);
		
	}

	
}
