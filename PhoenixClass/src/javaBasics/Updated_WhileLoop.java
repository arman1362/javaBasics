package javaBasics;

public class Updated_WhileLoop {

	public static void main(String[] args) {
		
// Loop Types
		 
		/*
		A while loop is a control flow statement that allows code 
		to be executed repeatedly based on a given Boolean condition. 
		The while loop can be thought of as a repeating if statement.
		
		Syntax:
		while (boolean condition) {
		loop statement
		}
		
		While loop starts with the checking of condition. If it evaluated to true, 
		then the loop body statements are executed otherwise first statement following 
		the loop is executed. For this reason it is also called Entry control loop.
		Once the condition is evaluated to true, the statements in the loop body are executed. 
		Normally the statements contain an update value for the variable being processed for 
		the next iteration.When the condition becomes false, the loop terminates which marks 
		the end of its life cycle.
		*/
		
		// printing 1 to 10 
		int num1 = 1;
		while (num1 <= 10) {
			System.out.print(num1 + " ");
			num1++;
		}
		System.out.println();
		
		// printing 6, 5, 4, 3
		int num2 = 7;
		while (num2 > 3) {
			System.out.print(--num2 + ", "); // because it is pre-increment, it does not include 7
		}     

		System.out.println();
		System.out.println("-----------------");

		// printing 10 - 6
		int a = 10;
		while (a >= 6) {
			System.out.print(a-- + " "); 
		}
		System.out.println();
		System.out.println("-----------------");

		// printing 3, 5, 7, 9, 11
		int b = 1;
		while (b <= 9) {
			System.out.print((b += 2) + " "); 
		}
		System.out.println();
		System.out.println("---------------------");

		// or

		int k = 3;
		while (k <= 11) {
			System.out.print(k + " "); 
			k += 2;
		}
		System.out.println();
		System.out.println("---------------");
		
		// printing 1 to 6 for 4 times
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

		// printing 5 - 1
		int num5 = 5;
		while (num5 > 0) {
			System.out.print(num5 + " ");
			num5--;
		}

		System.out.println();
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

		// printing a - z
		char c = 'a';
		while (c <= 'z') {
			System.out.print(c++ + " ");
		}

		System.out.println();
		System.out.println("----------------");
		
		// printin a - z with their ASCII values
		char d = 'a';
		while (d <= 'z') {
			System.out.print((int) d + "-" + d + ", ");
			d++;
		}
		
	}

}
