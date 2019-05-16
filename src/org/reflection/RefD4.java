/**
 * 2019年4月1日
 *RefD4
 *
 *
 */
package org.reflection;

import java.io.File;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mac
 *
 */

class Student{
	
	
	private String nameString;
	private int age;
	public Student(String nameString, int age) {
		
		this.nameString = nameString;
		this.age = age;
	}
	
	
	public Student() {
		
	}
	
	
	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [nameString=" + nameString + ", age=" + age + "]";
	}
	
	
	
}
public class RefD4 {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<? > clsClass=Student.class;
		/**
		 * 属性
		 * 
		 * */
		
//		Field field[]=clsClass.getDeclaredFields();//获取子类全部信息
//		for(Field field2:field) {
//			System.out.println(field2);
//		}
//		Field fields[]=clsClass.getFields();//取得父类的公共成员信息
//		for(Field fie:fields) {
//			System.out.println(fie);
//		}
		Object object=clsClass.getConstructor().newInstance();
		Field filField=clsClass.getDeclaredField("nameString");
		
		filField.setAccessible(true);//关闭封装
		filField.set(object, "张三");
//		filField.setAccessible(true);
		System.out.println(filField.get(object));;
		//获取类属性的 类型
		System.out.println(filField.getType().getSimpleName());
		;
		
		
		
		/**
		 * 
		 * 普通方法
		 * 
		 * */
//		Object object=clsClass.getDeclaredConstructor().newInstance();
//		System.out.println(object);
//		Method setAgeMethod =clsClass.getMethod("setAge", int.class);
//		setAgeMethod.invoke(object, 11);
//		Method getAgemethod=clsClass.getMethod("getAge");
//		System.out.println(getAgemethod.invoke(object));
		
		
//		/**
//		 * 构造方法的操作
//		 * 
//		 * */
//		
//		clsClass.getConstructor().newInstance();
//		System.out.println(clsClass.getConstructor().newInstance());
//		{
//			//获取所有方法，包括继承
//			System.out.println("//获取所有方法，包括继承");
//			Method method[]=clsClass.getMethods();
//			for(Method method2:method) {
////				System.out.println(method2);
////				System.out.println(method2.getTypeParameters());
//				System.out.println(method2.getName());
//				
//				System.out.println(Modifier.toString(method2.getModifiers()));
//			}
//			
//			System.out.println("---------------------------------");
//			System.out.println("//获取本类的方法");
//			
//			Method method2[]=clsClass.getDeclaredMethods();
//			for(Method method3:method2) {
//				System.out.println(method3);
//			}
//			
//			System.out.println("---------------------------------");
//			
//		}
//		System.out.println(clsClass.getDeclaredConstructor());;
		
//		Constructor<?>[] constructor =clsClass.getConstructors();
//		Constructor<?>   constructor2=clsClass.getConstructor(String.class,int.class);
//		Object object=constructor2.newInstance("小强",22);
//		System.out.println(object);
//		for(Constructor<?> data:constructor) {
//			System.out.println(data);
//		}
		
		
		/**
		 * 
		 * 普通方法
		 * 
		 * */
		
		
	}

}
