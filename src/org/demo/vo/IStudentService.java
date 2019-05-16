/**
 * 2019年4月1日
 *IStudentService
 *
 *
 */
package org.demo.vo;

/**
 * @author mac
 *
 */
public interface IStudentService {
	public abstract Student[] getData();//获取排序数据
	public abstract void append(String str);//追加数据并保存到文件里面
}
