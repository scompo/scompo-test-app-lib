package it.scompo.testapp.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import it.scompo.testapp.lib.api.calculator.Calculator;
import it.scompo.testapp.lib.api.calculator.Calculator.Operands;
import it.scompo.testapp.lib.impl.ScompoCalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private static final Integer FIRST_NUMBER = 10;
	private static final Integer SECOND_NUMBER = 3;
	
	private static final Integer RESULT_SUM = FIRST_NUMBER + SECOND_NUMBER;
	private static final Integer RESULT_SUBTRACTION = FIRST_NUMBER - SECOND_NUMBER;
	
	private Calculator calculator = null;

	@Before
	public void setUp() throws Exception {
		
		calculator = ScompoCalculator.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		
		calculator = null;
		
	}

	@Test
	public void testGetInstance() {
		assertNotNull("calculator is null!", calculator);
	}

	@Test
	public void testCalculatePlus() {
		
		Integer res = calculator.calculate(Operands.PLUS, FIRST_NUMBER, SECOND_NUMBER);
		
		assertEquals(RESULT_SUM, res);	
	}
	
	@Test
	public void testCalculateMinus() {
		
		Integer res = calculator.calculate(Operands.MINUS, FIRST_NUMBER, SECOND_NUMBER);
		
		assertEquals(RESULT_SUBTRACTION, res);	
	}
	
}
