package javaBasics;
import java.util.ArrayList;
import java.util.List;

public class Updated_ArrayLists {

	public static void main(String[] args) {

		/* ArrayLists
		Are not fixed in size, they are dynamic.
		In Collection, objects such as ArrayList, primitive types cannot be used. 
		ArrayList can only store objects. We must use wrapper classes to convert primitives 
		to objects. 
		Byte	Short	Integer		Long	Float	 Double		Boolean		Character
		 */

		Integer x1 = 10; // Wrapper class

		System.out.println(x1);

		System.out.println("-----");

		int y = 10; // primitive data type

		String z = "five";

		System.out.println(x1 + y); // addition

		System.out.println(x1 + y + z); // addition and then concatenation
		
		System.out.println("-------");
		
		int a = 10;
		Integer b = 10;
		String c = "5";

		System.out.println(a + b + Integer.valueOf(c));

		System.out.println("-------");    

		System.out.println(c + b + a); // concatenation,

		System.out.println(c + (b + a)); // concatenation + (addition)

		System.out.println("-----");

		// we can't have empty indexes with arraylist

		List <Integer> test = new ArrayList <Integer> ();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);

		System.out.println(test.size());
		System.out.println(test.get(5));
		
		// Replacing the value in ArrayList
		test.set(4, 78);
		System.out.println(test.get(4));

		System.out.println("---------");

		// printing all the indexes in the arraylist
			// using for loop

		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}

		System.out.println();
		
			// using enhanced for loop
		for (Integer i : test) {
			System.out.print(i + " "); 
		}

		System.out.println();

			// directly printing all the ArrayList Elements
		System.out.println(test);

		System.out.println("--------");
		
		List<String> states= new ArrayList <String> ();
		states.add("DC");
		states.add("VA");
		states.add("CA");
		states.add("TX");
		
		// printing the arraylist size
		System.out.println(states.size()); 
		
		// printing a specific index
		System.out.println(states.get(2)); 

		System.out.println("---------");
		
		// printing using for loop
		for (int d = 0; d < states.size(); d++) {
			System.out.print(states.get(d) + ","); 
		}

		System.out.println();

		// printing list of states from TX to DC
		for (int d = states.size() - 1; d >= 0; d--) {
			System.out.print(states.get(d) + ","); 
		}
		System.out.println();

		// using enhanced for loop
		for (String n : states) {
			System.out.print(n + ","); 
		}
		System.out.println();

		// // directly printing all the ArryList Elements
		System.out.println(states); 

		// Class and object
		
		// class is a blueprint
		// object is a copy of the class
		// Constructors are the methods that helps you create the objects
		// ArrayList<String> states = new ArrayList<String> (); the part after new is
		// calling the constructor
		// access modifier (public) + name of the class (Student) + (arguments) { body
		// of the method}
	}
}
