package fr.uga.projet1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.uga.projet1.poo.Calcul;

public class CalculTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSomme() {
		// fail("Not yet implemented");
		int a= 5 ,b = 5;
		assert Calcul.somme(a , b) == 10;
		
		
	}

}
