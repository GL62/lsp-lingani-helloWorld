package org.howard.edu.lsp.midterm.problem1;
import java.util.HashMap;

class UnknownCandidateException extends Exception  
{  
    public UnknownCandidateException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
} 

public class VotingMachine {
	// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.
	
	HashMap <String,Integer> candidates = new HashMap <String, Integer>();
	
	
	public void addCandidate(String name) {
		if (this.candidates.get(name) == null) {
			this.candidates.put(name, 0);
		}
	} 

	public void castVotes(String name, int votes) {
		// Cast votes to the candidate with the given name
		this.candidates.put(name, votes+1);
	}

	public int getVotes(String name)  throws UnknownCandidateException {
		// Return the number of votes for a given candidate.  Throws
// UnknownCandidateException if name not present.  Make this a 
// checked exception.

		if (this.candidates.get(name) != null) {
			return this.candidates.get(name);
			}
		else {
			throw new UnknownCandidateException("This candidate is not on the ballot");
		}
	}

	public int sum() {
		// Return the total number of votes for all candidates.	
		var sum = 0;
		for (Integer i: candidates.values()) {
			sum += i;
		}
		return sum;
	}
}



