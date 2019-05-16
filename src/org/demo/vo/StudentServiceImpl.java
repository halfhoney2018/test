/**
 * 2019年4月1日
 *StudentServiceImpl
 *
 *
 */
package org.demo.vo;

import java.io.File;
import java.util.Arrays;

//import jdk.internal.org.objectweb.asm.Handle;

/**
 * @author mac
 *
 */
public class StudentServiceImpl implements IStudentService {
	private String content;//内容
	private Student [] students;//学生数组
	private static final File SAVE_FILE=new File("/Users/mac/Desktop/student.txt");
	public StudentServiceImpl() {
		super();
		this.content = FileUtil.load(SAVE_FILE);//读取已经获取的内容
		this.handle();
	}
	private void handle() {
		if(content!=null) {
			String[] resultString=this.content.split("\\|");//把接受的数字 拆分
			this.students=new Student[resultString.length];//开辟对象数组
			for(int x=0;x<resultString.length;x++) {
				String temp[]=resultString[x].split(":");
				this.students[x]=new Student(temp[0], Double.parseDouble(temp[1]));
			}
		}
		
		
	}
	@Override
	public Student[] getData() {
		Arrays.sort(this.students);
		return this.students;
	}
	
	@Override
	public void append(String str) {
		if(str.startsWith("|")) {//最前面有|
			str=str.substring(1);//截取后面部分
		}
		if(!str.endsWith("|")) {
			str=str+"|";//与后面的数据进行分割
		}
		FileUtil.append(SAVE_FILE, str);
		
	}

}
