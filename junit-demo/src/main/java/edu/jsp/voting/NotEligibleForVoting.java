package edu.jsp.voting;

public class NotEligibleForVoting extends RuntimeException{

	
	String message="You Are Under Age";
	
	@Override
	public String getMessage() {

		return message;
	}
}
