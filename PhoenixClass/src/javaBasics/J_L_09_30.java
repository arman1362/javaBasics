package javaBasics;

public class J_L_09_30 {

	public static void main(String[] args) {

		String name = "United States of America";
		// 24 characters in that string because space is also calculated as one space.
		System.out.println(name);

		String name1 = "Richmond";
		String name2 = name1;
		String name3 = name1;
		String name4 = name1; 
		String name5 = name1;

		System.out.println(name1 + ": " + name2 + ": " + name3 + ": " + name4 + ": " + name5);

		System.out.println(name1 + ": " + name2 + ": " + name3 + ": " + name4 + ": " + name5);

		// or we can re-factor it by right clicking on the identifier:

		String city = "Richmond";
		String name6 = city;
		String name7 = city;
		String name8 = city;
		String name9 = city;

		System.out.println(city + ": " + name6 + ": " + name7 + ": " + name8 + ": " + name9);

		// Method Call in Java in the same class

		addition(400, 500);
		subtraction(500, 600, 1500);
		
		String message = "Hello World!";
		System.out.println(message.length ());
		
		System.out.println(message.replace("!" , "*")); // String is immutable so when we replace the characters, a new String will be created
		System.out.println(message);
		
		String testTrim = "      I am Arman!      ";
		System.out.println(testTrim);
		System.out.println(testTrim.trim());
		System.out.println(testTrim); // again String is immutable so the initial String does not change. A new string withe the applied changes will be created.
	}

	public static void addition(int nmbr1, int nmbr2) {
		int nmbr3 = nmbr1 + nmbr2;
		System.out.println(nmbr3);
	}

	public static void subtraction(int nbr1, int nbr2, int nbr3) {
		int nbr4 = (nbr3 - nbr2 - nbr1);
		System.out.println(nbr4);
		
		
		
	 	
	}


	
}

