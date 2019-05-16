/**
 * 2019年4月1日
 *FileServiceImpl
 *
 *
 */
package org.saveFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @author mac
 *
 */
public class FileServiceImpl implements IFileService {
	
	private String name;
	private String content;
	
	
	public FileServiceImpl() {
		this.name=InputUtil.getString("请输入保存文件名称：");
		this.content=InputUtil.getString("请输入保存文件内容");
//		this.content=content;
	}
	
	@SuppressWarnings("resource")
	@Override
	public boolean save() {
		File file=new File(IFileService.SAVE_DIR);
		PrintWriter outPrintWriter=null;
		
		
		try {
			outPrintWriter=new PrintWriter(new FileOutputStream(file));
			outPrintWriter.print(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return false;
		}finally {
			outPrintWriter.close();
		}
		
		return true;
	}

	

}
