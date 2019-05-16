/**
 * 2019年4月1日
 *IOCaseDemo
 *
 *
 */
package org.saveFile;

import java.io.File;

import org.www.classScanner.Factory;

/**
 * @author mac
 *
 */
public class IOCaseDemo {

	/**
	 * @param args
	 */
	
	static {
		 File file=new File(IFileService.SAVE_DIR);
		 if(!file.exists()) {
			 file.mkdirs();
		 }
	}
	public static void main(String[] args) {
		IFileService fileService=IFactory.getInstance();
		System.out.println(fileService.save());

	}

}
