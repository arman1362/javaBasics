package javaBasics;

public class Updated_ShortcutOperators {

	public static void main(String[] args) {
		
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
	}

}
