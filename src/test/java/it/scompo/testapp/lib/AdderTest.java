package it.scompo.testapp.lib;

import static org.junit.Assert.*;
import it.scompo.testapp.lib.api.adder.Adder;
import it.scompo.testapp.lib.impl.ScompoAdder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdderTest {
	
	private static final Integer FIRST_NUMBER = 10;
	private static final Integer SECOND_NUMBER = 3;
	
	private static final Integer RESULT_SUM = FIRST_NUMBER + SECOND_NUMBER;
	
	private Adder adder = null;

	@Before
	public void setUp() throws Exception {
		adder = ScompoAdder.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		adder = null;
	}

	@Test
	public void testGetInstance() {
		assertNotNull("adder is null!",adder);
	}

	@Test
	public void testAdd() {
		Integer res = adder.add(FIRST_NUMBER, SECOND_NUMBER);
		assertEquals(RESULT_SUM, res);
	}

}
