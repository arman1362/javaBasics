package javaBasics;

public class Updated_ConcatinationVsAddition {

	public static void main(String[] args) {
	//Concatenation vs Addition
		
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b +  " = " + a + b);
		System.out.println(a + " + " + b +  " = " + (a + b));
		
		System.out.println("================");
		
		int apple = 5;
		System.out.println(apple % 2); // to get the remainder of 5 divided by 2
		System.out.println(apple / 2); // to get the result of 5 divided by 2
		
		System.out.println("=================");
		
		// Divide by Zero Int
		
	    /*	
	  	int x = 10;
		int y = 0;
		int t = 0;
		*/
		
		//System.out.println(x/y); // Can not divide by zero
		//System.out.println(y/t); // Result is undefined
		
		// Divide by Zero Double

		double x1 = 10;
		double y1 = 0;
		int t1 = 0;
		
		System.out.println(x1/y1); // answer is Infinity
		System.out.println(y1/t1); // answer is Not a Number or NaN
		
		System.out.println("=================");
		
		// Mixed type
		double k = 6.7;
		int m = 3;
		
		System.out.println(k + m);// int is promoted to double
		System.out.println(k * m);// int is promoted to double
		System.out.println(k / m);// int is promoted to double
		
		System.out.println("================");
		
		// Casting in Java
		
			// Explicit casting 
		
		int num3 = (int) 10.59;
		System.out.println(num3);
		double num4 = 10.9;
		System.out.println((int)num4); // Java always round down
		
		System.out.println("================");
		
		int x4 = (int) 5.0; // 5.0 as double is casted to int
		System.out.println(x4); // displaying x4 
		double x5 = x4 / 2;
		System.out.println(x5);// result is 2.00 because 5.0/2
		
		System.out.println(5/2);
		
		System.out.println("================");
		
		int x6 = (int) 5.0;
		double x7 = x6 / 2.0; //it does matter if you write 2 or 2.0
		System.out.println(x7);// result is 2.5 because 5.0/2.0
				
		System.out.println("===================");
		
			// Implicit casting 
		double implicit = 6.7 / 3;
		System.out.println(implicit);
		
		int g = (int)12.36;
		System.out.println(Math.round(g)); //result is 12
	}

}
