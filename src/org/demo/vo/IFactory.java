/**
 * 2019年4月1日
 *IFactory
 *
 *
 */
package org.demo.vo;

/**
 * @author mac
 *
 */
public class IFactory {
	private  IFactory() {};
	
	
	
	public static IStudentService getInstance() {
		
		
		return new StudentServiceImpl();
	}
}
