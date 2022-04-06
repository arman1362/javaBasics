package javaBasics;

import java.util.ArrayList;
import java.util.List;

public class Interview_FibonacciNumbers {

	public static void main(String[] args) {
		// Fibonacci Numbers

		// the first two numbers are 0 and 1. the rest of numbers are the sum of two
		// previous numbers.

		System.out.println(fibNumbers(10));
	}

	public static List<Integer> fibNumbers(int end) {
		List<Integer> fibNum = new ArrayList<Integer>();
		fibNum.add(0);
		fibNum.add(1);

		for (int i = 0; true; i++) {
			if (i >= end) {
				break;
			}
			fibNum.add(fibNum.get(fibNum.size() - 1) + fibNum.get(fibNum.size() - 2));
		}
		return fibNum;
	}

}
