/**
 * 2019年4月1日
 *FileUtil
 *
 *
 */
package org.demo.vo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author mac
 *
 */
public class FileUtil {
	//文件的加载
	public static String load(File file) {
		Scanner scanner=null;
		try {
			scanner=new Scanner(file);
			if(scanner.hasNext()) {
				String string=scanner.next();
				return string;
			}
			return null;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}finally {
			if(scanner!=null) {
				scanner.close();
			}
		}
		
	}
	
	
	//文件内容的追加
	public static boolean append(File file,String conString) {
		PrintStream out=null;
		
		try {
			out=new PrintStream(new FileOutputStream(file,true));
			out.print(conString);
			return true;
		} catch (Exception e) {
			return false;
		}finally {
			if(out!=null) {
				
				out.close();
			}
		}
	}
}
