package day17_Encapsulation;

public class ItemRunner_8 {
	
	public static void main(String[] args) {
		Item_7 x = new Item_7("Chocolate", 15.99, 1531789924);

		System.out.println(x);

		x.name = "test item";
		System.out.println(x.name);
		x.price = 16.99;

		Item_7 y = new Item_7("RedBull", 2.99, 6514889);

		System.out.println("-----------");
		System.out.println(x);
		System.out.println(y);

		// The purpose of the main method is to run the code
		// in the constructor, you would not have the return type
	}

}
