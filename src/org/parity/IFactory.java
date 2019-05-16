/**
 * 2019年4月1日
 *IFactory
 *
 *
 */
package org.parity;

/**
 * @author mac
 *
 */
public class IFactory {
	private IFactory() {};
	public static INumberService getInstaINumberService() {
		return new NumberServiceImpl();
	}
}
