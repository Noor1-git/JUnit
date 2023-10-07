package edu.jsp.voting;

public class Voting {

	
	public void vote(int age) {
		if (age<18) {
			throw new NotEligibleForVoting();
		} else {
			throw new EligibleForVoting();
		}
	}
}
