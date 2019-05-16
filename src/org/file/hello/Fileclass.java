/**
 * 2019年3月29日
 *Fileclass
 *
 *
 */
package org.file.hello;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;




/**
 * @author mac
 *
 */

class MathUtil{
	private MathUtil() {};
	
	public static double round(double num,int scale) {
		return Math.round(Math.pow(10, scale)*num)/Math.pow(10, scale);
	}
}
public class Fileclass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file=new File("/Users/mac/eclipse-workspace/IOProject/src/file/new2.txt");
		File file=new File("/Users/mac/eclipse-workspace/IOProject/src/file/new1.txt");
		File fileD=new File("/Users/mac/eclipse-workspace/IOProject/src/file");
		
		//		System.out.println(file.getParentFile().exists());//获取父级目录的
//		file.getParentFile().mkdirs();//多级创建目录
		
		
		
		System.out.println(file.canRead()+""+file.canWrite());
		System.out.println(MathUtil.round(file.length()/(double)1024/1024, 2));
		
		
		Date date=new Date(file.lastModified());
//		Date date2=;
		System.out.println(date);
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new SimpleDateFormat("yyy-MM-dd-HH:mm:ss:SSS").format(date));
		
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		if(fileD.isDirectory()) {
			for(File str:fileD.listFiles()) {
				System.out.println(str);
			}
		}
//		if(file.exists()) {
//			//如果存在 删除
//			file.delete();
//			System.out.println("delete succuess!");
//		}else {
//			System.out.println(file.createNewFile());
//		}
//		System.out.println(UUID.randomUUID());;
//		System.out.println(file.getParent());
		
	}

}
