package javaBasics;

import java.util.ArrayList;

public class J_15_10_25_ArraysList {

	public static void main(String[] args) {

		int nums[][][][] = new int[2][3][5][5]; // the first one is the number of workbooks, the second one is the
												// number of sheets, the third one is the number of rows and the last of
												// one is the number of columns
		int x = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				for (int k = 0; k < nums[i][j].length; k++) {
					for (int m = 0; m < nums[i][j][k].length; m++) {
						nums[i][j][k][m] = x++;
						System.out.print(nums[i][j][k][m] + "\t");
					}
					System.out.println("next row");
				}
				System.out.println("----- next sheet");
			}
			System.out.println("next workbook");
		}

		System.out.println("------------");

		// Array lists
		// are not fixed in size, they are dynamic
		// you can't use primitives with array lists

		// wrapper classes;
		// Byte
		// Short
		// Integer
		// Long
		// Float
		// Double
		// Boolean
		// Character

		Integer x1 = 10; // Wrapper class
		
		System.out.println(x1);
		
		System.out.println("=========");
		
		int y = 10; // primitive data type

		String z = "five";

		System.out.println(x1 + y); // addition

		System.out.println(x1 + y + z); // addition and then concatenation

		System.out.println("-------");

		int a = 10;
		Integer b = 10;
		String c = "5";

		System.out.println("============");

		System.out.println(a + b + Integer.valueOf(c));

		System.out.println("==========");

		System.out.println(c + b + a); // concatenation,

		System.out.println(c + (b + a)); // concatenation + (addition)

		System.out.println("-----");

		// CTRL + Shift + O manages all the imports that you need to do in a class
		// we can't have empty indexes with arraylist

		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);

		System.out.println(test.size());
		System.out.println(test.get(7));

		System.out.println("---------");

		// printing all the indexes in the arraylist

		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}

		System.out.println();

		for (Integer i : test) {
			System.out.print(i + " "); // for each loop
		}

		System.out.println();

		System.out.println(test);

		System.out.println("--------");

		ArrayList<String> states = new ArrayList<String>();
		states.add("DC");
		states.add("VA");
		states.add("CA");
		states.add("TX");

		System.out.println(states.size()); // printing the arraylist size
		System.out.println(states.get(2)); // printing a specific index

		System.out.println("---------");

		for (int d = 0; d < states.size(); d++) {
			System.out.print(states.get(d) + ","); // printing the list of states from DC to TX
		}

		System.out.println("\n");

		for (int d = states.size() - 1; d >= 0; d--) {
			System.out.print(states.get(d) + ","); // printing backward
		}
		System.out.println("\n");

		for (String n : states) {
			System.out.print(n + ","); // printing all array indexes through for each loop
		}
		System.out.println("\n");

		System.out.println(states); // printing all the indexes in the array format

		// Class and object

			// class is a blueprint
			// object is a copy of the class
			// Constructors are the methods that helps you create the objects
			// ArrayList<String> states = new ArrayList<String> (); the part after new is
			// calling the constructor
			// access modifier (public) + name of the class (Student) + (arguments) { body
			// of the method}
	}
}
