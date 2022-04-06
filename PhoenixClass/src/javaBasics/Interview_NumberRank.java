package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Interview_NumberRank {
	

	public static void main(String[] args) {
		String st = "101,15,46,87,94,94,52,86,36,94,89";
		
		int[] str = { 101, 15, 46, 87, 94, 94, 52, 86, 36, 94, 89 };

//		 Arrays.sort(str);
//		 
//		 System.out.println("Highest Number: " + str[str.length-1]);
//		 
//		 System.out.println("Second Highest Number: " + str[str.length-2]);

		System.out.println(numRank(st, 1)); // largest
		System.out.println(numRank(st, 2)); // second largest
		System.out.println(numRank(st, 3)); // third largest and so on
	}

	public static int numRank(String str, int position) {
		List<Integer> tempNums = new ArrayList<Integer>();
		Set<Integer> sortedNumberSet = new TreeSet<Integer>();
		for (String n : str.split(",")) {
			tempNums.add(Integer.valueOf(n));
		}
		sortedNumberSet.addAll(tempNums);
		List<Integer> sortedList = new ArrayList<Integer>(sortedNumberSet);

		return sortedList.get(sortedList.size() - position);
	}

}
