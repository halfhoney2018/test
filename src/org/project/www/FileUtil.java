/**
 * 2019年3月31日
 *FileUtil
 *
 *
 */
package org.project.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class FileUtil {	// 定义一个文件操作的工具类
	private File srcFile ; // 源文件路径
	private File desFile ; // 目标文件路径
	public FileUtil(String src,String des) {
		this(new File(src),new File(des)) ;
	}
	public FileUtil(File srcFile,File desFile) {
		this.srcFile = srcFile ;
		this.desFile = desFile ;
	}
	
	public boolean copyDir() throws Exception {
		try {
			this.copyImpl(this.srcFile) ;
			return true ;
		} catch (Exception e) {
			e.printStackTrace();
			return false ; 
		}
	}
	
	//copyImpl
	private void copyImpl(File file) throws Exception {
		if(file.isDirectory()) {
			//是目录
			File[] results=file.listFiles();//列出全部目录
			if (results != null) {
				for (int x = 0 ; x < results.length ; x ++) {
					copyImpl(results[x]) ;
					System.out.println(results[x]);
				}
			}
		}else {
			//是文件
			String newFilePath=file.getPath().replace(this.srcFile.getPath()+file.separator, "");
//			System.out.println(newFilePath);
			File newFile =new  File(this.desFile,newFilePath);//文件路径
			this.copyFileImpl(file,newFile);
		}
		
		
		
		
	}
	
	//拷贝文件
	private boolean copyFileImpl(File srcFile,File desFile)throws Exception {
		
		if (!desFile.getParentFile().exists()) { 
			desFile.getParentFile().mkdirs() ; // 创建父目录
		}
//		byte data [] = new byte[1024] ; // 开辟一个拷贝的缓冲区
		InputStream input = null ;
		OutputStream output = null ;
		try {
			input = new FileInputStream(srcFile) ;
			output = new FileOutputStream(desFile) ;
			input.transferTo(output);
			return true ; 
		} catch (Exception e) {
			throw e ;
		} finally {
			if (input != null) {
				input.close();	
			} 
			if (output != null) {
				output.close() ;
			}
		}
	}
	
	
	
	
	public boolean copy() throws Exception {	// 文件拷贝处理
		if (!this.srcFile.exists()) {	// 源文件必须存在!
			System.out.println("拷贝的源文件不存在！");
			return false ; // 拷贝失败
		}
		
		return this.copyFileImpl(this.srcFile, this.desFile);
	}
}