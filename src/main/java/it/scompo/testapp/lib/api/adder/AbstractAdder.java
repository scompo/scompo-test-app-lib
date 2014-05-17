package it.scompo.testapp.lib.api.adder;



/**
 * Abstract implementation of {@link Adder}.
 * 
 * @author mscomparin
 */
public abstract class AbstractAdder implements Adder{

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.scompo.testapp.lib.Adder#add(java.lang.Integer,
	 * java.lang.Integer)
	 */
	public Integer add(Integer a, Integer b) {
		return a + b;
	}

}
