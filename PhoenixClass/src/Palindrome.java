
public class Palindrome {

	public static void main(String[] args) {

		String myNameIs = "Arman";
		
		System.out.println(myNameIs.charAt(0));
		
		String word = "rotator";

		System.out.println("Method1 " + word + " " + isPalindrome1(word));
		System.out.println("Method2 " + word + " " + isPalindrome2(word));
		System.out.println("Method3 " + word + " " + isPalindrome3(word));
	}

	public static boolean isPalindrome1(String str) { // boolean is the output of the method, String str is the input of the method
													  // word is the variable for str
		String rev = ""; // temporary string just for comparison
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return str.equals(rev);
	}

	public static boolean isPalindrome2(String str) {
		StringBuilder sb = new StringBuilder(str); 	// convert the string to String Builder. StrinBuilder is mutable objects which can reverse themselves
		sb.reverse(); 								// reverse the StringBuilder
		return String.valueOf(sb).equals(str); 		// convert the StringBuilder back to String. String.valueOf convert the result back to String
													// valueOf is a static method because we use String(name of the class . name of the method
	}

	public static boolean isPalindrome3(String str) { // StringBuffer is mutable which can reverse itself
		for (int f = 0, b = str.length() - 1; f < str.length(); f++, b--) {
			if (str.charAt(f) != str.charAt(b)) {
				return false;
			}
			if (f == b || f > b) {
				return true;
			}
		}
		return true;
	}
	
	
}
