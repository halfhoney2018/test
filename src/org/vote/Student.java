/**
 * 2019年4月1日
 *Studemt
 *
 *
 */
package org.vote;

/**
 * @author mac
 *
 */
public class Student implements Comparable<Student> {
	private long sid;
	private String nameString;
	private int vote;//票
	
	
	public Student(long sid, String nameString, int vote) {
		super();
		this.sid = sid;
		this.nameString = nameString;
		this.vote = vote;
	}
	


	public long getSid() {
		return sid;
	}



	public void setSid(long sid) {
		this.sid = sid;
	}



	public String getNameString() {
		return nameString;
	}



	public void setNameString(String nameString) {
		this.nameString = nameString;
	}



	public int getVote() {
		return vote;
	}



	public void setVote(int vote) {
		this.vote = vote;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", nameString=" + nameString + ", vote=" + vote + "]";
	}



	public int compareTo(Student stu) {
		return stu.vote-this.vote;
//		return 1
	};
	
}
