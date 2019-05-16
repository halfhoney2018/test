/**
 * 2019年3月29日
 *StreamDemo
 *
 *
 */
package org.Bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author mac
 *
 */
public class StreamDemo {


	
		// TODO Auto-generated method stub
		/**
		 * @param args
		 */
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			String pathString=File.separator+"Users"+File.separator+"mac"+File.separator+"eclipse-workspace"+File.separator+"IOProject"+File.separator+"src"+File.separator+"file/outputstream/usename&passwd.txt";
			File file=new File(pathString);
//			OutputStream outputStream=new FileOutputStream(file);
//			writeFile(outputStream,file);
			InputStream inputStream=new FileInputStream(file);
			readFile(inputStream, file);
			
		}
		//写入数据
		public static void writeFile(OutputStream outputStream,File file) {
			try {
//				;
				
				outputStream.write("usename:admin\r\n".getBytes());
				outputStream.write("password:admin".getBytes());
				outputStream.close();
			} catch (Exception e) {
				System.out.println("文件不存在 ，正在创建");
//				file.createNewFile();
				file.getParentFile().mkdirs();//创建目录
			}
		}
		public static void readFile(InputStream inputStream,File file) {
			try {
				byte[] data=new byte[1024];//开辟一个数组
				int len=inputStream.read(data);
				System.out.println("["+new String(data,0,len)+"]");
				inputStream.close();
//				outputStream.close();
			} catch (Exception e) {
				System.out.println("文件不存在 ，正在创建");
//				file.createNewFile();
				file.getParentFile().mkdirs();//创建目录
			}
		}
	}



