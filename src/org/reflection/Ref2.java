/**
  * 2019年4月1日
 *Ref2
 *
 *
 */
package org.reflection;

/**
 * @author mac
 *
 */
class Person{
	
	
	public Person() {
		System.out.println("---------");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person类";
	}
}
public class Ref2 {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class clsClass=Class.forName("org.reflection.Person");
		
		Object object=clsClass.newInstance();
//		System.out.println(object.getClass());
		
//		Object object=Class
		System.out.println(object);
		
	}

}
