package day28_30_AbstractionExamples;

public class CheckingAccount extends AccountGeneralMethods implements BankSystem, Person {// a class can inherit from one parent but can abstract from multiple parents
	double balance;

	@Override
	public boolean deposit(double amount) {
		if (amount > 0 && amount < 10000) {
			balance += amount;
			return true;
		}
		return false;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
}
