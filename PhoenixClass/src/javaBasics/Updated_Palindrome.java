package javaBasics;

public class Updated_Palindrome {

	public static void main(String[] args) {
		System.out.println(palindrome("nadan"));
	}

	public static boolean palindrome(String str) {
		StringBuilder sb = new StringBuilder(str); // convert the string to String Builder. StrinBuilder is mutable
													// objects which can reverse themselves
		sb.reverse(); // reverse the StringBuilder
		return String.valueOf(sb).equals(str); // convert the StringBuilder back to String. String.valueOf convert the
												// result back to String
	}
}
