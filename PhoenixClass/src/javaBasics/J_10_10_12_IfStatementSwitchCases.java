 package javaBasics;

public class J_10_10_12_IfStatementSwitchCases {

	public static void main(String[] args) {
		// Selection can be done with if statements, conditional operators, and switch
		// cases

		// total < 100, 5% shipping and no discount
		// total >= 100, free shipping and 2% discount
		// total >= 300, free shipping and 5% discount
		// total >= 500, free expedited shipping and 7% discount
		// total > 1000, free expedited shipping and 10% discount

		double amount = 700;
		double shipping = 0;
		double discountAmount = 0;
		boolean expedited = false;

		if (amount < 100) {
			// add 5% for shipping and 0 for discount
			shipping = amount * 0.05;
			discountAmount = 0;
		} else if (amount >= 100 && amount < 300) {
			// free shipping and 2% discount
			shipping = 0;
			discountAmount = amount * 0.02;
		} else if (amount >= 300 && amount < 500) {
			// free shipping and 5% discount
			shipping = 0;
			discountAmount = amount * 0.05;
		} else if (amount >= 500 && amount < 1000) {
			// free expedited shipping and 7% discount
			shipping = 0;
			discountAmount = amount * 0.07;
			expedited = true;
		} else {
			// free expedited shipping and 10% discount
			shipping = 0;
			discountAmount = amount * 0.1;
			expedited = true;
		}
 
		System.out.println("================");
		System.out.println("Amount:\t\t\t$" + amount);
		System.out.println("shipping\t\t$" + shipping);
		if (expedited == true) {
			System.out.println("Expedited Shipping:     Yes!");
		} else {
			System.out.println("Standard Shipping:      Yes!");
		
		}
		System.out.println("Discount Amount:\t$" + discountAmount);
		System.out.println("Total Amount:\t\t$" + (amount + shipping - discountAmount));
		System.out.println("================");

		// Nested if /else
		int averageGrade = 90;
		if (averageGrade >= 90) {
			System.out.print("You got an A");
			if (averageGrade >= 97) {
				System.out.println("+");
			} else if (averageGrade <= 92) {
				System.out.println("-");
			}
		}

		// Dangling else is having two elses at the statement

		// Conditional Operators
		// Format: (condition) ? expression1 : expression2
		// Format: (condition) ? trueValue : falseValue

		int x = 20;
		int y = 15;
		System.out.println(x > y ? "X is Bigger" : "Y is Bigger");

		System.out.println("---------------------------");

		int number4 = 9;
		int answer = number4 <= 2 ? 20 : number4 <= 4 ? 40 : number4 <= 6 ? 60 : number4 <= 8 ? 80 : 100;
		System.out.println(answer);

		System.out.println("---------------------------------");

		if (x > y) {
			System.out.println("X is Bigger");
		} else {
			System.out.println("Y is Bigger");
		}

		boolean z1 = x > y ? true : false;
		System.out.println(z1);

		int w = x > y ? 100 : 200;
		System.out.println(w);

		System.out.println("-----------------------");

		int age = 65;
		double bill = 15.65;
		double total;
		double tax;

		System.out.println(bill *= (age >= 65) ? 0.9 : 10);

		// alternative solution

		System.out.println("--------------------");

		if (age >= 65) {
			System.out.println("Senior Discount");
			bill *= 0.9;
			tax = bill * 0.08;
			total = bill + tax;

		} else {
			System.out.println("Regular Rate!");
			tax = bill * 0.08;
			total = bill + tax;
		}
		System.out.println(total);

		System.out.println("--------------------");

		int z = (x > y) ? x - y : x + y;
		int grade;
		grade = 55;
		String s = "Student is ";

		System.out.println(s += grade >= 60 ? "Passing!" : "Failing!");
		
		System.out.println("----------------------");

		// alternative solution
		if (grade >= 60) {
			System.out.println(s + "Passing!");
		} else {
			System.out.println(s + "Failing!");
		}
		
		System.out.println();
		System.out.println("----------------------");

		int a = 6;
		int b = 5;
		System.out.println((a < b) ? ++a : b++);
		System.out.println(b);

		// alternative solution
		if (a < b) {
			System.out.println(++a);
		} else {
			System.out.println(b++);
		}

		System.out.println("==============");
		
		int grade1 = 95;
		System.out.println(grade1 > 95 && grade1 < 95? "A+" : "A-");
		System.out.println(grade1 >= 85 && grade1 < 90? "B+" : "B-");
		System.out.println(grade1 >=  75 && grade1 < 80? "C+" : "C-");
		System.out.println(grade1 >= 65 && grade1 < 70? "D" : "Fail");
		
		System.out.println("===================");

		// Switch cases
		/*
		in switch cases, we compare the key to the case expressions,
		as soon as we find a match, we start running the statements from there
		we only stop if we either see a break or end of the switch
		You can't have relational operators with switch cases
		
		the break in switch case means 0
		like if we insert break then Java will not see the code above the break so 01
		at the end of the switch case there can be default statements which is like else and optional
		with if statement we can't run two blocks at the same time but with switch cases we can run multiple cases
		switch only works with byte , short , char , and int primitive data types as well as String 
		*/
		
		String DaysOfWeek = "Thursday";

		switch (DaysOfWeek) {

		case "Saturday ":
			System.out.println("Go Bison!");

		case "Sunday ":
			System.out.println("No classes today!");
			break;
			
		case "Friday":
			System.out.println("TGIF!");
			
		case "Wednesday":
			
		case "Monday":
			System.out.println("160 lecture today!");
			break;
			
		case "Tuesday":

		case "Thursday":
			System.out.println("160 lab today!");
			break;
			
		default: 
			System.out.println("Error: Invalid Day");
		}

		System.out.println("======================");

		int numberOfdayOfTheWeek = 6; // 1=mon --> 7=sun

		switch (numberOfdayOfTheWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wendsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
		}

		System.out.println("-------------------");

		String PhoneChargeStatus = "Low Charge";

		switch (PhoneChargeStatus) {
		case "Full Charge":
			System.out.println("Unplug the Charger");
		case "Sufficient Charge":
			System.out.println("Unplug the Charger");
		case "Low Charge":
			System.out.println("plug the Charger");
		}

		System.out.println("-------------------");

		String Tasks = "Second Quarer of the month";
		switch (Tasks) {
		case "First Quarter of the month":
			System.out.println("Planning and Analysing");
		case "Second Quarer of the month":
			System.out.println("Reporting");
		}
		
		System.out.println("---------------------");
		
		String task = "Task 1";
		System.out.println("Tasks left to do: ");
		switch (task) {
		case "Task 1":
			System.out.println("Task 1");
			break;
		case "Task 2":
			System.out.println("Task 2");
			break;
		case "Task 3":
			System.out.println("Task 3");
		}
		
		System.out.println("=============");
		
		// Alternative with if statement that is not encouraged because switch case in this case makes more sense
		System.out.println("Tasks left to do: ");
		if (task.equals("Task 1")) {
			System.out.println("Task 1");
		} else if (task.equals("Task 2")) {
			System.out.println("Task 2");
		} else 
			System.out.println("Task 3");
		{
			
		char c = 'D';
		switch (c) {
		case 'A':
			System.out.print("1");
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.print("2");
		case 'B':
		case 'C':
		case 'D':
			System.out.print("3"); // notice there is no ln so it does not move to the next line
		break;
		case 'M':
			System.out.print("4"); // it runs until it see a break or it reaches the end of the line so result 34
		}
		
		System.out.println("-------------------");
	
		// use switch or if statements or conditional operators
		
		// we have 3 types of accounts, checking, saving, credit
		// if checking and amount is not more than 500, print "Transaction OK"
		// if saving with any amount, print "You can not directly withdraw from saving"
		// if credit, and amount is less than 1000, print "Transaction OK"
		// also, if amount > 500 print "Confirmation message sent!"

		String type = "";
		double amount1 = 600;

		switch (type) {
		case "checking":
			System.out.println(amount1 < 500 ? "Transaction Ok!" : "");
			break;

		case "saving":
			System.out.println("You cant not directly withdraw from Saving");
			break;

		case "credit":
			if (amount1 < 1000) {
				System.out.println("Transaction OK!");
			}
			if (amount1 > 500) {

				System.out.println("Confirmation Message Sent");
			}
			break;
		}

		System.out.println("--------------------");
		}
		}
}