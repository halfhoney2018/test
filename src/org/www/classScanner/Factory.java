/**
 * 2019年4月1日
 *Factory
 *
 *
 */
package org.www.classScanner;

/**
 * @author mac
 *
 */
public class Factory {
	public static INumberService getInstance() {
		
		return new NumberServceImpl();
	}
}
