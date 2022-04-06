package javaBasics;

public class J_05_10_05_IncreamentDecrementIfStatement {

	public static void main(String[] args) {
		
		//Shortcut operators, prefix and post-fix increment& decrement
	
		int x = 10;
		System.out.println(++x); //prefix increment result 11
		System.out.println(x++); //post-fix increment result 11
		System.out.println(x);
		System.out.println(--x); //prefix decrement result 11
		System.out.println(x--); //post-fix decrement result 11
		System.out.println(x);
		
		System.out.println("=============");
		
		int y = 7;
		++y;
		y = ++y + ++y;
		System.out.println(++y);
		
		System.out.println("==============");
		
		int z = 7;
		z++;
		z++;
		++z;
		z--;
		int w = z + 10;
		System.out.println(++z);
		
		System.out.println("==============");
		
		int q = 5;
		q = q + 1;
		q++;
		q--;
		q *= 2; //12
		int r = q + 10; // r= 22
		r = q++; // r= 22 q=13
		System.out.println(++q); // q = 14
		
		System.out.println("===============");
		
		int a = 10;
		int b = 15;
		
		System.out.println(++a + " " + b++); //the reason result is 15 for b because Java prints it first and then increment it
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("=================");
		
		int num1 = 5;
		int num2 = 6;
		int num3 = ++num1 - num2++ + num1++;
		System.out.println(num3); //result is 6 because the first part num1 is incremented by 1
		// which becomes 6 and then num2 is not incrementing before printing and last num1 takes the 
		// value of initial num1 which is 6 therefore 6-6+6 = 6
		
		System.out.println("=============");
		
		// Escape Sequence
		
		System.out.println("\tI shouted, \"Go away!\" as I ran towards the wolf.\n\tIt bared its teeth to me in reply.");
		
		System.out.println("-----------------");
		
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		
		System.out.println("==============");
		
		int temp1 = 10;
		System.out.println(temp1 + 1);//number is added to temp1 just for printing. it is not actually added to temp1.
		System.out.println(temp1++);
		System.out.println(temp1);
		
		System.out.println("==============");
		
		int m=11, n=22, p;
        
        p = m + n + m++ + n++ + ++m + ++n;
         
        System.out.println("a="+m); // 13
        System.out.println("b="+n); // 24 
        System.out.println("c="+p); // 103
        
        /*
         Given, m=11, n=22
		 p = m + n + m++ + n++ + ++m + ++n
		 p = 11 + 22 + (m is used before increment) + (n is used before increment) + (m is used after increment) + (n is used after increment)
		 p = 11 + 22 + 11(m=12, n=22) + 22(m=12, n=23) + 13(m=13, n=23) + 24(m=13, n=24)
		 p = 11 + 22 + 11 + 22 + 13 + 24 = 103 and m=13, n=24 
        */
		
		int num4 = 10;
		num4++;
		num4 = num4++ - --num4;// read from left to right num4++ = 11 because it is post increment and then when 
		// it reaches the second num4 it becomes 12 but first decrement by one since it is pre-decrement therfore
		// 11 - 11 would be zero.
		System.out.println(num4 - 5);
		
		System.out.println("==============");
		
		int num5 = 21;
		num5 = num5++ + 10 - 2;// num5 = 29
		num5 *= ++num5; // is same as num5 = num5 * ++num5 so 29 * 30 = 870
		System.out.println(num5);
		
		int num11 = 19;
		int num12 = num11 + 58; // num12 = 77
		num11 = num12; // num11 = 77
		num12 = ++num11 + 10 - 5; // num12 = 83, num11=78
		num11 = num11 + 1; // num11= 79
		System.out.println(num11);
		System.out.println(num12);
		
		System.out.println("***********");
				 
		int num13 = 10;
		num13++;
		int j = 5;
		int h = 6;
		int c = ++j - h++ + j++; // c= 6(j=6) - 6 (h=7) + 6 (j=7) = 6
		System.out.println(c);
		System.out.println(j);
		System.out.println(h);
		System.out.println("---------------------------");
		
		// Selection in Java
		double grade = 75;

		if (grade >= 90) {
			System.out.println("Your grade is " + "A");
		} else if (grade >= 80) {
			System.out.println("Your grade is " + "B");
		} else if (grade >= 70) {
			System.out.println("Your grade is " + "C");
		} else if (grade >= 60) {
			System.out.println("Your grade is " + "D");
		} else {
			System.out.println("You Failed. Sorry!");
		}
		
		double grade2 = 62;

		if (grade2 >= 95) {
			System.out.println("Your grade is " + "A+");
		} else if (grade2 >= 90) {
			System.out.println("Your grade is " + "A-");
		} else if (grade2 >= 85) {
			System.out.println("Your grade is " + "B+");
		} else if (grade2 >= 80) {
			System.out.println("Your grade is " + "B-");
		}else if (grade2 >= 75) {
			System.out.println("Your grade is " + "C+");
		} else if (grade2 >= 70) {
			System.out.println("Your grade is " + "C-");
		} else if (grade2 >= 65) {
			System.out.println("Your grade is " + "D+");
		} else if (grade2 >= 60) {
			System.out.println("Your grade is " + "D-");
		} else {
			System.out.println("You Failed. Sorry!");
		}

	}
}		
			
	

