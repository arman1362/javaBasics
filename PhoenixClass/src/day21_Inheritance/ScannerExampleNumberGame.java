package day21_Inheritance;

import java.util.Scanner;

public class ScannerExampleNumberGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int goal = 10;

		int numEntered;

		System.out.println("Please enter a number");

		numEntered = sc.nextInt();

		if (numEntered == goal) {
			// they guessed right, the nummer matches
			System.out.println("You have guessed correctly!");

		} else {

			while (numEntered != goal) {
				System.out.println("Try Again!");
				numEntered = sc.nextInt();

				if (numEntered == goal) {
					// they guessed right, the nummer matches
					System.out.println("You have guessed correctly!");
					break;

				} else {
					// the number does not match
					if (numEntered > goal) {
						System.out.println("Go Down!");
					} else {
						System.out.println("Go Up!");

					}

				}

			}
		}
	}

}

