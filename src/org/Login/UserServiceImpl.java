/**
 * 2019年4月1日
 *UserServiceImpl
 *
 *
 */
package org.Login;

/**
 * @author mac
 *
 */
public class UserServiceImpl implements IUserService {
	private int count=0;//作为登录统计
	
	@Override
	public boolean isExit() {
		
		return this.count>=3;//执行登录退出的条件
	}

	@Override
	public boolean login(String name, String passwd) {
		this.count++;
		
		return "admin".equals(name)&&"admin".equals(passwd);
	}

}
