package day17_Encapsulation;

import java.util.ArrayList;

public class Device_3 {

	String ownerName;
	String model;
	int yearBuilt;
	String condition;
	ArrayList<String> listOfApps;

	// Default Constructor
	public Device_3() {
		ownerName = "";
		model = "";
		yearBuilt = 0;
		condition = "";
		listOfApps = new ArrayList<String>();
	}

	// Parameterized constructor
	public Device_3 (String newOwnerName, String newModel, int newYearBuilt, String newCondition,
			ArrayList<String> newListApps) {
		this.ownerName = ownerName;
		this.model = model;
		this.yearBuilt = yearBuilt;
		this.condition = condition;
		this.listOfApps = listOfApps;
	}

	@Override
	public String toString() {
		return "Device [ownerName=" + ownerName + ", model=" + model + ", yearBuilt=" + yearBuilt + ", condition="
				+ condition + ", listOfApps=" + listOfApps + "]";
	}
	
	

}
