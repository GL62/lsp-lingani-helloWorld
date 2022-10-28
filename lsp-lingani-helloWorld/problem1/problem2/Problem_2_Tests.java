package org.howard.edu.lsp.midterm.problem2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem_2_Tests {
	
	Person p;
	
	@BeforeEach
	void setUp() throws Exception {
		Person p = new Person("Guy","1",19);
	}

	@AfterEach
	void tearDown() throws Exception {
		p = null;
	}

	@Test
	void equals_test() {
		Person p2 = new Person("Guy", "1", 19);
		assertTrue(p.equals(p2));
	}
	
	@Test 
	void to_String_test() {
		p.toString();
	}

}
