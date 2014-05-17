/**
 * ScompoSubtracter.java
 */
package it.scompo.testapp.lib.impl;

import it.scompo.testapp.lib.api.subtracter.AbstractSubtracter;
import it.scompo.testapp.lib.api.subtracter.Subtracter;

/**
 * My implementation of {@link Subtracter}.
 * 
 * @author mscomparin
 */
public class ScompoSubtracter extends AbstractSubtracter {

	/**
	 * This class it's used for thread safety and lazy init.
	 * 
	 * @author mscomparin
	 */
	private static class Holder {
		private final static Subtracter instance = new ScompoSubtracter();
	}

	/**
	 * private empty constructor.
	 */
	private ScompoSubtracter() {

	}

	public static Subtracter getInstance() {

		return Holder.instance;
	}
}
