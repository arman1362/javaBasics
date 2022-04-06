package day17_Encapsulation;

public class Item_7 {

	String name;
	double price;
	int serialNumber;

	public Item_7(String name, double price, int serialNumber) {
		this.name = name;
		this.price = price;
		this.serialNumber = serialNumber;
	}

	public Item_7(String name, int serialNumber) {
		// initialize all of the variables of my class
	}

	@Override
	public String toString() {
		return "Item [ name: " + name + ", price: " + price + ", serialNumber: " + serialNumber + "]";
	}
}
