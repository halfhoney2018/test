/**
 * 2019年4月1日
 *SaveObject
 *
 *
 */
package org.scanner.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.tools.classfile.Annotation.element_value;

import jdk.javadoc.internal.doclets.formats.html.ModuleFrameWriter;

/**
 * @author mac
 *
 */
@SuppressWarnings(value = { "serial" })
class Person implements Serializable{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
//	18079016979 07906969619
	
	
}
public class SaveObject {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file=new File("/Users/mac/Desktop/Person.person");
//		public final VAL="";
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file) ); 
		
		objectOutputStream.writeObject(new Person("战三", 22));
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
		;
		
		System.out.println(objectInputStream.readObject());

	}

}
