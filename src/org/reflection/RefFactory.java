/**
 * 2019年4月1日
 *RefFactory
 *
 *
 */
package org.reflection;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @author mac
 *
 */ 
interface IMessage{
//	String CL = null;

	public void send();
}
interface IService {
	public  void print();
}


class IMessageImpl implements IMessage{
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("网络消息--> 发送成功");
	}
}
class ICloundImpl implements IMessage{
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("云消息--> 发送成功");
	}
}



class ILinux implements IService{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("linx 服务打印");
	}
}
class Factory{
	
	private static Object clsClass;
	private Factory() {};
	@SuppressWarnings("unchecked")
	public static <T> T getIMessage(Class<T> cls ,String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		clsClass = Class.forName(className).getDeclaredConstructor().newInstance();
		return (T) clsClass;
		
	}
	
}
abstract class Abstart{
	public abstract void fun();
}

class Admin extends Abstart implements IService,IMessage {
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}
}
public class RefFactory {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		IMessage iMessage=Factory.getIMessage(IMessage.class,"org.reflection.IMessageImpl");
		iMessage.send();
		IService service=Factory.getIMessage(IService.class, "org.reflection.ILinux");
		
		service.print();
		//
		
		Class<?> clsClass=Admin.class;
		
		Package package1=clsClass.getPackage();
		System.out.println(package1.getName());
		
		//
		Class< ?> superClass=clsClass.getSuperclass();
		System.out.println(superClass);
		System.out.println(superClass.getSuperclass());
		
		Class<?> interfaceClass[]=clsClass.getInterfaces();
		
		System.out.println("类的接口");
		for(Class<?> temp:interfaceClass) {
			System.out.println(temp);
		}
	}

}
