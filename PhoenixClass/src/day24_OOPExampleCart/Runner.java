 package day24_OOPExampleCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		// creating a list to store the items added to the cart
		ArrayList<Item> cart = new ArrayList<>();

		// list of items available

		ArrayList<Item> availableItems = new ArrayList<>();

		// we need to add some example items to the list to test the code with

		availableItems.add(new Item("Book    ", 19.99, 24));
		availableItems.add(new Item("Computer", 1700.89, 5));
		availableItems.add(new Item("Redbull ", 2.99, 558));
		availableItems.add(new Item("Pen     ", 5.99, 245));
		availableItems.add(new Item("Pencil  ", 3.99, 15));

		// create Scanner and the menu of options to choose from

		Scanner sc = new Scanner(System.in);

		// creating a flag with the name "checkout" to know if the user want to checkout
		// if checkout is slected, we have to stop asking the user to select an option
		// if checout is slected, print the cart

		boolean checkOut = false;
		while (checkOut == false) {
			// keep asking the user to add items to the cart

			// print the list of options
			System.out.println("Please choose one of the following items:");
			for (int i = 0; i < availableItems.size(); i++) {
				System.out.println((i + 1) + ", " + availableItems.get(i));
			}

			int checkOutLineNum = (availableItems.size() + 1);
			System.out.println(checkOutLineNum + ", CheckOut");

			int opt = sc.nextInt();

			// user selected the checkout option
			if (opt == checkOutLineNum) {
				checkOut = true; // set the flag for the loop to true
				// reduce the quantity available based on the items that we are checking out
				for (Item cartItem : cart) {
					// i on the first iteration is book
					// go through available items and find book

					for (Item availableItem : availableItems) {
						// check to see if the name of the item in the cart matches the item in the list
						if (cartItem.getName().equals(availableItem.getName())) {
							// change the quantity of the item
							// current quantity minus quantity that we are checking out
							availableItem.setQuantity(availableItem.getQuantity() - cartItem.getQuantity());
							break;
						}
					}
				}

				System.out.println("Checking Out");
				break; // stope and get out of the loop
				// we dont want to keep asking the user to select options anymore
			}
			System.out.print("Please enter the quantity: ");
			int qty = sc.nextInt();
			System.out.println("\n*\nItems added to the cart\n*\n");

			// adding item to the cart

			cart.add(new Item(availableItems.get(opt - 1).getName(), availableItems.get(opt - 1).getPrice(), qty));
		} // this is the end of the loop that slect the options to add to the cart

		// user selected checkout, lets do the following
		// print the cart

		System.out.println("*********************  Printing the cart ***********************");
		double grandTotal = 0;
		for (int i = 0; i < cart.size(); i++) {
			double sum = cart.get(i).getPrice() * cart.get(i).getQuantity();
			System.out.println((i + 1) + "," + cart.get(i) + " ---- $" + sum);
			grandTotal += sum;
		}

		System.out.println("-----------------");
		System.out.println("Grand Total \t\t\t $" + grandTotal);
		
		if (grandTotal > 500) {
			System.out.println("Discount \t\t\t $" + grandTotal * 0.05);
			System.out.println("Total amount after discount \t $" + (grandTotal - (grandTotal * 0.05)));
		}

		System.out.println("--------------------");
		for (int i = 0; i < availableItems.size(); i++) {
			System.out.println((i + 1) + ", " + availableItems.get(i));
		}
	}
}
