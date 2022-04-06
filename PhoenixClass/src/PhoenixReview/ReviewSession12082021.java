package PhoenixReview;

import java.util.Arrays;

public class ReviewSession12082021 {

	public static void main(String[] args) {

		// Array:
		// with arrays we can store multiple values with similar data types in a single
		// variable
		// Advantage: code optimization, random access
		// disadvantage: size is fixed, need to adjust the size manually if required.
		// also waste of memory if set to 10 but only 1 is used

		// Array types:
		// single dimension
		// multi dimension

		String name[] = { "", "" }; // declaration, initialization, instantiation (creating the object)
		String[] name1 = new String[4]; // declaration, instantiation
		name1[0] = ""; // initialize

		// To instantiate is to create such an instance by, for example, defining one
		// particular variation of object within a class, giving it a name, and locating
		// it in some physical place. ... In other words, using Java, you instantiate a
		// class to create a specific class that is also an executable file you can run
		// in a computer.

		String[] fruit = new String[5];
		fruit[0] = "Oranage";
		fruit[1] = "Banana";
		fruit[2] = "Peach";
		fruit[3] = "Watermelon";
		fruit[4] = "Apple";

		Arrays.sort(fruit); // sorting the array list A-Z

		// methods for printing arrays
		// 1- for loop

		for (int i = 0; i < fruit.length; i++) { // better waybecause you can use if
			System.out.println(i + " " + fruit[i]);
		}

		System.out.println();

		// 2- for each loop

		for (String listfruit : fruit) {
			System.out.println(listfruit);
		}

		System.out.println();

		// 3- toString method

		String listOfFruit = Arrays.toString(fruit);
		System.out.println(listOfFruit);

		System.out.println();

		String[] months = { "Jan", "Feb", "Mar", "Apr" };
		String[] copyMonths = new String[10];

		System.arraycopy(months, 0, copyMonths, 0, months.length);

		String copyMonths1 = Arrays.toString(copyMonths);
		System.out.println(copyMonths1);

		System.out.println();

		String[][] fruit1 = new String[4][4];

		fruit1[0][0] = "";
		fruit1[0][1] = "";
		fruit1[0][2] = "";
		fruit1[0][3] = "";

		String[][] fruite1 = { { "Apple", "Banana", "Orange", "Peach" }, { "Mango", "Watermelon" }, { "Kiwi" },
				{ "Avacado", "Cucumber", "Raspberry", "BlueBerry", "Melon" } };

		for (int a = 0; a < fruite1.length; a++) {
			for (int b = 0; b < fruite1[a].length; b++) {
				System.out.print(fruite1[a][b] + " ");
			}
			System.out.println("  ");
		}

		System.out.println();

		String deepToString = Arrays.deepToString(fruite1);

		System.out.println(deepToString);

		// how many ways we can initialize an object:
		// 1- by reference
		// 2- by method
		// 3- by constructor

	}

}
