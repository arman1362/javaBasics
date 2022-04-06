package day17_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Book_1 {

	// keyword "This" refer to the variables out of the current scope
	// or in other word, to the variables in the body of the class
	
	// things to think about when designing the class

	// 1. creating the variables of the class

	String author;
	String title;
	int publishYear;
	String iSBN;

	// 2. creating constructors for the class
	// 2.1 creating the default constructor

	public Book_1() {
		author = "";
		title = "";
		publishYear = 0;
		iSBN = "";
	}

	// 2.2 creating a parameterized constructor
	public Book_1(String author, String title, int publishYear, String iSBN) {
		this.author = author;
		this.title = title;
		this.publishYear = publishYear;
		this.iSBN = iSBN;
	}

	// method "toString" is a special method that comes with Java, and it will get ran
	// anytime that you print name of the object of the class
	// so you need to define this method for your class if you want the information to be
	// printed in the cases that you print the name of the object	
	// toString method is overridden so that the object values can be returned.
	
	// the way you can ensure your definition of toString method is valid
	// you will see a green arrow on the line number
	// use @ Override to see if your method is correct
	
	@Override
	public String toString() {
		return "Book [author= " + author + "\t" + "title= " + title + "\t" + "publishYear= " + publishYear + "\t" + "iSBN= " + iSBN + "]";
	}

		public static void main (String [] args) {
			int [] x = { 1, 2, 3, 4};
			System.out.println(Arrays.toString(x));
			
			ArrayList<String> y = new ArrayList<> ();
			y.add("test");
			y.add("text");
			y.add("toast");
			y.add("taste");
			System.out.println(y);
			
			Book_1 obj1 = new Book_1 ("Arman Hussaini", "My Life", 2022 , "29620ahsjkk");
			Book_1 obj2 = new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2005, "as5452542");
			System.out.println(obj1);
			System.out.println(obj2);
		 
		}
	}

