/**
 * 
 */
package fr.uga.projet1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.uga.projet1.poo.Contact;

/**
 * @author java-formation-02
 *
 */
public class ContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setupBC");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDAC");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link fr.uga.projet1.poo.Contact#Contact(int, java.lang.String)}.
	 */
	@Test
	public void testContactIntString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.uga.projet1.poo.Contact#setNom(java.lang.String)}.
	 */
	@Test
	public void testSetNom() {
        Contact c1 = new Contact();
        try {
                c1.setNom("A");
                fail("erreur setNom");
        } catch (Exception e) {
                assertEquals("Erreur : nom obligatoire (2 carac min)",e.getMessage());
        }
	}

	/**
	 * Test method for {@link fr.uga.projet1.poo.Contact#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		
        Contact c1 = new Contact();
        Contact c2 = new Contact();
        c1.setId(1);
        c2.setId(1);
        assertTrue(c1.equals(c2));
        
        
        c2.setId(56);
        assertFalse(c1.equals(c2));
    }

}
