package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
	// Array
		System.out.println("------ Array ------");
		
		Object array [] = new Object [5];
		array [0] = 12;
		array [1] = 1.42;
		array [2] = 'a';
		array [3] = "Arman";
		array [4] = true;
		
		System.out.println(Arrays.toString(array));

		Object [] array2 = {"BBC", 11, 3.57, 'z', false};
		System.out.println(Arrays.toString(array2));
		
		String arr [] = new String [5];
		arr [1]  = "Arman";
		arr [3] = "Amir";
	
		// printng the whole array elements
		System.out.println(Arrays.toString(arr)); 
		
		// printing the size of the array
		System.out.println(arr.length);
		
		// printing the 2nd element on the array
		System.out.println(arr[1]); 
		
		// replacing a specefix index in array with new value
		arr [1] = "Shahzad"; 
		
		System.out.println("--------");
		
		// printing the array elements using enhanced loop
		for (String d : arr) {
			System.out.print(d + " "); 
		}
		
		System.out.println("-------");
		int arr2[] = {1,3,2,4,5};
			
		System.out.println(Arrays.toString(arr2)); 
		
		// sorting the array
		Arrays.sort(arr2);
		
		// printing the array after sort
		System.out.println(Arrays.toString(arr2)); 
		
		// printing the array elements using for loop
		for (int i =0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " "); 
		}
		System.out.println();
		
		// printing the array elements using enhanced loop
		for (int h : arr2) {
			System.out.print(h + " "); 
		}
		System.out.println();

		int twoD [][] = new int [3][2];
		
		twoD [0][0]= 10;
		twoD [0][1]= 20;
		
		twoD [1][0]= 30;
		twoD [1][1]= 40;
		
		twoD [2][0]= 50;
		twoD [2][1]= 60;
		
		for (int i [] : twoD) {
			for (int j : i) {
				System.out.print(j + " ");
		}
			System.out.println();
		}
		
	// ArrayList
		
		System.out.println("------ Array List ------");
		
		List <Integer> arrList = new ArrayList <Integer>();
		arrList.add(6);
		arrList.add(7);
		arrList.add(8);
		arrList.add(9);
		
		// printing the size of the ArrayList
		System.out.println(arrList.size()); 
		
		// printing the 2nd element in ArrayList
		System.out.println(arrList.get(1)); 
		
		// removing the 3rd element from arrayList
		arrList.remove(2); 
		
		// printing ArrayList Elements before replacement
		System.out.println(arrList); 
		// replacing the array Element
		arrList.set(2, 10); 
		// printing ArrayList Elements after replacement
		System.out.println(arrList); 
		
		// assiging a value to a specefic index
		arrList.add(3, 11); 
		System.out.println(arrList); 
		arrList.remove(3);
		System.out.println(arrList);
		
		// printing ArrayList elements with enhanced loop
		for (int i : arrList) {
			System.out.print(i + " "); 
		}
		
		System.out.println();
		
		// printing ArrayList elements using for loop
		for (int b = 0; b < arrList.size(); b++) {
			System.out.print(arrList.get(b) + " "); 
		}
		
		System.out.println();
		System.out.println("---------");
		
 		List <String> arrList2 = new ArrayList <String>();
 		arrList2.add("Arman");
 		arrList2.add("Amir");
 		arrList2.add("Shahzad");
 		
 		// printing array List elements directly
		System.out.println(arrList2);
		
		// removing a specefic element 
		arrList2.remove("Arman");
		
		// printing the size of the array List
		System.out.println(arrList2.size());
		
		// printing the 2nd element ion the arrayList
		System.out.println(arrList2.get(1));
		
		// printing the arryList elements using enhanced loop
		for (String b : arrList2) {
		System.out.print(b+" ");
		}
		
		// printing the arryList elements using for loop
		System.out.println();
		for (int a = 0; a < arrList2.size(); a++) {
			System.out.print(arrList2.get(a) + " ");
		}
		
	// HashMap
		System.out.println();
		System.out.println("------ Hash Map ------");
		
		Map <Integer,String> hm = new HashMap <Integer,String>();
		hm.put (100, "Arman");
		hm.put (200, "Amir");
		hm.put (300, "Shahzad");
		hm.put (400, "Hussaini");
		
		System.out.println(hm);
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hm.remove(300);
		
		System.out.println(hm);
		
		hm.replace(200,"Babrak");
		
		System.out.println(hm);

 	}
}
