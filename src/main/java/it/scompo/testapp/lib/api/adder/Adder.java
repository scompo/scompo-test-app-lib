package it.scompo.testapp.lib.api.adder;


public interface Adder{

	/**
	 * Statically sums the 2 {@link Integer} parameters.
	 * 
	 * @param a
	 *            the first {@link Integer} operand.
	 * @param b
	 *            the second {@link Integer} operand.
	 * 
	 * @return the sum of a + b.
	 */
	public abstract Integer add(Integer a, Integer b);

}