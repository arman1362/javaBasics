package javaBasics;

import java.util.Arrays;

public class Updated_Arrays {

	public static void main(String[] args) {
		
		/*
		arrays are fixed in size, and you must define the data types as well as dimensions.
		arrays are made of contiguous blocks of memory.
		in Arrays duplicate values are acceptable but in Sets duplicate values are not accepted
		number five inside the square bracket below is the number of indexes in the array.
		 */
		
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

		int[] data2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 2000,
				3000, 4000, 5000, 6000 };

		System.out.println(data2.length); // getting the length of the array

		Arrays.sort(data); // sorting the array elements

		System.out.println(data2[data2.length - 1]);// getting the last index value in the array

		System.out.println("-----------------");

		// printing from first to last
		for (int d = 0; d < data2.length; d++) {
			System.out.print(data2[d] + ", ");
		}

		System.out.println();

		// printing from last to first
		for (int b = data2.length - 1; b >= 0; b--) {
			System.out.print(data2[b] + ", ");
		}

		System.out.println();
		System.out.println("--------------");

		double[] numbers5 = new double[5];
		for (int i = 0; i < numbers5.length; i++) {
			numbers5[i] = (i + 1) * 5;
			System.out.print(numbers5[i] + " ");
		}
		
		System.out.println();
		System.out.print(Arrays.toString(numbers5));
		
		}
	}

