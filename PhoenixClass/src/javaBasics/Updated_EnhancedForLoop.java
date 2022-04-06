package javaBasics;

import java.util.Arrays;

public class Updated_EnhancedForLoop {

	public static void main(String[] args) {
		
		// Enhanced for loop
		
		/*
		Enhanced for loop provides a simpler way to iterate through the elements of a collection
		or array. It is inflexible and should be used only when there is a need to iterate 
		through the elements in a sequential manner without knowing the index of the currently 
		processed element.Also note that the object/variable is immutable when enhanced for loop
		is used i.e it ensures that the values in the array can not be modified, so it can be 
		said as read-only loop where you can’t update the values as opposite to other loops 
		where values can be modified. Java recommend using this form of the for statement instead 
		of the general form whenever possible.
		
		Syntax:
		for (T element:Collection obj/array)
		{
    		statement(s)
		}
		 */
		
		String data[] = { "v1", "v2", "v3" };
		for (String str : data) {     
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("--------");

		// compared to for loop

		int[] arr = { 12, 21, 5, 1, 5, 1, 5, 1, 5 };

		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("--------");

		System.out.println(Arrays.toString(arr));

		System.out.println("--------");

		String names[] = new String[5];
		names [0] = "Arman";
		names [3] = "Birmangham";
		for (String s : names) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		System.out.println("--------");

		String names2[] = new String[5];
		names2[0] = "Jack";
		names2[1] = "David";
		names2[2] = "Mani";
		names2[3] = "Jawad";
		names2[4] = "Kamil";

		// printing with for each

		for (String i : names2)
			System.out.print(i + ", ");

		System.out.println();
		System.out.println("--------");

		// printing with sysout

		System.out.print(Arrays.toString(names2));

		System.out.println();
		System.out.println("--------");

		// printing with for loop

		for (int i = 0; i < names2.length; i++) {
			System.out.print(names2[i] + ", ");
		}

		System.out.println();
		System.out.println("--------");

		int[] numbers = { 1, 5, 478, 1, 58, 1, 85, 12, 87, 3, 685, 12, 871, 2, 8721, 5, 6 };

		int count = numbers.length;
		int sum = 0;
		int min = numbers[0];
		int max = numbers[0];
		double avg = sum / numbers.length;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) { // to find the min
				min = numbers[i];
			} else if (numbers[i] > max) { // to find the max
				max = numbers[i];
			}
			sum = sum + numbers[i]; // to find the sum
			avg = sum / numbers.length;
		}
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Avg: " + avg);

	}

}
