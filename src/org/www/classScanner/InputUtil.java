/**
 * 2019年4月1日
 *InputUtil
 *
 *
 */
package org.www.classScanner;

import java.util.Scanner;

/**
 * @author mac
 *输入操作类
 */
public class InputUtil {
	private static Scanner scanner;

	public static int getInt(String prompt) {
		int num=0;
		boolean flag=true;
		while (flag) {
			scanner = new Scanner(System.in);
			System.out.println(prompt);//打印提示信息
			if(scanner.hasNext("\\d+")) {
				num=Integer.parseInt(scanner.next("\\d+"));
				flag=false;
			}else {
				System.out.println("输入的不是数字");
			}
		}
		return num;
	}
}
