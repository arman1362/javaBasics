package javaBasics;

public class J_06_10_06_ComparativeOperatorsLogicalGates {
	
	public static void main(String[] args) {
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
		
		Boolean b7;
		if (b7 = false == true !=false == true);
		System.out.println(b7);// false
		
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
		
		//logical gates
		/*
			A		B		A && B		A || B		A ^ B
			T		T		T			T			F
			T		F		F			T			T
			F		T		F			T			T
			F		F		F			F			F
				
			XOR; both sides must be different
			AND: both sides must be equal
			OR: at least one side must be true
		*/		
		// For OR as long as one side is true, that is enough, we don't care about the other parts
	
		//Scope in Java
		int x1 = 10;
		if (x > 5) {
			int y1 = 15;
			System.out.println(x1 + y1);
		} else {
			//System.out.println(x1 + y1);// y is a dead code here because it out of scope
		}
		
		int x2 = 10;
		int y2 = 3;

		if (x2 > 5) {
			int z = x2 / 7 * 4 % y2;
			y2 = z;
		} else {
			int q = y2 - x2 * 4 / y2 % x2;
			//x2 = z;// z is a dead code here because it is out of scope
		}
	}
	
	public class Car {
		public String color;
		private int speed;

		public Car(String color, int speed) {
			// Variables color and speed accessible here
		}

		public void drive(boolean fourWheel) {
			// Variables color and speed accessible here
		}
	}

	public class BuyCar {
		public void main(String[] args) {
			Car carObject = new Car("blue", 70);
			// Can access the public variable, color, in this class
			String carColor = carObject.color;
			// Can’t access the private variable, speed, in this class
			// int carSpeed = carObject.speed -- This results in an error, can’t access
			// speed here
		}
	}
}