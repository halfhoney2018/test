/**
 * 2019年4月1日
 *VoteServiceImpl
 *
 *
 */
package org.vote;

import java.util.Arrays;

/**
 * @author mac
 *
 */
public class VoteServiceImpl implements IVoteService {
	private Student[] students=new Student[] {
			new Student(1, "张三", 0),
			new Student(2, "李四", 0),
			new Student(3, "王五", 0),
			new Student(4, "赵六", 0),
			
			
	};
	@Override
	public boolean inc(long sid) {
		for (int i = 0; i < students.length; i++) {
			if(this.students[i].getSid()==sid) {
				this.students[i].setVote(this.students[i].getVote()+1);//票数增加
				return true;
			}
		}
		return false;
	}

	@Override
	public Student[] result() {
		Arrays.sort(this.students);
		return this.students;
//		return null;
	}

	@Override
	public Student[] getData() {
		
		return this.students;
	}

}
