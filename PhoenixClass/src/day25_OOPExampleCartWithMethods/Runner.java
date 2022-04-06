package day25_OOPExampleCartWithMethods;

public class Runner {

	public static void main(String[] args) {
		
		Customer jack = new Customer ("Jack", "Davidson", 28, 2023409221);
		
		jack.getCart().addItem (new Item ("Redbull", 2.99, 10));
		
		System.out.println(jack.getCart());
		
		Store st1 = new Store ("Store1", "Somewhere in USA");
		st1.addItems(new Item ("Redbull", 2.99, 500 ));
		st1.addItems(new Item ("Water", 3.99, 1000 ));
	}
}
