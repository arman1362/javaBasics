package day34_35_JAVACollections;

import java.util.HashSet;

public class findingDuplicates {

	public static void main(String[] args) {

		// Find Duplicates
		// write a function if there is a duplicate in a given array

		int[] tempNum = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9 };
		
		System.out.println(hasDuplicate(tempNum));
		System.out.println(hasDuplicate2(tempNum));
	}
	// size 10 = 100
	// complexity O(n^2)
	
	public static boolean hasDuplicate(int[] data) {

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	// size 10 = 10
	// complexity O(n)
	// Find Duplicates using a set
	
	public static boolean hasDuplicate2(int[] data) {
		HashSet <Integer> temp = new HashSet <>();
		for (int i =0; i < data.length; i++) {
			if (!temp.add(data[i])) {
				return true;
			}
		}
		return false;
	}

}
