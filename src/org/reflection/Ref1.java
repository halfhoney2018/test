/**
 * 2019年4月1日
 *Ref1
 *
 *
 */
package org.reflection;

import java.util.Date;

/**
 * @author mac
 *
 */
public class Ref1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Date date=new Date();
		System.out.println(date.getClass());
		
		Class clsClass=Date.class;
		System.out.println(clsClass.getName());
		
		System.out.println(Class.forName("java.util.Date"));
		Runtime.getRuntime().freeMemory();
	}
}
