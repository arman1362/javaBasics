package day19_20_GetterSetterStackHeapt;

public class BankAccounRunner {

	public static void main(String[] args) {

		BankAccount customer1 = new BankAccount(12345, "Jack", "Label", "10/01/1990");

		System.out.println(customer1.getAccountNumber());

		customer1.setAccountNumber(54321);

		System.out.println(customer1.getAccountNumber());

		customer1.setLastName("Hussaini");

		System.out.println(customer1.getLastName());
		
		System.out.println(customer1.getBalance());
		
		customer1.deposit (199.95);
		customer1.deposit (10);
		System.out.println(customer1.getBalance());
		customer1.withdraw (50);
		customer1.withdraw(500);
		System.out.println(customer1.getBalance());
	}

}
