package javaBasics;

import java.util.Arrays;

public class J_11_10_18_DoWhileArrays {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		while (x > 0) {
			System.out.print("Outer " + x);
			while (y > 0) {
				System.out.print("   Inner " + y);
				y--;
			}
			y = 5;
			x--;
		}
		
		System.out.println("---------------");
		
		int num1 = 1;
		int num2 = 1;

		while (num1 <= 10) {
			System.out.println(num1++);
		}
		
		// Do While Loop
		
		// in while loop, we check the condition first and then 
		// we execute the body of the loop. In do while loop it is vice versa.
		
		int a = 10;
		
		System.out.println("Result of while loop  ");
		
		while (x > 10 && a <= 20) {
			System.out.println(x++);
		}

		System.out.println("Result of do while loop");

		do {
			System.out.println(a++);
		} while (a > 10 && a <= 20);
		
		// for loop
		
		// for (1- initialize the counter ; 2- conditions; 4- update)
		// 3- loop body
		
		for (int k = 1; k < 10; k++) {
		System.out.println(k);
		} 
		
		for (int k = 10; k > 0; k--) {
			System.out.println(k); //because k is in two different scopes then Java will not give an error of duplication
		}
		
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		for (int i = 7; i <=18; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		for (int i = 9; i<= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------");
		
		for (int i =5; i >= -5; i--) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		for (int i = -10; i <= 0; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		for (char myChar = 'a'; myChar<= 'd';myChar++)
			System.out.print(myChar + ", ");
	
		System.out.print("\n--------\n");
		
		String status = "Passed";
		double grade = 97;
		
		switch (status) {
		case "Passed":
			System.out.println("You Passed!");
			if (grade > 95) {
				System.out.println("You passed with a great grade!");
			}
			break;
			
		case "Failed":
			System.out.println("You failed this time, try again");
			break;
			
		case "Pending":
			for (int i = 1; i <=10; i++) {
				System.out.println(status + " " + i);
			}
			break;
			}
		
			// Arrays
			// arrays are fixed in size, and you must define the data types as well as
			// dimensions
			// arrays are made of contiguous blocks of memory.
			// number five inside the clod below is the number of indexes in the array

			// initializing the array

			int[] data = new int[5];
			data[0] = 10;
			data[1] = 20;
			data[2] = 30;
			data[3] = 40; 
			data[4] = 50;

			System.out.println(data.length); // getting the size of the array
			
			System.out.println(Arrays.toString(data)); // printing the array elements
			
			System.out.println(data[3]); // printing the 4th index value

			// initializing the array
			int[] data2 = {10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,2000,3000,4000,5000,6000};

			System.out.println(data2.length); // getting the length of the array
			
			Arrays.sort(data); // sorting the array elements 

			System.out.println(data2[data2.length - 1]);// getting the last index value in the array

			System.out.println("-----------------");

			for (int d = 0; d < data2.length; d++) {
				System.out.print(data2[d] + ", "); // printing from first to last
			}

			System.out.print("\n---------------\n");

			for (int b = data2.length - 1; b >= 0; b--) {
				System.out.print(data2[b] + ", "); // printing from last to first
			}
			
			System.out.print("\n---------------\n");

			for (int c = data2.length - 24; c <= data2.length - 1; c++)
				System.out.print(data2[c]+ ", "); // printing from first to last

			System.out.print("\n--------------\n");
			
			System.out.println(data2[6]);

			System.out.println("--------------");

			// for (int i = 0; i < 5; i++) {
			// System.out.println(data [i]);// printing the array values

			for (int i = 0; i < data.length; i++) { // instead of putting 5, we put the data.length as alias so of the
													// array size changes then it automatically reflected here.
				System.out.print(data[i] + ", ");
				{

				}
			}
		
		}	
	

}
		
		

