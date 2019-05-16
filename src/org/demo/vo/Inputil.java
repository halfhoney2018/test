/**
 * 2019年4月1日
 *Inputil
 *
 *
 */
package org.demo.vo;

import java.util.Scanner;

/**
 * @author mac
 *
 */
public class Inputil {

	/**
	 * @param string
	 * @return
	 */
	public static String getString(String string) {
		 String str = null;
		 boolean flag=true;
		 
		 while (flag) {
			Scanner scanner=new Scanner(System.in);
			if(scanner.hasNext()) {
				str=scanner.nextLine();
//				System.out.println(str);
				flag=false;
			}else {
				return "erro";
			}
		}
		return str;
	}	
	
}
