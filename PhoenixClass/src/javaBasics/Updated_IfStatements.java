package javaBasics;

public class Updated_IfStatements {

	public static void main(String[] args) {
		
		double amount = 700;
		double shipping = 0;
		double discountAmount = 0;
		boolean expedited = false;

		if (amount < 100) {
			// add 5% for shipping and 0 for discount
			shipping = amount * 0.05;
			discountAmount = 0;
		} else if (amount >= 100 && amount < 300) {
			// free shipping and 2% discount
			shipping = 0;
			discountAmount = amount * 0.02;
		} else if (amount >= 300 && amount < 500) {
			// free shipping and 5% discount
			shipping = 0;
			discountAmount = amount * 0.05;
		} else if (amount >= 500 && amount < 1000) {
			// free expedited shipping and 7% discount
			shipping = 0;
			discountAmount = amount * 0.07;
			expedited = true;
		} else {
			// free expedited shipping and 10% discount
			shipping = 0;
			discountAmount = amount * 0.1;
			expedited = true;
		}

		System.out.println("================");
		System.out.println("Amount:\t\t\t$" + amount);
		System.out.println("shipping\t\t$" + shipping);
		if (expedited == true) {
			System.out.println("Expedited Shipping:     Yes!");
		} else {
			System.out.println("Standard Shipping:      Yes!");

		}
		System.out.println("Discount Amount:\t$" + discountAmount);
		System.out.println("Total Amount:\t\t$" + (amount + shipping - discountAmount));
		System.out.println("================");

		// Nested if /else
		int averageGrade = 90;
		if (averageGrade >= 90) {
			System.out.print("You got an A");
			if (averageGrade >= 97) {
				System.out.println("+");
			} else if (averageGrade <= 92) {
				System.out.println("-");
			}
		}

		// Dangling else is having two elses at the statement

		int age = 65;
		double bill = 15.65;
		double total;
		double tax;

		System.out.println(bill *= (age >= 65) ? 0.9 : 10);

		// alternative solution

		System.out.println("--------------------");

		if (age >= 65) {
			System.out.println("Senior Discount");
			bill *= 0.9;
			tax = bill * 0.08;
			total = bill + tax;

		} else {
			System.out.println("Regular Rate!");
			tax = bill * 0.08;
			total = bill + tax;
		}
		System.out.println(total);

		double grade = 95;

		if (grade >= 90) {
			System.out.println("Your grade is " + "A");
		} else if (grade >= 80) {
			System.out.println("Your grade is " + "B");
		} else if (grade >= 70) {
			System.out.println("Your grade is " + "C");
		} else if (grade >= 60) {
			System.out.println("Your grade is " + "D");
		} else {
			System.out.println("You Failed. Sorry!");
		}

		double grade2 = 62;

		if (grade2 >= 95) {
			System.out.println("Your grade is " + "A+");
		} else if (grade2 >= 90) {
			System.out.println("Your grade is " + "A-");
		} else if (grade2 >= 85) {
			System.out.println("Your grade is " + "B+");
		} else if (grade2 >= 80) {
			System.out.println("Your grade is " + "B-");
		} else if (grade2 >= 75) {
			System.out.println("Your grade is " + "C+");
		} else if (grade2 >= 70) {
			System.out.println("Your grade is " + "C-");
		} else if (grade2 >= 65) {
			System.out.println("Your grade is " + "D+");
		} else if (grade2 >= 60) {
			System.out.println("Your grade is " + "D-");
		} else {
			System.out.println("You Failed. Sorry!");
		}
	}

}
