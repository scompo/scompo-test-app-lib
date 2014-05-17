/**
 * Subtracter.java
 */
package it.scompo.testapp.lib.api.subtracter;


/**
 * Methods a {@link Subtracter} should implement.
 * 
 * @author mscomparin
 * 
 */
public interface Subtracter{

	/**
	 * return the difference of 2 {@link Integer} s.
	 * 
	 * @param minuend
	 *            the minuend.
	 * 
	 * @param subtrahend
	 *            the subtrahend.
	 * 
	 * @return the difference.
	 */
	Integer subtract(Integer minuend, Integer subtrahend);

}
