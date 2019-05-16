/**
 * 2019年4月1日
 *SingletonDesign
 *
 *
 */
package org.reflection;

/**
 * @author mac
 *
 */
class Singleton{
	private static volatile Singleton instanceSingleton=null;
	
	private Singleton() {
		System.out.println(Thread.currentThread().getName()+"实例化");
	};
	public static  Singleton getInstance() {
		if(instanceSingleton==null) {
			synchronized(Singleton.class) {
				if(instanceSingleton==null) {
					instanceSingleton=new Singleton();
				}
			}
			
		}
		return instanceSingleton;
	}
	
	
	public static void print() {
		System.out.println("hello world"+Thread.currentThread().getName());
	}
}

public class SingletonDesign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		for(int x=0;x<3;x++) {
			new Thread(()->{
				Singleton sigSingleton=Singleton.getInstance();
				sigSingleton.print();
			},"单例设计"+x).start();; 
		}
		
		
		new Thread(()->{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Singleton sigSingleton=Singleton.getInstance();
			sigSingleton.print();
		},"单例设计B").start();; 
		
		new Thread(()->{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Singleton sigSingleton=Singleton.getInstance();
			sigSingleton.print();
		},"单例设计C").start();; 
	}

}
