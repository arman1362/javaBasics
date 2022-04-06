package javaBasics;

public class J_04_10_04_ConcatinationCastingShortcutOperator {

	public static void main(String[] args) {
		
		// If computer crashes and you lose the contents then <workspace>/.metadata/.plugins/org.eclipse.core.resources/.history/*/*
		// The most recent timestamp includes the most recent data
		// Converting char to ASCII numbers
		
		int asciiValue2 = 97;
		for (int i = asciiValue2; i <= 122; i++) {
			String convertedChar2 = Character.toString ((char)(i));
			System.out.println(i + " => " + convertedChar2);
			}
		
		System.out.println("================");
		
		int asciiValue3 = 65;
		for (int i = asciiValue3; i <= 90; i++) {
			String convertedChar3 = Character.toString ((char)(i));
			System.out.println(i + " => " + convertedChar3);
			}
		
		System.out.println("==================");
			
		char charA = 'A';
		System.out.println(charA);
		
		char ch = 'k';
		int convertedNum = (int) ch; 
		System.out.println(convertedNum);
		
		int chNum = 90;
		char convertedChar = (char) chNum;
		System.out.println("convertedChar = " + convertedChar);
		
		System.out.println("================");
		
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
		
		System.out.println("==================");
		
		//shortcut operator
		/*
		x = 10
		x = x + 10;
		x += 10; shortcut operator
		*/
		
		int num7 = 10;
		num7 += 10;
		num7 = num7 + 10;
		System.out.println(num7);
		
		System.out.println("==============");
		
		num7 %= 2;
		System.out.println("num7 = " + num7);
		
		System.out.println("==============");
				
		// += 	
		// *= 	
		// /=		
		// -=													
		// %=
		
		int r = 1;
		r += 3; 	//r = r +3; 	//r = 4
		r *= 5; 	//r = r * 5 	//r = 20
		r /= 2; 	//r = r / 2		//r = 10
		r -= 3;		//r = r - 3		//r = 7
		r %= 5;		//r = r % 5		//r = 2
		System.out.println(r);
		
		System.out.println("==================");
		
		int num5 = 10;
		num5 += 10;
		num5 = num5 + 10;
		System.out.println(num5); //30
		
		int num6 = 5;
		num6 *= 10;
		System.out.println(num6); //50
		
		System.out.println("=================");
							
		// displaying Odd and Even numbers
		
		System.out.println(evenOdd (5256488));
		
		// Order of precedence
		// (  ) 
		// *
		// /
		// %
		// +
		// -
		// =
		
		int num1 = 5 + 7 / 3 - 6 % 4;
		System.out.println(num1);
	}
	public static String evenOdd(int x) {
		if (x % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}

}

