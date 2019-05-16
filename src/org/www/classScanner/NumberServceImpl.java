/**
 * 2019年4月1日
 *NumberServceImpl
 *
 *
 */
package org.www.classScanner;

/**
 * @author mac
 *输入几个整数  然后求出他们的最大值 与最小值
 *
 */
public class NumberServceImpl  implements INumberService{
	@Override
	public int[] stat(int count) {
		int result[]=new int[2];//返回一个结果
		int data[] =new int[count];
		for(int x=0;x<data.length;x++) {
			
			
			data[x]=InputUtil.getInt("请输入第:"+(x+1)+"数字");
			
		}
		
		result[0]=data[0];
		result[1]=data[0];
		for(int x=0;x<data.length;x++) {
			if(data[x]>result[0]) {
				result[0]=data[x];
			}
			if(data[x]<result[1]) {
				result[1]=data[x];
			}
		}
		return result;
	}
}
