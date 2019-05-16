/**
 * 2019年4月1日
 *ICaseDemo
 *
 *
 */
package org.www.classScanner;

/**
 * @author mac
 *
 */
public class ICaseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		INumberService numberService=Factory.getInstance();
		
		int restult[]=numberService.stat(4);
		System.out.println("最大值:"+restult[0]+"最小值："+restult[1]);
	}

}
