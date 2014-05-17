package it.scompo.testapp.lib.api.subtracter;


/**
 * Subtracter implementation.
 * 
 * @author mscomparin
 */
public abstract class AbstractSubtracter implements Subtracter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.scompo.testapp.lib.Subtracter#subtract(java.lang.Integer,
	 * java.lang.Integer)
	 */
	public Integer subtract(Integer minuend, Integer subtrahend) {

		return minuend - subtrahend;
	}

}
