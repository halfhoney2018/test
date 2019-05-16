///**
// * 2019年3月31日
// *FileUtil
// *
// *
// */
//package org.project.www;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
///**
// * @author mac
// *
// */
//public class FileUtil2 {
//	private File srcFile;//源文件路径
//	private File desFile;//目标文件路径
//	public FileUtil2(File srcFile, File desFile) {
//		this.srcFile = srcFile;
//		this.desFile = desFile;
//	}
//	public FileUtil2(String src,String des) {
//		//构造方法实例化
//		this(new File(src), new File(des));
//		
//	}
//	//进行文件copy操作
//	public boolean copy() throws Exception {
//		if(!this.srcFile.exists()) {//源文件必须存在
//			System.out.println("源文件不存在 拷贝失败!");
//			return false;
//		}
//		//首先要创建父级目录
//		if(!this.desFile.getParentFile().exists()) {
//			this.desFile.getParentFile().mkdirs();
//		}
//		
//		//开辟一个缓冲区  进行 写入操作
//		byte data[]=new byte[1024];
//		InputStream input=null;//读取
//		OutputStream output=null;//写入
//		
//		
//		try {
//			input=new FileInputStream(this.srcFile);
//			output=new FileOutputStream(this.desFile);
//			
//			int  len =0;
////			len=input.read(data);//读取
//			while ((len=input.read(data))!=-1) {
//				//循环读取
//				output.write(data,0,len);//写入部分长度
//			}
//			input.close();
//			output.close();
//			return true;
//			
//		} catch (Exception e) {
//			throw e;
//		}finally {
//			if(input!=null) {
//				input.close();
//			}
//			if(output!=null) {
//				output.close();
//			}
//		}
////		return fals
//		
//	
//	}
//}
