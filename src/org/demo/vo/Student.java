/**
 * 2019年4月1日
 *Student
 *
 *
 */
package org.demo.vo;

/**
 * @author mac
 *
 */
public class Student implements Comparable<Student> {
	private String name;
	private double score;
	
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	


	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}



	@Override
	public int compareTo(Student o) {
		if(this.score>o.score) {
			return -1;
		}else if(this.score<o.score) {
			return 1;
		}else {
			return 0;
		}
	}
}
