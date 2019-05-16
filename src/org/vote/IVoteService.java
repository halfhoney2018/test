/**
 * 2019年4月1日
 *IVoteService
 *
 *
 */
package org.vote;

/**
 * @author mac
 *
 */
public interface IVoteService {
	public boolean inc (long sid);//根据编号进行增长
	public Student[] result();//获取投票的结果
	public Student[] getData();//获取全部数据
	
}
