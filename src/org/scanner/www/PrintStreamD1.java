/**
 * 2019年3月31日
 *PrintStreamD1
 *
 *
 */
package org.scanner.www;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author mac
 *
 */
public class PrintStreamD1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.err.println("22");
		
//		File file =new File(File.separator+"User"+File.separator+"mac"+File.separator+"Destop"+File.separator+"PrintString.txt");
		File file =new File("/Users/mac/Desktop/1.txt");
//		PrintWriter printWriter=new PrintWriter(new FileOutputStream(file));
//		printWriter.print("hello");
//		printWriter.print("hello");
//		printWriter.print("hello");
//		printWriter.close();
		PrintStream printStream=PrintStream(new FileOutputStream(file));
		printStream.write("\r\nhllow".getBytes());
		printStream.close();
//		printStream.println(":world");
//		printStream.close();
	}

	/**
	 * @param fileOutputStream
	 * @return
	 */
	private static PrintStream PrintStream(FileOutputStream fileOutputStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
