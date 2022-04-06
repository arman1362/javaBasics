package day19_20_GetterSetterStackHeapt;

public class BankAccount {

	private int accountNumber;
	private String firstName;
	private String lastName;
	private String dob;
	private double balance;

	public BankAccount() {
		accountNumber = 0;
		firstName = "";
		lastName = "";
		dob = "";
		balance = 0.0;
	}

	public BankAccount(int accountNumber, String firstName, String lastName, String dob) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDOB() {
		return dob;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public double getBalance() {
		return balance;
	}

	// making the deposit method
	// this is a custom method based on the requirement
	// it will return the new balance
	// it will add the amount to the customer account balance

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	// returning the balance after money withdrawal
	// this method will deduct the amount given by the method from the balance

	public double withdraw(double amount) {
		if (amount > balance) {
			// customer is asking for too much money!
			System.out.println("You actually Don't have that much money with us!");
			System.out.println("Withdraw Failed!");
			return balance;
		} else {
			balance = balance - amount;
			System.out.println("Withdraw of $" + amount + " is done successfully!");
			return balance;
		}
	}
	
	// Stack and Heap
	// https://www.youtube.com/watch?v=uwV0hotRrLw
	// The reference cell that we get comes from the heap which will be resolved by toString method
	// Stack is used for static memory allocation and Heap for dynamic memory allocation, both stored in the computer's RAM .
	// Stack process data in LIFO method
	// primitive will go to the stack. actual value of reference data type will go to the heap and its reference goes to the stack..

	// String Static Pool in Heap helps to avoid inserting duplicate text in memory
	// Equality operator " = = " . use the equality operator with the primitive not with reference data types. it actually compares the cell references. 
	// Instead of equality operator with reference data type use equals method. equals compares the contents of string charracyter by character like t e s t.
	// like String z = "test"; and String x = "test"; both are in String Static Pool so have the same reference e.g. @100
	
	public static void main (String [] args) {
	String x = "test"; // first time creating "test" in String Static Pool so assigning a reference e.g @100 in stack
	String y = "test"; // not duplicating the "test" so reflecting the same reference number in stack e.g @100
	String z = new String ("test"); // the constructor ask for creating a new String out of String Static Pool hence the reference cell for it will be different e.g. @200
	System.out.print(x == z); // false becuase different reference numbers @100 != @200
	System.out.print(x == y); // true because same reference number @100 = @100
	System.out.println(z.equals(x)); //true because it checks the contents of String char by char although reference numbers are different test = test
	
	
	}
}


