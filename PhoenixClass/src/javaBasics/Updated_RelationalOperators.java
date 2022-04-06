package javaBasics;

public class Updated_RelationalOperators {

	public static void main(String[] args) {
		
		// relational Operators includes:
			// comparison operators: < > <= >= 
			// equality operators: == !=
		
		/*
		Operator	Function					True Example	False Example
		<			Less than					7 < 8			12 < 5
		>			Greater than				0.5 > 0.2		-3 > 2
		==			Equal to					2 == 2			"Dave" == "Steve"
		!=			Not equal to				5 != 9			5 != 5
		<=			Less than or equal to		4 <= 4			315 <= 43
		>=			Greater than or equal to	2 >= -2			39 >= 40
		 */
		
		Boolean b1;
		if (b1= 15 > 5);
		System.out.println(b1); //true
		
		Boolean b2;
		if (b2 = 'd' < 17);
		System.out.println(b2); // false
		
		boolean b3;
		if (b3= !false != !true);
		System.out.println(b3); //true
		
		Boolean b4;
		if (b4= 42 == 42.00001);
		System.out.println(b4); //false
		
		Boolean b6;
		if (b6= 'A' < 'd' != 23 > 'Z');
		System.out.println(b6);// true
		
		int x = 10;
		int y = 10;
		
		System.out.println(x == y);//true
		System.out.println(x+1 == ++y);//true
		System.out.println(x == y);
		//false because ++y add one to the value of y but x+1 only adds one to 
		//x for printing, it does not add value to the actual value of x. see below
		
		int a = 1;
		System.out.println(a+1);
		//System.out.println(++a);
		System.out.println(a);
	}

}
