/**
 * 2019年3月31日
 *BufferReaderD1
 *
 *
 */
package org.scanner.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * @author mac
 *
 */


//缓冲字节流，缓冲流


public class BufferReaderD1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufread=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ss");
		String string=bufread.readLine(); 
		System.out.println(string);
		
		
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNext()){
			System.out.print(scanner.next());
		}
//		System.out.println(scanner);
		
		
	}

}
