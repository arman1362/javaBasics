package javaBasics;

public class Updated_Basics {

	public static void main(String[] args) {
		
		/* Eclipse Shortcuts
		CTRL+D remove the line
		CTRL+Shift+F format the code
		ALT+Shift+R re-factor the package
		CTRL+Space is for auto-complete of System.out.println ()
		type main and then CTRL space
		CTRL+F11 to run the application
		CTRL+SHIFT+O for imports

		Class is the blueprint of a product like car or phone
		Object is the copies of the product that is made

		Methods are functions like submit button at the end of the form 
		*/
			
		System.out.println("Java is Fun");
		System.out.println("I am Learning Java");
		System.out.println("My Name is Arman");
		
		/* Flow of control;
		 * 1- Sequential Execution (reading an English Book)
		 * 2- Method Call (Refer to page 15 and check the graph)
		 * 3- Selection (Either or, one true solution, Sally or Bob)
		 * 4- Looping
		 */
		System.out.println("===========");
		int x = 10;
		String y = "Test";
	
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(4 + 5);
		System.out.println(4 + " tests");
		System.out.println(x + 5 + " some text");
		System.out.println("some text "+ x + 5); 
		
		// the reason it prints some text 105 instead of some text 15 is that 
		// JAVA concatinate
		
		System.out.println("some test " + (x + 5));
		// the reason it prints some test + 15 is that first calculate the 
		// values inside the parenthesis and then the rest
		
		System.out.println("=============");

		int num1 = 25;
		int num2 = 15;
		
		if(num1 > num2) { 
			System.out.println("The answer is Yes!");
		} else {
			System.out.println("The answer is No!");
		}
		
		/* 	Errors in Java;
			1- Compiler errors; like omitting a parenthesis or semicolon the code will not run, these are easy to fix. 
			2- Runtime errors: like deviding 5 by 0, the code will run with the exception.It will give "Exception in"
			3- Logical errors: logical errors which lead to wrong results
				
			Syntax is the rules of language. Semantic is the meaning of the line. 
			Yellow underline is suggestion like spell check and can be ignored. 
			Red underline must be fixed.
		 */
		
		int x2 = 10;
		int y2 = 2;
		
		System.out.println(x2 / y2);//runtime error if y2 = 0
		
		int a = 5;
		int d = 3;
		int sum = a - d; //logical error, instead of the plus sign, we have put the minus sign which lead to wrong result (Semantic is wrong).

		System.out.println(sum);
		
		/*
		Java statements: appear inside of methods and classes; they describe all activities of a Java program. Variable declarations and assignments, 
		such as those in the previous section, are statements, as are the basic language structures like conditionals and loops. 
		Java Expressions: describe values; an expression is evaluated to produce a result, to be used as part of another expression or in a statement. 
		Method calls, object allocations, and mathematical expressions are examples of expressions.
		*/
		
		/*
		Statements are text that ends with ;
		If you double click on the curly brace, it will highlight the whole block of code inside 
		*/
		
		// Single line comment
		// Multiple line commenting; Highlight the code and then CTRL + /

		// Block of comment
		/* and hit enter and then it becomes like
		*
		*/

		System.out.println("Test:    " + x); //The space inside the double quote does matter.
		System.out.println("Test:" +         x); // The space outside the double quote does not matter 
	
		/*
		 In Java names are identifiers like class name or variable names or method
		 name. Change the identifier of variable means changing the name of the variable.
		 
		 Names in Java are case sensitive. Names can include Java letters which includes A-Z, a-z, _, $ but no space
		 Java variable names (identifiers) can include numbers however it should start with letters.
		 like int num123 = 123 but not int 123=123
		 		  
		 Java keywords can be used as names if used in first letter uppercase like Public.
		 
		 Start variable, methods, and package names in lower case.
		 Start class names with upper case.
		 */
		
		System.out.println("==============");
		
		@SuppressWarnings("unused")
		int NUM = 19; // variable name not recommended as it should start with lowercase
		
		int thisisalongname = 10; // not a good way to define long names int
		int this_is_a_long_name = 25; // separating with underscores
		int thisIsALongName = 10; // camel case the name, the best way
		 
		System.out.println(thisisalongname);
		System.out.println(this_is_a_long_name);
		System.out.println(thisIsALongName);
		 		 
		 /*
		  data_type name/identifier; <==== Declaration
		  name/identifier; <==== Initialization
		  data_type name = value; <==== Declaration and initialization
		 */
		 
		 int nameOfVariable; //declaration
		 nameOfVariable = 555; //initialization
		 int name3 = 666; // declaration and initialization
		 
		 System.out.println(nameOfVariable);
		 System.out.println(name3);
		 
		  /*
		  When the value of variable is changed after the first time then it is Assignment.
		  Be careful to mention the variable name and give it a new value, do not repeat the data_type
		  again otherwise java will give you a duplication error like 
		  int num3 = 666 initialization
		  num3 = 777 assignment
		  name3= 777; //Assignment
		  */
		 
		 System.out.println(name3==666); //"==" is equality operator while "=" is assignment operator
		 
		/* Data-types in java:
		A. Primitives (we have 8 of these)
			A.1 Numerics
			A.1.1 	Whole Numbers
					1. byte
					byte myByte = 127;
			
					2. short
					short var2 = 22333;
			 
					3. int
					int var3 = 1231231;
			
					4. long
					long var4 = 922337203685477580L;
			
			A.1.2	Numbers with Decimal points
					1. float  ----- single precision
					float var5 = 1212.12121f;
			
					2. double    ---  double precision
					double var6 = 123123123.123123123;
			
			A.2 Non-Numeric 
					1. boolean
					boolean var7 = true;
					
					2. char
					char var8 = 'a';
			
		B. Reference (Objects)
			String var8 = "test";
		*/
		 
		 // Method Call in Java from different class

		 J_L_09_30.subtraction (1500,5500,8500);
		 J_L_09_30.addition(400, 500);
		
		// Escape Sequence
		System.out.println("\tI shouted, \"Go away!\" as I ran towards the wolf.\n\tIt bared its teeth to me in reply.");

		// Order of precedence
		// (  ) 
		// *
		// /
		// %
		// +
		// -
		// =
		
		int num5 = 5 + 7 / 3 - 6 % 4;
		System.out.println(num5);
	}

}
