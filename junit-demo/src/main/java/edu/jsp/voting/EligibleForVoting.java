package edu.jsp.voting;

public class EligibleForVoting extends RuntimeException{

	
	private String message="You can vote";
	
	@Override
	public String getMessage() {
		
		return message;
	}
	
	
}
