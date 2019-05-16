/**
 * 2019年4月1日
 *InputUtil
 *
 *
 */
package org.saveFile;

import java.io.BufferedReader;
import java.io.IOException;

import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * @author mac
 *
 */
public class InputUtil {
//	private static final BufferedReader INPUT=new  BufferedReader(new InputStreamReader(System.in));
	private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in)) ; 
	private InputUtil () {}
	public static String getString(String prompt) {
		String str = null ;
		boolean flag = true ;
		while(flag) {
			System.out.print(prompt);
			try {
				str = INPUT.readLine() ;
				if (!"".equals(str)) {
					flag = false ;
				} else {
					System.out.println("输入的内容不允许为空！");
				}
			} catch (IOException e) {
				System.out.println("输入的内容不允许为空！");
			}
		}
		return str ;
	}
	/**
	 * 实现键盘接收数字的操作
	 * @param prompt 提示信息
	 * @return 一个可以使用的数字
	 */
	public static int getInt(String prompt) { 
		int num = 0 ;
		boolean flag = true ;
		while (flag) {
			System.out.print(prompt); // 打印提示信息
			String str = null ; 
			try {
				str = INPUT.readLine() ;
				if (str.matches("\\d+")) {
					num = Integer.parseInt(str) ;
					flag = false ;
				} else {
					System.out.println("输入的内容不是数字！");
				}
			} catch (IOException e) {
				System.out.println("输入的内容不是数字！");
			}
		}
		return num ;
	}	
}
