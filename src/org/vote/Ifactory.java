/**
 * 2019年4月1日
 *Ifactory
 *
 *
 */
package org.vote;

/**
 * @author mac
 *
 */
public class Ifactory {
	private Ifactory () {};
	
	public static IVoteService getInstance() {
		
		return new VoteServiceImpl();
	}
}
