package javaBasics;

public class Updated_ConvertChar2ASCIINumbers {

	public static void main(String[] args) {
		// Converting char to ASCII numbers
		
				int asciiValue2 = 97;
				for (int i = asciiValue2; i <= 122; i++) {
					String convertedChar2 = Character.toString ((char)(i));
					System.out.println(i + " => " + convertedChar2);
					}
				
				System.out.println("================");
				
				int asciiValue3 = 65;
				for (int i = asciiValue3; i <= 90; i++) {
					String convertedChar3 = Character.toString ((char)(i));
					System.out.println(i + " => " + convertedChar3);
					}
				
				System.out.println("==================");
					
				char charA = 'A';
				System.out.println(charA);
				
				char ch = 'k';
				int convertedNum = (int) ch; 
				System.out.println(convertedNum);
				
				int chNum = 90;
				char convertedChar = (char) chNum;
				System.out.println("convertedChar = " + convertedChar);
	}

}
