package javaBasics;

public class Updated_Mutation {


		// immutable, when you change the value of the object, it will go and create a
		// new object in the heap and refret to that
		// mutable, when you change the value of the object, it will chnage the value of
		// the same location in the heap

		public static void main(String[] args) {
			String x = "test";
			x.replace('t', 'a'); // this will replace the characters but will change the cell reference but the
									// reference to x will not change
			x = x.replace('t', 'a'); // this way the new cell reference will be assigned to x.
			System.out.println(x);

			StringBuilder sb = new StringBuilder("test2");
			sb.replace(0, 2, "aa"); // this means start at 0 and stop at 2 which will include 0 and 1
			System.out.println(sb); // this will replace the original characters as it is StringBuilder and reflect
									// the new value under the same cell reference

			// String Builder is not thread-safe, StringBuffer is thread-safe
			// if we create a String for username and a String for Passowrd and make a loop
			// to iterate 0 times for each then we will have 10 usernames and 10 passwords
			// but if we do the same thing with StringBuilder, we will have only one
			// username and one password at the end. the reason is that StringBuilder
			// mutates (update) the value on each iteration but String only add more.
	}

}
