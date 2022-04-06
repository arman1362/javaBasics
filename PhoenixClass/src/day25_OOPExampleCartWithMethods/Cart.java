package day25_OOPExampleCartWithMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	private ArrayList<Item> items;

	private double salesTaxPercent = 7.5 / 100; // or 0.075

	Scanner sc = new Scanner(System.in);

	public Cart() {
		super();
		this.items = new ArrayList<>();
	}

	// Requirements:
	// add items to the cart
	public void addItem(Item item) {
		items.add(item);
		System.out.println("Item added to the cart!");
	}

	// remove items from the cart
	public boolean removeItem(Item item) {
		System.out.println(" ***** Remove Item  - Please select an option: ");
		printCart();

		int selection = 0;
		while (!sc.hasNextInt()) {
			selection = sc.nextInt();
			if (validOption(selection)) {
				break;
			}
		}

		items.remove(selection - 1);
		return true;
	}

	// checkout the cart
	public void checkOut() {
		System.out.println("************ Checking Out ***********");
		printCart();
		double sum = 0;
		for (int i = 0; i < items.size(); i++) {
			sum += items.get(i).getQuantity() * items.get(i).getPrice();
		}

		System.out.println("-------------");
		System.out.println("Total --------------- $" + sum);
		System.out.println(" Tax ---------------- $" + sum * salesTaxPercent);
		System.out.println("Total After Tax ----- $" + (sum - (sum * salesTaxPercent)));
		System.out.println(" ---------------------");
		System.out.println("Thank you for your business!");
	}

	// clear the cart
	public boolean clearCart() {
		if (items.size() < 1) {
			System.out.println("You have no items in the cart");
			return false;
		}
		System.out.println("Items in the cart will be removed? are you sure you want to do that");
		System.out.println("1, Yes");
		System.out.println("2, No");
		int sel = sc.nextInt();
		if (sel == 1) {
			items.clear();
			System.out.println("Items removed!");
			return true;
		} else if (sel == 2) {
			System.out.println(" We wont touch the items in your cart!");

		}
		return false;
	}

	// change the quantity
	// print the cart
	public void printCart() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + ", " + items.get(i));
		}
	}

	// validate entry is ok
	public boolean validOption(int sel) { // validate the entry is following what we asked for
		if (sel == 0) {
			return false;
		}

		if (!(sel >= 1 && sel <= items.size())) {// the selection is not in the range of ints
			return false;
		}
		return true; // none of the returns above was executed, so we got here.
	}

	@Override
	public String toString() {
		String res = "************* Customer Cart **************\n";
		for (int i = 0; i < items.size(); i++) {
			res += items.get(i).toString() + "\n";
		}
		res += " *******************************\n";
		return res;
	}
}
