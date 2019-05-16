/**
 * 2019年3月29日
 *FileList
 *
 *
 */
package org.file.hello;

import java.io.File;

/**
 * @author mac
 *
 */
public class FileList {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		 File file=new File(File.separator);
		 listDir(file);

	}
	public static void listDir(File file)throws Exception {
		
		if(file.isDirectory()) {
			
			if(file.listFiles()!=null) {
				for(File file2:file.listFiles()) {
					
					System.out.println(file2);
					listDir(file2);
				}
			}
			
		}
		
		
	}
}
