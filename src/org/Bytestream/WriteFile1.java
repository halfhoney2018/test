/**
 * 2019年3月29日
 *WriteFile1
 *
 *
 */
package org.Bytestream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


/**
 * @author mac
 *
 */
public class WriteFile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String pathString=File.separator+"Users"+File.separator+"mac"+File.separator+"eclipse-workspace"+File.separator+"IOProject"+File.separator+"src"+File.separator+"file/outputstream/Message.txt";
		File file=new File(pathString);
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
//		Writer writer=new FileWriter(file);
//		writeFile(writer);
		Reader reader=new FileReader(file);
		readFile(reader, file);
		
		
		System.out.println("--------------------");
		
	}
	
	
	public static void writeFile(Writer writer) throws IOException {
		String str="info=Hello world\r\n";
		try {
			writer.write(str);
			writer.append("追加的内容");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
		
		
	}
	
	public static void readFile(Reader reader,File file) throws IOException {
//		String str="info=Hello world\r\n";
		try {
			if(file.exists()) {
				char data[]=new char[1024];
				int len=reader.read(data);
				
				System.out.println("读取内容："+new String(data,0,len));
				reader.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			reader.close();
		}
		
		
	}
}
