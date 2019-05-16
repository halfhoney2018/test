/**
 * 2019年4月1日
 *IFactory
 *
 *
 */
package org.resverString;

/**
 * @author mac
 *
 */
public class IFactory {
	private IFactory() {};
	public  static IStringService getInstance() {
		return new StringServiceImpl();
	}
}
