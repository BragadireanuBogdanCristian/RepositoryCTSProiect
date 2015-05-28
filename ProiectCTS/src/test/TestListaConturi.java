package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import proiect.Cont;
import proiect.ListaConturi;

public class TestListaConturi extends TestCase {
	
	public TestListaConturi(String name){
		super(name);
		}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ListaConturi l = new ListaConturi();
		System.out.println("Creare obiecte pentru test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Apel tearDown");
	}

	
	@Test
	public void testCredit() {
		
		Assert.assertEquals(new ListaConturi().CreditTotalClienti(), 10000.0);
		fail("Creditul total al clientilor nu este in valoare de 10000");
	}

}
