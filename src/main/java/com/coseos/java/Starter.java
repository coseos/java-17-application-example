/**
 * 
 */
package com.coseos.java;

import com.coseos.java.application.Application;
import com.coseos.java.application.implementation.Java17ApplicationExample;

/**
 * @author tlorenz
 *
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Application application = new Java17ApplicationExample();
		application.run(args);
	}

}
