package javaBasics;

public class Interview_CombinationOf3Numbers {

	public static void main(String[] args) {
		/*
		 * Write a function that print all the 3 digit combination of numbers between 1
		 * and 5 
		 * 1, 1, 1 
		 * 1, 1, 2 
		 * 5, 5, 5
		 */

		printNums(1, 5);
	}

	public static void printNums(int start, int end) {
		int x = 0;

		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				for (int k = start; k <= end; k++) {
					System.out.println(i + ", " + j + ", " + k);
					x++;
				}
			}
		}
		System.out.println("total possible combinations: "+ x);
	}
}
