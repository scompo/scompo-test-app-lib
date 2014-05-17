package it.scompo.testapp.lib;

import static org.junit.Assert.*;
import it.scompo.testapp.lib.api.subtracter.Subtracter;
import it.scompo.testapp.lib.impl.ScompoSubtracter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubtracterTest {

	private static final Integer FIRST_NUMBER = 10;
	private static final Integer SECOND_NUMBER = 3;

	private static final Integer RESULT_SUBTRACTION = FIRST_NUMBER
			- SECOND_NUMBER;

	private Subtracter subtracter = null;

	@Before
	public void setUp() throws Exception {
		subtracter = ScompoSubtracter.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		subtracter = null;
	}

	@Test
	public void testGetInstance() {
		assertNotNull("subtracter is null!", subtracter);
	}

	@Test
	public void testSubtract() {

		Integer res = subtracter.subtract(FIRST_NUMBER, SECOND_NUMBER);

		assertEquals(RESULT_SUBTRACTION, res);
	}

}
