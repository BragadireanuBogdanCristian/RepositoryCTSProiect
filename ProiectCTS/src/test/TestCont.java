package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import proiect.AdresaClient;
import proiect.AutentificareCont;
import proiect.Cont;

public class TestCont extends TestCase {
	String numeCont;
	Cont c=new Cont(0, numeCont, 0, 0);;
	
	public TestCont(String name){
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
		System.out.println("Apel");
		numeCont="Cont1";
		c = new Cont(0, numeCont, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Apel tearDown");
	}

	@Test
	public void testGetTitular() {
		assertEquals(new Cont(1,"Dan",0,0).getTitular(), "Dan");
	}
	
	@Test
	public void testCredit() {
		assertEquals(new Cont(1,"Dan",0,0).ofertaCredit(), 3000.0);
	}
	
	@Test
	public void testAdresa(){
		assertEquals(new AdresaClient("Ialomita","Slobozia","1 Mai",100).getOras(),"Slobozia");
	}
	
	@Test
	public void testAutentificare(){
		assertNotNull(AutentificareCont.getAutentificareCont().instance);
	}

}
