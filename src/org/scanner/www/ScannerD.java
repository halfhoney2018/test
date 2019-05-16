/**
 * 2019年3月31日
 *ScannerD
 *
 *
 */
package org.scanner.www;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author mac
 *
 */
public class ScannerD {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputStream=System.in;
		byte data[]=new byte[1024];
		int len=inputStream.read(data);
		System.out.println("输入的内容为："+new String(data,0,len));	
	}

}
