package javaBasics;

import java.util.Arrays;

public class J_13_10_20_ForEachLoop {

	public static void main(String []args) {
		
	String [] data1 = {}; // the size of the array is 0 now
	String [] data2 = {"Value1" , "Value2"};
	data2 [0] = "Value10";
	System.out.println(data2 [1]);
	
	System.out.println("============");
	
	double [] numbers5 = new double [5];
	for ( int i = 0; i < numbers5.length; i++ ) {
		System.out.print(numbers5[i]+" ");
		
	}
	System.out.println();
	System.out.println("==============");
	
	System.out.print(Arrays.toString(numbers5));
	
	System.out.println();
	System.out.println("================");
	
	numbers5 [0] = 10;
	System.out.println("Index 0 = " + numbers5 [0]);
	
	System.out.println("-----------");
	
	for (int i = 0; i < numbers5.length; i++) {
		numbers5 [i] = (i + 1) * 5;
		System.out.print(numbers5 [i] + "\t");
	}
	System.out.println();
	System.out.println("---------------");
		
	// for each loop
		
	String data[] = { "v1", "v2", "v3" };
	for (String str : data) {
		System.out.print(str + " ");
	}
	System.out.println("  ");
	System.out.println("=================");
	
	// compared to for loop
	
	int[] arr = { 12, 21, 5, 1, 5, 1, 5, 1, 5 };

	for (int i : arr) {
		System.out.print(i + " ");
	}
	
	System.out.println(" ");
	System.out.println("===============");

	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	
	System.out.println();
	System.out.println("============");
	
	System.out.println(Arrays.toString(arr));
	
	System.out.println("================");

	String names [] = new String [5];
	for (String s: names) {
		System.out.print(s + " ");
	}
		System.out.println();
		System.out.println("===============");
		
	String names2 [] = new String [5];
			names2 [0] = "Jack";
			names2 [1] = "David";
			names2 [2] = "Mani";
			names2 [3] = "Jawad";
			names2 [4] = "Kamil";
	
	// priting with for each
			
	for (String i: names2)
	System.out.print(i + ", ");
	
	System.out.println(" ");
	System.out.println("===============");
	
	// printing with sysout
	
	System.out.print(Arrays.toString(names2));
	
	System.out.println();
	System.out.println("===========");
		
	// printing with for loop
	
	for (int i = 0; i < names2.length; i++) {
		System.out.print(names2[i] + ", ");
	}
	
	System.out.println();
	System.out.println("===========");
	
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
		avg = sum/numbers.length;
	}
	System.out.println("Count: " + count);
	System.out.println("Sum: " + sum);
	System.out.println("Min: " + min);
	System.out.println("Max: " + max);
	System.out.println("Avg: " + avg);
}
}

