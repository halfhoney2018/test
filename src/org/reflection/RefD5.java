/**
 * 2019年4月2日
 *RefD5
 *
 *
 */
package org.reflection;

import java.awt.Stroke;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mac
 *
 */
//定义String Utils实现首字母大写功能
class StringUtil{
	private  StringUtil() {};
	public static  String  initcap(String str) {
		
		if(str==null || "".equals(str)) {
			
			
			return str;
		}
		
		if(str.length()==1) {
			return str.toUpperCase();
		}else {
			
			return str.substring(0,1).toUpperCase()+str.substring(1);
		}
	}
}

//进行数字的转换

class Transform{
	private Transform() {};
	
	public  static void TransfromDou() {
		
		
	}
}
//进行属性的设置
class BeanUtil{
	
	private BeanUtil() {};
	
	public static void setValue(Object object,String vale) throws Exception {
		String results[]=vale.split("\\|");//进行拆分
		for(int x=0;x<results.length;x++) {
			String  attval[]=results[x].split("\\:");
			
			
			
			//获取属性名称与内容
			try {
				if(attval[0].contains(".")) {
					String temp[]=attval[0].split("\\.");
					
					Object currentObject=object;
					
					for(int y=0;y<temp.length-1;y++) {
						Method getMethod=currentObject.getClass().getMethod("get"+StringUtil.initcap(temp[y]));
						Object tempObject=getMethod.invoke(currentObject);
						
						if(tempObject==null) {//该对象没有实例化
							Field field=currentObject.getClass().getDeclaredField(temp[y]);//获取属性
							
							Method method=currentObject.getClass().getDeclaredMethod("set"+StringUtil.initcap(temp[y]),field.getType());
							
							Object newObject=field.getType().getDeclaredConstructor().newInstance();//实例化对象
							method.invoke(currentObject, newObject);
							currentObject=newObject;
							
						}else {
							currentObject=tempObject;
						}

					}
					Field field=currentObject.getClass().getDeclaredField(temp[temp.length-1]);//获取成员
					String methString="set"+ StringUtil.initcap(temp[temp.length-1]);
					Method setMethod=currentObject.getClass().getMethod(methString, field.getType());
					setMethod.invoke(currentObject, getAttributeValue(field.getType().getName(), attval[1]));
					
				}else {
					Field field=object.getClass().getDeclaredField(attval[0]);//获取成员
					String methString="set"+ StringUtil.initcap(attval[0]);
					Method setMethod=object.getClass().getMethod(methString, field.getType());
					setMethod.invoke(object, getAttributeValue(field.getType().getName(), attval[1]));
				}
				
				
				
				
			} catch (Exception e) {
				
			}
		}
	}
	//类型的转换
	private static  Object getAttributeValue(String type,String value) {
		if("Double".equals(type) || "java.lang.Double".equals(type)) {
			return Double.parseDouble(value);
		}
		if("String".equals(type)||"java.lang.String".equals(type)) {
			return value;
		}
		if("Integer".equals(type)||"java.lang.Integer".equals(type)) {
			return value;
		}
		System.out.println(type+value);
		
		return null;
	}
}

//实例化的工程模式
class ClassInstancceFactory{
	
	
	private ClassInstancceFactory() {};
	
	public static <T> T create(Class<?> claz,String value) {
		try {
			Object object=claz.getDeclaredConstructor().newInstance();
			BeanUtil.setValue(object, value);
			return (T) object;
			
		} catch (Exception e) {
			return null;
		}
//		return null;
		
		
	}
}

//简单Java类，水果
class Fruit{
	private String name;
	private String loc;
	private Double price;
	private Store store;
	
	
	public Store getStore() {
		return store;
	}



	public void setStore(Store store) {
		this.store = store;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLoc() {
		return loc;
	}



	public void setLoc(String loc) {
		this.loc = loc;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Fruit [name=" + name + ", loc=" + loc + ", price=" + price + ", store=" + store + "]";
	}



	
	
}


class  Store{
	private String name;//商店名称
	private String loc;//商店地址
	private Fruit fruit;//水果类
	public Store() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public String toString() {
		return "Store [name=" + name + ", loc=" + loc + ", fruit=" + fruit + "]";
	}
	public   void  printStore() {
		
		System.out.println("商店名称："+this.name+"商店物品： "+fruit.getName());
	}
	
	
	
	
}
public class RefD5 {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class< ?> cls=Fruit.class;
//		
//		Object object=cls.getDeclaredConstructor().newInstance();
//		System.out.println(object);
		String value="name:苹果|loc:beijing|price:23.00|store.name:水果超市";
		Fruit fruieObject=ClassInstancceFactory.create(cls, value);
		System.out.println(fruieObject.getStore().getName());
		System.out.println(fruieObject);
		
	}

}
