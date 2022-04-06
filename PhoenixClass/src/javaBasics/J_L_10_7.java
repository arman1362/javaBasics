package javaBasics;

public class J_L_10_7 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		String x = "Hello";
		String y = "World!";
		
		System.out.println(a+b+x+y);
		
		// compile using notepad
		// 1- copy the text from Eclipse or write directly in notepad
		// the code must start from public class LabSession_Oct_7_21 { and end with two }}
		// 2- save the file name exactly like the class name in this case LabSession_Oct_7_21.java
		// 3- Open CMD and go to where the file i located e.g. c:\\users\arman\onedrive\desktop
		// 4- type in javac LabSession_Oct_7_21.java
		// 5- then type in java LabSession_Oct_7_21
		// if you want to compile again then remove the .class file
		
		int age = 20;
		if (age > 15) {
			System.out.println("You are good");
		} else if (age > 50)
		{
			System.out.println("You need more excercise!");
		}
		
		System.out.println((10*10)/5+3-(1*4)/2);
	
		int d = 10;
		int m = 30;
		int n = 50;
	
		System.out.println(d < m);
		System.out.println(d < n);
	

	}

}
