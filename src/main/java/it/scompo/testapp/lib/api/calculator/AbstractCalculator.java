/**
 * AbstractCalculator.java
 */
package it.scompo.testapp.lib.api.calculator;

import it.scompo.testapp.lib.api.adder.Adder;
import it.scompo.testapp.lib.api.subtracter.Subtracter;

/**
 * Abstract implementation of calculator.
 * 
 * @author mscomparin
 */
public abstract class AbstractCalculator implements Calculator {

	/**
	 * an {@link Adder} implementation.
	 */
	private Adder adder;

	/**
	 * a {@link Subtracter} implementation.
	 */
	private Subtracter subtracter;

	/**
	 * @return the adder
	 */
	public Adder getAdder() {
		return adder;
	}

	/**
	 * @param adder
	 *            the adder to set
	 */
	protected void setAdder(Adder adder) {
		this.adder = adder;
	}

	/**
	 * @return the subtracter
	 */
	public Subtracter getSubtracter() {
		return subtracter;
	}

	/**
	 * @param subtracter
	 *            the subtracter to set
	 */
	protected void setSubtracter(Subtracter subtracter) {
		this.subtracter = subtracter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.scompo.testapp.lib.api.calculator.Calculator#calculate(it.scompo.testapp
	 * .lib.api.calculator.Calculator.Operands, java.lang.Integer,
	 * java.lang.Integer)
	 */
	public Integer calculate(Operands operand, Integer first, Integer second) {

		Integer res = null;

		switch (operand) {

		case PLUS:

			res = adder.add(first, second);
			break;

		case MINUS:

			res = subtracter.subtract(first, second);
			break;

		default:

			throw new IllegalArgumentException("Operation not supported yet.");

		}

		return res;
	}

}
