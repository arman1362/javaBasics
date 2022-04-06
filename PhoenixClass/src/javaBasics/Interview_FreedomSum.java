package javaBasics;

public class Interview_FreedomSum {

	public static void main(String[] args) {
		
		/*
		P2: In JAVA, write a snippet inside the below "freedomSum" method to find sum of three 
		numbers with a condition. Please read the below problem. Given 3 integer values, a b c, 
		return their sum. However, if one of the values is 10 then it does not count towards 
		the sum and values to its right do not count. So, for example, if b is 10, then both b and
		c do not count. 
		Examples: 
		freedomSum (l, 2, 3) --> 6 
		freedomSum (l, 2, 10)--> 3 
		freedomSum (l, 10, 3) --> 1 
		public int freedomSum(int a, int b, int c) { 
		//insert your code here 
		 */
		System.out.println(freedomSum(1, 4, 3));
	}

	public static int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;
		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}
	}
}
