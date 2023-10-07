package edu.jsp.voting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VotingTest {

	Voting voting=new Voting();
	
	@BeforeAll
	public static void initialization() {
		System.out.println("will execute only once at startup");
	}
	
	@AfterAll
	public static void destroy() {
		System.out.println("will execute only once at end");
	}
	
	
	@BeforeEach
	public void startup() {
		System.out.println("Start-up task performed");
	}
	
	@AfterEach
	public void cleanup() {
		System.out.println("cleanup task performed");
	}
	
	@Test
	void test() {
		Assertions.assertThrows(NotEligibleForVoting.class, ()->voting.vote(10));
	}
	
	@Test
	void test1() {
		Assertions.assertThrows(EligibleForVoting.class, ()->voting.vote(19));
	}
	
	@Test
	void test2() {
		Assertions.assertThrows(EligibleForVoting.class, ()->voting.vote(17));
	}
	
	@Test
	void test3() {
		Assertions.assertThrows(NotEligibleForVoting.class, ()->voting.vote(20));
	}

}
