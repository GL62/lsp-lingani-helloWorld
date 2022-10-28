package org.howard.edu.lsp.midterm.problem1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem_1_Tests {
	
	VotingMachine v1 = new VotingMachine();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		v1.candidates.clear();
	}

	@Test
	void getVotes_test() {
		v1.addCandidate("Guy");
		v1.castVotes("Guy", 5);
		try {
			assertEquals(v1.getVotes("Guy"), 5);
		} catch (UnknownCandidateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test 
	void sum_test() {
		v1.addCandidate("Guy");
		v1.addCandidate("Bernard");
		v1.addCandidate("Burge");
		
		v1.castVotes("Guy", 3);
		v1.castVotes("Bernard", 1);
		
		assertEquals(v1.sum(),4);
	}

}
