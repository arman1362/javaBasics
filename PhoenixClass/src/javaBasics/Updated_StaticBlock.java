package javaBasics;

public class Updated_StaticBlock {

	// The static block executes when classloader loads the class.
	// A static block is invoked before main() method.

	// Case 1: Static variable
	static int i;
	// Case 2: non-static variables
	int j;

	// Case 3: Static block
	// Start of static block
	static {
		i = 10;
		System.out.println("static block called ");
	}
	// End of static block

	public static void main(String args[]) {

		// Although we don't have an object of Test, static
		// block is called because i is being accessed in
		// following statement.
		System.out.println(i); //static call of the static variable
	}
}