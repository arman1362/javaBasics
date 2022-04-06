package javaBasics;

public class Updated_SwitchCases {

	public static void main(String[] args) {
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

	// Alternative with if statement that is not encouraged because switch case in
	// this case makes more sense
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
		System.out.print("4"); // it runs until it see a break or it reaches the end of the line so
		// result 34
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
