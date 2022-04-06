package PhoenixReview;

public class ReviewSession12062021 {

	public static void main(String[] args) {
		System.out.println("High Level Language");

		for (int i = 0; i < 10; i++) {
			System.out.print("\t" + i);
		}

		System.out.println();

		String a = "20";
		String b = "40";
		int a1 = Integer.parseInt(a); // converting String to integer
		int b1 = Integer.parseInt(b);

		System.out.println(a + b);
		System.out.println(a1 + b1);
		
		// Whats the code components?
		// 1- Statements // sysout
		// 2- blocks / for if methods
		// 3- comments
		// 4- whitespaces
		// 5- symbolic names
		
		System.out.println("---------------");
		
		// String class
		String name = "arman";
		String name1 = "Arman";
		int compName = name.compareTo(name1);
		System.out.println(compName);
		System.out.println(name.compareToIgnoreCase(name1));
		
		System.out.println("-----------------");
		
		String name4 = "Ali";
		String name5 = "ali";
		System.out.println(name4.compareTo(name5));
		System.out.println(name4.compareToIgnoreCase(name5));
		
		System.out.println("------------------");
		
		String name2 = "Arman";
		String name3 = " Hussaini";
		String concat = name2.concat(name3);
		System.out.println(concat);
		System.out.println(name2.concat(name3));
		
		// variable types;
		// 1- instance variable; declaration:inside of the class, outside of any method Access: we need to create an object of the class
		// 2- static variable; declaration: inside of the class, outside of any methods Access: access directly through variable and method name
		// 3- local variable; declaration: inside of the method Access: is accessible inside the method only
		
	}
	
	
}