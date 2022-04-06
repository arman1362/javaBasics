package day17_Encapsulation;

import java.util.ArrayList;

public class BookRunner_2 {

	public static void main(String[] args) {
		Book_1 obj2 = new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2005, "as5452542");	
		
		ArrayList<Book_1> library = new ArrayList<Book_1> ();
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2005, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2006, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2007, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2008, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2009, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2010, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2011, "as5452542"));
		library.add(new Book_1 ("JK Rowling", "HP and the Azkaban Prisoner", 2012, "as5452542"));
		
		System.out.println(obj2);
		
		for (Book_1 b : library) {
		System.out.println(b);
	}
}
}