/**
 * Calculator.java
 */
package it.scompo.testapp.lib.api.calculator;



/**
 * Defines the methods a {@link Calculator} should have.
 * 
 * @author mscomparin
 */
public interface Calculator{

	/**
	 * {@link Operands} defines operands.
	 * 
	 * @author mscomparin
	 * 
	 */
	public enum Operands {

		/**
		 * Defines a sum.
		 */
		PLUS,

		/**
		 * Defines a subtraction.
		 */
		MINUS
	}

	/**
	 * Calculate something.
	 * 
	 * @param operand
	 *            the operand to apply.
	 * 
	 * @param first
	 *            the first {@link Integer}.
	 * 
	 * @param second
	 *            the second {@link Integer}.
	 * 
	 * @return the result of the operation.
	 */
	Integer calculate(Operands operand, Integer first, Integer second);

}
