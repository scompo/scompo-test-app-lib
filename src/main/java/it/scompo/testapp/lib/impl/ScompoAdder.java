/**
 * ScompoAdder.java
 */
package it.scompo.testapp.lib.impl;

import it.scompo.testapp.lib.api.adder.AbstractAdder;
import it.scompo.testapp.lib.api.adder.Adder;

/**
 * My implementation of {@link Adder}.
 * 
 * @author mscomparin
 */
public class ScompoAdder extends AbstractAdder {

	/**
	 * This class it's used for thread safety and lazy init.
	 * 
	 * @author mscomparin
	 */
	private static class Holder {
		private final static Adder instance = new ScompoAdder();
	}

	/**
	 * Private constructor.
	 */
	private ScompoAdder() {
		super();
	}

	/**
	 * The only way to get an instance because it's singleton
	 * 
	 * @return the {@link Adder}.
	 */
	public static Adder getInstance() {

		return Holder.instance;
	}
}
