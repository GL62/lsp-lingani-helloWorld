package org.howard.edu.lsp.assignment4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	IntegerSet set;

	@BeforeEach
	void setUp() throws Exception {
		set = new IntegerSet();
	}

	@AfterEach
	void tearDown() throws Exception {
		set = null;
	}

	@Test
	void addTest() {
		ArrayList <Integer> compList = new ArrayList <Integer>();
		compList.add(1);
		compList.add(2);
		compList.add(3);
		
		set.add(1);
		set.add(2);
		set.add(3);
			
		assertTrue(compList.equals(set.set));
	}
	
	@Test
	void clearTest() {
		set.add(0);
		set.clear();
		assertEquals(set.set.size(),0);
	}
	
	@Test
	void containsTest() {
		set.add(0);
		assertTrue(set.contains(0));
	}
	
	@Test
	void diffTest() {
		set.add(1);
		set.add(2);
		set.add(3);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		ArrayList <Integer> compList = new ArrayList<Integer>(Arrays.asList(1,2));
		set.diff(set2);
		assertEquals(set.set,compList);
	}
	
	@Test
	void equalsTest() {
		IntegerSet compList = new IntegerSet();
		compList.add(0);
		set.add(0);
		assertTrue(set.equals(compList));
		}
	
	@Test
	void intersectTest() {
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		set.add(2);
		set.add(3);
		set.add(4);
		
		// Should change set to [3,4] as those are the 2 characters that both sets have
		set.intersect(set2);
		
		assertEquals(set.set, new ArrayList<Integer>(Arrays.asList(2,3)));
		
	}
	
	@Test
	void isEmptyTest() {
		assertTrue(set.isEmpty());
	}
	
	@Test
	void largestTest() {
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		
		assertTrue(set.largest() == 3);
	}
	
	@Test
	void lengthTest() {
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		
		assertTrue(set.length() == 4);
	}
	
	@Test
	void removeTest() {
		set.add(1);
		set.add(2);
		set.remove(1);
		assertFalse(set.contains(1));
	}
	
	@Test
	void smallestTest() {
		set.add(0);
		set.add(1);
		set.add(2);
		
		assertTrue(set.smallest() == 0);
	}
	
	@Test
	void toStringTest() {
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		
		assertEquals(set.toString(), "[0, 1, 2, 3]");
	}
	
	@Test
	void unionTest() {
		set.add(1);
		set.add(2);
		set.add(3);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		set.union(set2);
		System.out.println(set.set);
		assertEquals(set.set, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
	}
	
	
}
