package day25_OOPExampleCartWithMethods;

import java.util.ArrayList;

public class Store {
	
	private String name;
	private String address;
	private ArrayList <Item> availableItems = new ArrayList<> ();
	
public Store () {
	super ();
	this.name = "";
	this.address = "";
	this.availableItems = new ArrayList<> ();
	
}

public Store (String name, String address) {
	this ();
	this.name = name;
	this.address = address;
}

// add items to the store
public void addItems (Item item) {
	availableItems.add(item);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public ArrayList<Item> getAvailableItems() {
	return availableItems;
}

public void setAvailableItems(ArrayList<Item> availableItems) {
	this.availableItems = availableItems;
}


}
