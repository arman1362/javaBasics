package javaBasics;

public class J_09_10_13_FizBuzzLoopNestedLoop {
	public static void main(String[] args) {

		int num = 2;
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is Odd");
		}

		// FizBuzz
		int number = 13;
		if (number % 5 == 0 && number % 3 == 0) {
			System.out.println("Fizz Buzz");
		} else if (number % 3 == 0) {
			System.out.println("Fizz");
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(number);
		}

		System.out.println("--------------");

		// Iteration
		// Format:
		// while (condition)
		{
			// loop body
		}
		// next statement

		int number1 = 1;
		while (number1 <= 10) {
			System.out.print(number1++ + " ");
		}
		System.out.println();

		// infinite loop
		// if we put in number1 > 0 in above then it infinitely loops which is called an
		// infinite loop

		System.out.println("----------------");

		int num1 = 7;
		while (num1 > 3) {
			System.out.print(--num1 + " "); // 6543
		}

		System.out.println("      ");

		System.out.println("-----------------");

		int a = 10;
		while (a >= 6) {
			System.out.print(a-- + " "); // 10-6
		}
		System.out.println();
		System.out.println("-----------------");

		int b = 1;
		while (b <= 9) {
			System.out.print((b += 2) + " "); // 3, 5, 7, 9, 11
		}
		System.out.println();
		System.out.println("---------------------");

		// or

		int k = 3;
		while (k <= 11) {
			System.out.print(k + " "); // 3, 5, 7, 9, 11
			k += 2;
		}
		System.out.println();
		System.out.println("---------------");

		int num3 = 1;
		int num4 = 1;
		while (num3 <= 4) { // specify the iteration times
			while (num4 <= 6) { // specify the range 1-6
				System.out.print(num4 + " "); // since there is no ln here all the numbers stick together
				num4++;
			}
			System.out.println();
			num4 = 1;
			num3++;
		}
		System.out.println("---------------");

		int num5 = 5;
		while (num5 > 0) {
			System.out.print(num5 + " ");
			num5--;
		}

		System.out.println("      ");

		System.out.println("--------------");
				
	// printing 1 to 10 Small Top

		int a1 = 1;
		int b1 = 1;

		while (a1 <= 10) {
			while (b1 <= a1) {
				System.out.print(b1 + " ");
				b1++;
			}
			System.out.println();
			b1 = 1;
			a1++;
		}
		
		/*
		 b should always reset to its initial value in the second part
		 b always following the case like printing 1 to 10 small top or large top b would be 1
		 b is printing the rows and a is printing the columns
		 for printing 1 to 10 small top or large top b <= a 
		 for printing 10 to 1 small top or large top b >= a
		 */

	// printing 1 to 10 large Top
		int a4 = 10;
		int b4 = 1;

		while (a4 > 0) {
			while (b4 <= a4) {
				System.out.print(b4 + " ");
				b4++;
			}
			System.out.println();
			b4 = 1;
			a4--;
		}

		System.out.println("-------------");

	// printing 10 to 1 Small Top

		int a2 = 10;
		int b2 = 10;

		while (a2 > 0) {
			while (b2 >= a2) {
				System.out.print(b2 + " ");
				b2--;
			}
			System.out.println();
			b2 = 10; // rows
			a2--; // columns
		}

	// printing 10 to 1 Large Top

		int a3 = 1;
		int b3 = 10;

		while (a3 <= 10) {
			while (b3 >= a3) {
				System.out.print(b3 + " ");
				b3--;
			}
			System.out.println();
			b3 = 10;
			a3++;
		}
		System.out.println("---------------");

		char c = 'a';
		while (c <= 'z') {
			System.out.print(c++ + " ");
		}

		System.out.println("      ");

		System.out.println("----------------");

		char d = 'a';
		while (d <= 'z') {
			System.out.print((int) d + "-" + d + ", ");
			d++;
		}
	}
}
