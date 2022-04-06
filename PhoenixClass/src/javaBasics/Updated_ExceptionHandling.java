package javaBasics;

public class Updated_ExceptionHandling {

	public static void main(String[] args) {
	/*
	Suppose there are 10 statements in a Java program and an exception occurs at statement 5;
	the rest of the code will not be executed, i.e., statements 6 to 10 will not be executed. 
	However, when we perform exception handling, the rest of the statements will be executed. 
	The core advantage of exception handling is to maintain the normal flow of the application.
	*/
		
	/*
	Types of Java Exception:
	  1.  Exceptions: are caused by the code of the application itself. 
	   	  The use of try-catch blocks can handle exceptions and recover the application from them.
		1.1  Checked Exceptions: are checked at the compile time 
		 	 Examples: IOException, SQLException, ClassNotFoundException
		1.2  Unchecked Exceptions: are checked at the runtime, 
		 	 Examples: ArithmeticException, NullPointerException, NumberFormat Exception, ArrayIndexOutOfBoundsException
	  2.  Errors: are irrecoverable conditions which are usually raised by the environment in which
		  the application is running. It is not possible to recover from an error.
		  Examples: OutOfMemoryError, VirtualMachineError, AssertionError 
		 */
		
	/*
	Java Exception Keywords:
		1- Try: specify a block where we should place an exception code
		2- Catch: is used to handle the exception
		3- Finally: is used to execute the necessary code of the program. 
		   It is executed whether an exception is handled or not. It is like default block at switch cases.
		   Finally block will not be executed if system.exit() is called or there is a fatal error that
		   causes the process to abort.
		4- Throw: is used to throw an exception explicitly in the code, inside the function or the
		   block of code. Example: try and catch for screenshot method in laptops page objects
		5- Throws: The "throws" keyword is used to declare exceptions. It specifies that there may 
		   occur an exception in the method. It doesn't throw an exception. 
		   Throws is always used with method signature. Example: throws IOException at Screenshot method
	       
	       Throw vs Throws:
	       Throw handover the instance of the exception created by the programmer to the JVM manually. 
	       Throws handover the responsibility of handling the exception occurred in the method to the caller method. 
	*/
	}
}


