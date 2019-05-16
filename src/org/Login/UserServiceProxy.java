/**
 * 2019年4月1日
 *UserServiceProxy
 *
 *
 */
package org.Login;

import org.demo.vo.Inputil;

/**
 * @author mac
 *
 */
public class UserServiceProxy implements IUserService {
	private IUserService userservice;
	
	public UserServiceProxy(IUserService userservice) {
		super();
		this.userservice = userservice;
	}

	@Override
	public boolean isExit() {
		
		return this.userservice.isExit();
	}

	@Override
	public boolean login(String name, String passwd) {
		while (!this.isExit()) {
			String inputDatString=Inputil.getString("请输入登录信息:");
			if(inputDatString.contains("/")) {
				String temp[]=inputDatString.split("/");
				if(this.userservice.login(temp[0], temp[1])) {
					return true;
				}else {
					System.out.println("login fail");
				}
			}else {
				String pwd=Inputil.getString("请输入密码");
				if(this.userservice.login(inputDatString, pwd)) {return true;}else{
					System.out.println("登录失败");
				};
				
			}
		}
		return false;
	}

}
