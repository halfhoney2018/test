/**
 * 2019年4月1日
 *NumberServiceImpl
 *
 *
 */
package org.parity;

import org.demo.vo.Inputil;

/**
 * @author mac
 *
 */
public class NumberServiceImpl implements INumberService {
	
	@Override
	public int[] stat() {
		int stat[]=new int[] {0,0};//第一个为奇数 第二个为偶数
		String string=Inputil.getString("请输入数字信息");
//		System.out.println(string);
		String result[]=string.split(" ");//按照每个字符分割 “ ”
		for(int x=0;x<result.length;x++) {
			if(Integer.parseInt(result[x])%2==0) {
				stat[0] ++;
			}else {
				stat [1]++;
			}
		}
		return stat;
	}

}
