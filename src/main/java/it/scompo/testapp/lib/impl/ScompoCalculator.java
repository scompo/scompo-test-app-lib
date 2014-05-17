package it.scompo.testapp.lib.impl;

import it.scompo.testapp.lib.api.calculator.AbstractCalculator;
import it.scompo.testapp.lib.api.calculator.Calculator;

/**
 * My implementation of {@link AbstractCalculator}.
 * 
 * @author mscomparin
 */
public class ScompoCalculator extends AbstractCalculator {

	/**
	 * This class it's used for thread safety and lazy init.
	 * 
	 * @author mscomparin
	 */
	private static class Holder {
		private final static Calculator instance = new ScompoCalculator();
	}

	/**
	 * Private empty constructor.
	 */
	private ScompoCalculator() {
		setAdder(ScompoAdder.getInstance());
		setSubtracter(ScompoSubtracter.getInstance());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.scompo.testapp.lib.api.commons.Singleton#getInstance()
	 */
	public static Calculator getInstance() {
		return Holder.instance;
	}

}
