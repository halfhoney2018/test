/**
 * 2019年4月1日
 *Menu
 *
 *
 */
package org.vote;

import org.Login.Factory;
import org.demo.vo.Inputil;

/**
 * @author mac
 *
 */
public class Menu {
	private IVoteService voteService;
	public Menu() {
		this.voteService=Ifactory.getInstance();
		this.vote();
	}
	/**
	 * 
	 */
	private void vote() {
		Student stu[]=  voteService.getData();
		for(Student temp:stu) {
			System.out.println(temp.getSid()+":"+temp.getNameString()+"["+temp.getVote()+"]");
			
		}
		String num="10";
		while (Integer.parseInt(num)!=0) {
			num=Inputil.getString("请输入班长获选人代号");
			if(Integer.parseInt(num)!=0) {
				if(!this.voteService.inc(Integer.parseInt(num ))) {
					System.out.println("无效！");
				}
			}
		}
		System.out.print("投票结果");
		stu=this.voteService.result();
		System.out.println(stu[0].getNameString()+"同学，以"+stu[0].getVote()+"票数当选班长");
		
	}
}
