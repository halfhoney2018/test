/**
 * 2019年4月1日
 *Factory
 *
 *
 */
package org.Login;

/**
 * @author mac
 *
 */
public class Factory {
	private Factory() {};
	
	
	public static IUserService getInstaance() {
		return new UserServiceProxy(new UserServiceImpl());
	}
}
