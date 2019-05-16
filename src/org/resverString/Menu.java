/**
 * 2019年4月1日
 *Menu
 *
 *
 */
package org.resverString;

import java.util.Arrays;

import org.saveFile.InputUtil;

/**
 * @author mac
 *
 */
public class Menu {
	private IStringService stringService;
	public Menu() {
		this.stringService=IFactory.getInstance();
		this.choose();
		
	}

	/**
	 * 
	 */
	private void choose() {
		this.show();
		String chooseString=InputUtil.getString("请进行选择");
		switch (chooseString) {
		case "1":
			String string=InputUtil.getString("请输入字符串的数据：");
			this.stringService.append(string);
			choose();
//			break;
		case "2":
			String result[]=this.stringService.reverse();//
			System.out.println(Arrays.toString(result));
			choose();
		case  "0":{
			System.out.println("bye!");
			System.exit(-1);
		}
		default:
			System.out.println("你输入的是非法字符 请输入0 退出 1 进行字符串输出  2进行 倒序");;
		}
	}

	/**
	 * 
	 */
	private void show() {
		System.out.println("[1]追加字符串数据");
		System.out.println("[2]倒序字符串数据");
		System.out.println("[0]退出");
//		System.out.println("[1]追加字符串数据");
		
	}
	
	
	
}
