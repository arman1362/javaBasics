package javaBasics;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "Arman";
		String str2 = " Hussaini";
		
		System.out.println(str.charAt(1));
		System.out.println(str.compareTo(str2));
		System.out.println(str.concat(str2));
		System.out.println(str.contains("Ar"));
		System.out.println(str.indexOf(str2));
		System.out.println(str.length());
		System.out.println(str.substring(1, 4));
	}

}
