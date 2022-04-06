package PhoenixReview;

import java.util.Random;
import java.util.Scanner;

public class ReviewSession12072021 {

	public static void main(String[] args) {

		String name = "Arman";
		String name1 = "ARMAN";

		System.out.println(name.contains("Ar"));

		System.out.println("----------------");

		boolean equals = name.equalsIgnoreCase(name1);
		System.out.println(equals);

		int length = name.length();
		System.out.println(length);

		String name2 = "School";
		String replace = name2.replace("c", "b");
		System.out.println(replace);

		String email = "ahussaini@gmail.com 2023409221";
		String replaceAll = email.replaceAll("[0-9]", "");
		System.out.println(replaceAll);

		String add = "                Kabul Afg     ";
		System.out.println("Before Trim " + add);
		String trim = add.trim();
		System.out.println(trim);

		System.out.println("----------------");

		String schoolName = "Tek School Of America Add:";

		CharSequence subSequence = schoolName.subSequence(0, 21);
		System.out.println(subSequence);

		String str = "The best of both worlds";
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count);

		int age = 20;
		if (age > 18)
			System.out.println("Age is greater than 18");
		else
			System.out.println("Age mus be greater than 18");

		System.out.println("-----------------");

		String name4 = "Daud";
		String name5 = new String("Daud");
		if (name4 == name5)
			System.out.println("Two names are equal");
		else
			System.out.println("Two names are not the same");

		System.out.println(name4 == name5);

		System.out.println(name4.equals(name5));

		if (name4.equals(name5))
			System.out.println("Two names are equal");
		else
			System.out.println("Two names are not the same");

		System.out.println("---------------");

		// Rock-Paper-Scissors Game

//		System.out.println("Will it be rock, paper, or scissors");
//
//		String clientGesture = null;
//		String devGuesture = "rock";
//		String outcome = "Error";
//
//		Scanner scan = new Scanner(System.in);
//		clientGesture = scan.nextLine();
//		switch (clientGesture) {
//		case "rock":
//			outcome = "tie";
//			break;
//		case "paper":
//			outcome = "win";
//			break;
//		case "scissors":
//			outcome = "loss";
//			break;
//		}
//		System.out.println(outcome);

		// for loop is for the fixed iteration like 10 or 20 times
		// while loop; for example for user to enter the password and guess so it is not
		// fixed in size
		// do while; run for one time and then

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "  print this text");
		}
		
		System.out.println("************");
		
		int num, range;
		num = 5;
		range = 10;
		for (int t = 1; t <= range; t++) {
			System.out.println(num + " X " + t + " = " + num * t);
		}
		
		Scanner sc = new Scanner (System.in);
		String input = "";
		while (!input.equals("quite")) {
			input = sc.nextLine();
			System.out.println(input);
		}
	}
}
