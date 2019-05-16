/**
 * 2019年3月29日
 *Modfity
 *
 *
 */
package org.file.hello;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

/**批量修改文件的名字   
 * 
 * @author mac
 *
 */


class FileCreate{
	/**
	 * 
	 * 批量创建一些文件
	 * 
	 * */
	private String pathString=File.separator+"Users"+File.separator+"mac"+File.separator+"eclipse-workspace"+File.separator+"IOProject"+File.separator+"src"+File.separator+"file/";
	//文件路径
	private String fileName;//文件名字
	
	public String getPathString() {
		return pathString;
	}
	public void setPathString(String pathString) {
		this.pathString = pathString;
	}
	private StringBuffer buffer=new StringBuffer();
	public  void Create(int len) throws IOException {
		
		for(int x=0;x<len;x++) {
			String uuid=UUID.randomUUID().toString();
			new File(pathString+uuid.split("\\-")[0]+".txt").createNewFile();
			//创建成功
			
		}	
		}	
	}
	

public class Modfity {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		
		//new FileCreate().Create(10);//随机产生10个.txt的文件
		File file=new File(new FileCreate().getPathString());
		long start=System.currentTimeMillis();
		renameDir(file);
		long end=System.currentTimeMillis();
		System.out.println("耗时："+(end-start));
		
	}
	//运用递归  进行名称文件的批量修改
	public static void renameDir(File file) {
		if(file.isDirectory()) {//如果是一个文件夹
			
			if(file.listFiles()!=null) {
				for(File files:file.listFiles()) {
					renameDir(files);;
				}
			}
		   }else if(file.isFile()){
			   
			   String fileNString=file.getName().substring(0,file.getName().lastIndexOf("."))+".md";
			   File newFile=new File(file.getParent(),fileNString);
			   file.renameTo(newFile);
			   System.out.println(fileNString);
		   }
		
		
		
		}
	}


	//
	

