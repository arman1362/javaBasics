package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class Interview_FindDuplicateElements {

	// sets do not take duplicate values. the method add on set returns boolean which if return
	// false it means that it is a duplicate
	
	public static void main(String[] args) {
		
		String [] data = {"test", "text", "taste", "toast", "next", "fax", "max", "fax", "test"};

		printDuplicatesInArray (data);
	}
				
		public static void printDuplicatesInArray (String [] data) {

		Set<String> temp = new HashSet<String>();

		for (int i =0; i < data.length; i++) {
			if (!temp.add(data[i])) { // ! makes the return false which means the element is duplicate
				System.out.println("Dupicate element found on index: " + i + " with value of: " + data[i]);
			}
			
		}
	}

}
