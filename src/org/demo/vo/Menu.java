/**
 * 2019年4月1日
 *Menu
 *
 *
 */
package org.demo.vo;

import java.util.Arrays;

import org.www.classScanner.Factory;

/**
 * @author mac
 *
 */
public class Menu {
	public Menu() {
		this.choose();
	}

	/**
	 * 
	 */
	private void choose() {
		this.show(); 
		String choosString=Inputil.getString("请进行选择");
		switch (choosString) {
		case "1":
			String string=Inputil.getString("请输入要追加的内容");
			IStudentService studentService=IFactory.getInstance();
			studentService.append(string);
			choose();
//			break;
		case "2":{
			IStudentService studentService2=IFactory.getInstance();
			System.out.println(Arrays.toString(studentService2.getData()));
			choose();
		}
		
		case "0":{
			System.out.println("bye");
			System.exit(-1);
		}
		default:
			System.out.println("非法  按0退出");;
		}
		
	}

	/**
	 * 
	 */
	private void show() {
		System.out.println("【1】追加字符串");
		System.out.println("【1】显示所有学生的数据");
		System.out.println("【1】程序执行退出");
		
	}
}
