/**
 * 2019年3月31日
 *FileCopyDemo
 *
 *
 */
package org.project.www;

import java.io.File;

/**
 * @author mac
 *
 */
public class FileCopyDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		if(args.length!=2) {
			System.out.println("命令错误");
			System.exit(1);//退出
		}
		
		long start=System.currentTimeMillis();
		FileUtil fUtil=new FileUtil(args[0], args[1]);
//		Demo fUtil=new Demo(args[0], args[1]);
		if(new File(args[0]).isFile()) {
			System.out.println(fUtil.copy()?"文件拷贝成功":"文件拷贝失败");
		}else {
			//目录拷贝
			System.out.println(fUtil.copyDir()?"文件拷贝成功":"目录文件拷贝失败");
		}
		
		
		
		long end=System.currentTimeMillis();
		System.out.println("拷贝完成时间:"+(end-start));
	
	
	}

}
