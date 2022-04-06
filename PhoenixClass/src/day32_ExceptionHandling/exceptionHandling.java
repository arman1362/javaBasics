package day32_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class exceptionHandling {
	
	// Types of exception;
		// 1- user-defined
		// 2- pre-defined
	
	// types of esception:
		// 1- checked- compile time (you must handle them before running the code)
		// 2- unchecked (they may happen during runtime)
	
	// Errors: issues with the environment that we run in (our code do not match to fix it, so we dont focus on these).
	
	// runtime exceptions: a family of exceptions that happen during runtime.we need to predict and handle these
	
	public static void main(String[] args) {
		int x = 10; // arithmatic exception
		int y = 0;

		// System.out.println(x / y); // unchecked exception as Java will tell you about it in the run time
		// to get around that error we can do below; 
		
		if (y == 0) {
			System.out.println("Can not divide by zero");
		} else {
			System.out.println(x / y);
		}
		System.out.println("test");

		// FileInputStream fs = new FileInputStream(new File("")); // checked exception, Eclipse message : "unhandled
																	// exception type, FileNot Found Exception"
		
//		int [] nums = {1,2,3,4};
//		System.out.println(nums [4]); // unchecked index out of bound exception
//		
//		String str = null;
//		
//		System.out.println(str.charAt(0)); // unchecked null pointer exception
//		
//		System.out.println("test");
		
		// exception handling methods
		// 1- try and catch; like sandboxing paint a table
		// 2- throws

		int a = 10;
		int b = 0;

		int[] nums2 = { 1, 1 };

		try {
			System.out.println(a / b);
			System.out.println(nums2[3]);

		} catch (ArithmeticException e) {
			System.out.println("can not devide by zero");
			e.printStackTrace();
			System.out.println("the message: " + e.getLocalizedMessage());
			throw e; // accept the exception and stop the code

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are printing to an index that does not exist");

		} catch (Exception e) { // this block is kind of general exception handling that will allow the code to
								// run
			System.out.println("something went wrong");
		}
		System.out.println("End of the program");
	
		// Try is structured like if statements, but its going to sandbox the code and try to catch the exception that may occur during the runtime.
		
//		try {
//		} catch declare the exception e) {
//			// this is basically the code that you are going to run if that exception occur
//		}
//		finally // this block is going to be executed regardless of other things
//		}

		// throw vs throws 
			// throw will be like asking Java to run that exception. as soon as an application occur, the execution of your application will stop.
			// throws is like passing the responsability of handling the exception to the person who calls the method
		ArithmeticException myException = new ArithmeticException ();
		throw myException;
		
		}
}
