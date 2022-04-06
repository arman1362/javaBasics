package javaBasics;

public class J_L_10_14 {

	public static void main(String[] args) {
		//check the difference between unary and ternary operator
		
		int num = 4;
		int answer = num <= 2 ? 20 :  num <= 4 ? 40 : num <= 6 ? 60 : num <= 8 ? 80 : 100;
		System.out.println(answer);
		
		int x = 9;
		if (x %3 == 0 && x %5 == 0) {
			System.out.println("FizzBuzz");
		} else if (x %3 == 0) {
			System.out.println("Fizz");
		} else if (x %5 == 0) {
			System.out.println("Buzz");
		}
		
		int a = 5;
		int b = 3;

		while (a >= 1) {
			System.out.println(a + "\tFirst Loop!");
			a--;

			while (b >= a) {
				System.out.println(b + "\tSecond Loop!");
				b--;
			}
		}
		
		String type = "Credit";
		double amount = 600;

		switch (type) {

		case ("Checking"):
			System.out.println(amount < 500 ? "Transaction OK!" : "");
			break;

		case ("Saving"):
			System.out.println("You can't directly withdraw from Saving!");
			break;

		case ("Credit"):
			if (amount < 1000) {
				System.out.println("Transaction Ok!");
			} if (amount > 500) {
				System.out.println("Confirmation message sent!");
			}
		break;
		}

	}
}
