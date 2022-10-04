package org.howard.edu.lsp.assignment4;

/**
 * Guy L. Lingani
 * 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
 */

public class IntegerSetDriver  {
	/**
	 * Main function for the driver class
	 * @param args general parameter
	 */
	public static void main(String args[]) {
		// 2 populated sets
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		//this set will stay empty for testing
		IntegerSet setE = new IntegerSet();
		// will be populated and then cleared later
		IntegerSet setC = new IntegerSet();
		
		// Testing add function, does not add duplicates
		set1.add(0);
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		//Populate set 2 for later use
		set2.add(2);
		set2.add(3);
		
		// populate set C and then clear it
		setC.add(10);
		setC.add(20);
		setC.add(30);
		setC.add(40);
		
		//test the .toString method
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of setE is: " + setE.toString());
		System.out.println("Value of setC is: " + setC.toString());
		
		// Test the clear function on setC
		/*
		setC.clear();
		System.out.println("Value of setC after clear is: " + setC.toString());
		*/
		
		// test the contains function on set1
		System.out.println("Set1 contains the number 1?: " + set1.contains(1));
		
		//Test the .length method on populated and empty sets
		System.out.println("Populated Set size displays as: " + set1.length());
		System.out.println("Empty Set size displays as: " + setE.length());
		
		// Tests the smallest and largest functions on populated and empty sets
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Smallest value in setE is: " + setE.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		System.out.println("Largest value in Set1 is: " + setE.largest());
		
		// test equals function
		System.out.println("Does set 1 equal set 2? " + set1.equals(set2));
		System.out.println("Does set 1 equal set 1? " + set1.equals(set1));
		
		// Test intersect function
		System.out.println("Set 1 before using intersect function: " + set1.toString());
		System.out.println("Set 2 before using intersect function: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Set 1 after using intersect function: " + set1.toString());
		
		//Test isEmpty function
		System.out.println("Is set1 empty? " + set1.isEmpty());
		System.out.println("Is setE empty? " + setE.isEmpty());
		
		// Test Union function
		set1.union(set2);
		System.out.println("Set1 after using Union is: " + set1.toString());
		
		// Test diff function
		set1.diff(set2);
		System.out.println("Value of Set1 after using diff with set1 and set2 is:" + set1.toString());

	};
};


