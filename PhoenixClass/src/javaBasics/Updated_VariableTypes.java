package javaBasics;

public class Updated_VariableTypes {

	public static void main(String[] args) {
		/*
		1- Local Variables
		2- Instance Variables
		3- Static Variables 
		
		1- 	Local variable: A variable defined within a block or method or constructor. 
			The scope of these variables exists only within the block in which the variable is declared. 
			i.e., we can access these variables only within that block.
			Initialization of the local variable is mandatory before using it in the defined scope.

		2- 	Instance Variable: non-static variable which is declared in a class outside 
			any method, constructor, or block. 
			It is called an instance variable because its value is instance-specific and is not shared 
			among instances.
			Unlike local variables, we may use access specifier for instance variables. 
			Instance Variable can be accessed only by creating objects.
			Initialization of Instance Variable is not Mandatory. Its default value is 0.
			
		3- 	Static Variables: also known as Class variables.
			If we access the static variable like the Instance variable (through an object), the compiler
			will show the warning message, which won’t halt the program. 
			The compiler will replace the object name with the class name automatically.
			You can create a single copy of the static variable and share it among all the instances of the class. 
			Initialization of Static Variable is not Mandatory. Its default value is 0.
			
			Unlike instance variables, we can only have one copy of a static variable per class irrespective 
			of how many objects we create.
			If we access the static variable without the class name, the compiler will automatically append the class name.
			


			
			
		 */

	}

}
