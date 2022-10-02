package org.howard.edu.lsp.assignment4;
import java.util.*;

/**
 * @author guy
 * Guy L. Lingani
 * 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
 * @version 1.0
 */

public class IntegerSet  {
	
	// IntegerSetException class
	private class IntegerSetException extends Exception {
		IntegerSetException(String str){
			super(str);
		};
	}
	private ArrayList<Integer> set = new ArrayList<Integer>();

	/**
	 * Default Constructor
	 */
	public IntegerSet() {};
	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 * @return set.size() integer denoting the size of the set
	 */
	public int length(){
		return set.size();
	};

	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * @param b set of type IntegerSet
	 * @return boolean indicating whether or not the 2 sets are equal
	 */
	public boolean equals(IntegerSet b) {
		// check if sets are the same size first, if not, return false
		if (set.size() != b.set.size()) {
			return false;
		};
		
		//check to see if there are any differences between the two sets
		for (int i = 0; i < b.set.size(); i++) {
			if (set.contains(b.set.get(i)) == false){
				return false;
			}
		}
		return true;
	}; 
	
	/**
	 * Returns true if the set contains the value, otherwise false
	 * @param value integer variable
	 * @return boolean showing whether or not the set contains the value
	 */
	
	public boolean contains(int value) {
		return set.contains(value);
	};    
	
	/**
	 * Returns the largest item in the set. Throws a IntegerSetException if the set is empty 
	 * @return largest value found in the set
	 */
	public int largest()  {
		int max = 0;
		try {
			for (int i = 0; i< set.size(); i++) {
				if (set.get(i) > max) {
					max = set.get(i);
				}
			}
			if (set.size() > 0) {
				return max;
			}
			else {
		    IntegerSetException emptySet = new IntegerSetException("Set is empty, can't return a largest element");
		    throw emptySet;
			}
		} 
		catch (IntegerSetException emptySet){  
			emptySet.printStackTrace();
		}
		
		return -9999;
	}; 
	
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * @return smallest value found in the set
	 */
	public int smallest() {
		int min = 0;
		try {
			for (int i = 0; i< set.size(); i++) {
				if (set.get(i) < min) {
					min = set.get(i);
				}
			}
			if (set.size() > 0) {
				return min;
			}
			else {
		    IntegerSetException emptySet = new IntegerSetException("Set is empty, can't return a smallest element");
		    throw emptySet;
			}
		} 
		catch (IntegerSetException emptySet){  
			emptySet.printStackTrace();
		}
		return 9999;
	};
	/**
	 * Adds an item to the set or does nothing it already there	
	 * @param item an integer value that will be used to add to the set 
	 */
	public void add(int item) {
		if (set.contains(item) == false) {
		set.add(item);
		}
	};
	/**
	 * Removes an item from the set or does nothing if not there
	 * @param item an integer value
	 */
	public void remove(int item) {
		if (set.contains(item)){
			set.remove(set.get(item));
			}
	}; 
	
	/**
	 * Set union
	 * @param intSetb a set of type IntegerSet
	 */
	public void union(IntegerSet intSetb) {
		
		assert set.size() > 0 && intSetb.set.size() > 0;
		ArrayList <Integer> temp = new ArrayList<Integer>();
		
		// add elements from first set
		for (int i = 0; i < set.size(); i++) {
			if (temp.contains(set.get(i))) {
				continue;
			}
			else {
				temp.add(set.get(i));
			};
		};
		//add all unique elements from the 2nd set
		for (int j = 0; j < intSetb.length(); j++ ) {
			if (temp.contains(intSetb.set.get(j))) {
				continue;
			}
			else {
				temp.add(intSetb.set.get(j));
			};
		};
	};
	
	/**
	 * Set intersection will return values that both sets have in common
	 * @param intSetb a set of type IntegeSet
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> intersect_set = new ArrayList<Integer>();
		
		temp.addAll(set);
		temp.addAll(intSetb.set);
		Collections.sort(temp);
		
		
		for (int i = 1; i < temp.size(); i++) {
			if(temp.get(i) == temp.get(i-1)) {
				intersect_set.add(temp.get(i));
			};
		};
		
		set = intersect_set;
	}; 

	/**
	 * Set difference, i.e., s1 – s2
	 * @param intSetb set of type IntegeSet
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		//check if one of the sets are empty
		if (set.size() == 0 || intSetb.set.size() == 0) {
			return;
		};
		//check first set for intersection and then remove it
		for (int i = 0; i < set.size(); i++) {
			if(intSetb.set.contains(set.get(i)) == false) {
				temp.add(set.get(i));
			}
		}
		set = temp;
	};
	
	/**
	 * Returns true if the set is empty, false otherwise
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (this.set.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}; 
	
	/**
	 * Return String representation of your set
	 * @return set.toString set converted to string
	 */
	public String toString() {
		return(set.toString());
	};
	

}


