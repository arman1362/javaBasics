package javaBasics;

public class Updated_Keywords {

	public static void main(String[] args) {

		// keyword continue is used to end the current iteration in a for loop or
		// while loop and continues to the next iteration

		// keyword break is used to break out of a for loop, while loop, or a switch blobk
		

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				// break; // break stops the loop entirely
				continue; // it will skip (exclude) 5 and continue toward the end of the loop
			}
		}

		for (int k = 0; k < 10; k++) {
			if (k % 2 == 0) {
				continue; // skipping even numbers
			}
			System.out.println(k);
		}

		System.out.println("-------------");

		for (int l = 0; l < 10; l++) {
			if (l % 2 != 0) {
				continue; // skipping odd numbers
			}
			System.out.println(l);
		}
		
		/*
		 keyword Final: is used to restrict the user. Final can be:
			Variable: Stops value change
			Method: Stops Method Overriding
			Class: Stops Inheritance
			
			The static context (method, block, or variable) belongs to the class, not the object.
			Static Methods cannot be Overriden. 
			Java static property is shared to all objects.
			
			Constructors cannot be decalred as final. Methods can be decalred as final but then they cant be overriden.
			Abstract Classes cannot be declared as final if they have abstract methods and class is abstract
			Abstract methods cannot be final because they must be overriden and final keyword stops the method overriden
		 	Abstract Interface cannot be final becuase it needs to be implemented by classes and final keyword stops inheritance
		 
		 	Constructor cannot be inherited. Constructors cannot be static.
		 */
	}
}