package javaBasics;

public class Interview_AddingAllPreviousNumbers {

	public static void main(String[] args) {
		
		// make a function that every number is the sum of all previous numbers -
		// it is not Fiboancci

		int sum = 0;
		int[] numbs = new int[10];
		numbs[0] = 1;

		for (int i = 0; i < numbs.length - 1; i++) {
			// calculate the sum
			sum += numbs[i];

			numbs[i + 1] = sum;
			System.out.print(numbs[i] + " ");
		}
	}

}
