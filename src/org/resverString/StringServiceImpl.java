/**
 * 2019年4月1日
 *StringServiceImpl
 *
 *
 */
package org.resverString;

/**
 * @author mac
 *
 */
public class StringServiceImpl implements IStringService {
	private StringBuffer data=new StringBuffer();
	@Override
	public void append(String string) {
		this.data.append(string).append("|");//| 分隔符
		
	}
	@Override
	public String[] reverse() {
		String result[]=this.data.toString().split("|");//获取数据
		int center=result.length/2;
		int head=0;
		int tail=result.length-1;
		for(int x=0;x<center;x++) {
			String tempString=result[head];
			result[head]=result[tail];
			result[tail]=tempString;
		}
		return result;
	}


}
