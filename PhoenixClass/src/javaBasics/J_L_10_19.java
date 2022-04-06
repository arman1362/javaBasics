package javaBasics;

import java.text.NumberFormat;

public class J_L_10_19 {

	public static void main(String[] args) {

		// with "new" keyword in Java, we can create an object

		int[] num = new int[6];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;

		for (int i = 0; i < num.length; i++)
			System.out.print(num[i] + ", ");

		System.out.println("\n------------");

		// or we can initialize the array like

		int[] num2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, 55, 66, 77 };

		System.out.println(num2.length);

		System.out.println("---------");
		for (int b = num2.length - 13; b <= num2.length - 1; b++) {
			System.out.print(num2[b] + ", ");
		}

		System.out.print("\n----------\n");

		// this data is coming from the UI
		int[] number = new int[6];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		number[5] = 6;

		// this table comes from the requirement

		int[] number2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, 55, 66, 77 };

		for (int a = 0; a < number.length; a++) {
			for (int b = 0; b < number2.length; b++) {
				if (number[a] == number2[b]) {
					System.out.println("Number1 Table: " + number[a] + " , " + "Number2 Table: " + number2[b]);
				}
			}
		}

		// vending machine exercise

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		String strCoke = "Coke";
		String strDietCoke = "Diet Coke";
		String strRedbullRegular = "Redbull Regular";
		String strRedbullSugarFree = "Redbull Sugar Free";
		String strCoffeeRegular = "Coffee Regular";
		String strCofeeDecafe = "Coffee Decafe";
		String strWater = "Water";

		double cokePrice = 2;
		double dietCokePrice = 2;
		double redbullRegularPrice = 3;
		double redbullSugarFreePrice = 3;
		double coffeeRegularPrice = 2.5;
		double coffeeDecafePrice = 2.5;
		double waterPrice = 1;

		double taxRate = 0.05;

		String selectItem = "Water";
		int numOfItemsSelected = 10;

		System.out.println("-------------");

		switch (selectItem) {

		case "Coke":
			System.out.println("Item:             " + strCoke);

			int temp1 = 0;
			while (temp1 <= numOfItemsSelected) {
				temp1++;
			}
			numOfItemsSelected = temp1 - 1;
			System.out.println("Unit Price:       " + formatter.format(cokePrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double grossTotal = numOfItemsSelected * cokePrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * cokePrice));
			double cokeTaxRate = grossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(cokeTaxRate));
			double cokeNetTotal = cokeTaxRate + grossTotal;
			System.out.println("Net Total:        " + formatter.format(cokeNetTotal));
			break;

		case "Diet Coke":
			System.out.println("Item:             " + strDietCoke);

			int temp2 = 0;
			while (temp2 <= numOfItemsSelected) {
				temp2++;
			}
			numOfItemsSelected = temp2 - 1;
			System.out.println("Unit Price:       " + formatter.format(dietCokePrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double dietCokeGrossTotal = numOfItemsSelected * dietCokePrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * dietCokePrice));
			double dietCokeTaxRate = dietCokeGrossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(dietCokeTaxRate));
			double dietCokeNetTotal = dietCokeTaxRate + dietCokeGrossTotal;
			System.out.println("Net Total:        " + formatter.format(dietCokeNetTotal));
			break;

		case "Redbull Regular":
			System.out.println("Item:             " + strRedbullRegular);

			int temp3 = 0;
			while (temp3 <= numOfItemsSelected) {
				temp3++;
			}
			numOfItemsSelected = temp3 - 1;
			System.out.println("Unit Price:       " + formatter.format(redbullRegularPrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double redbullRegularGrossTotal = numOfItemsSelected * redbullRegularPrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * redbullRegularPrice));
			double redbullRegularTaxRate = redbullRegularGrossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(redbullRegularTaxRate));
			double redbullRegularNetTotal = redbullRegularTaxRate + redbullRegularGrossTotal;
			System.out.println("Net Total:        " + formatter.format(redbullRegularNetTotal));
			break;

		case "Redbull Sugar Free":
			System.out.println("Item:             " + strRedbullSugarFree);

			int temp4 = 0;
			while (temp4 <= numOfItemsSelected) {
				temp4++;
			}
			numOfItemsSelected = temp4 - 1;
			System.out.println("Unit Price:       " + formatter.format(redbullSugarFreePrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double redbullSugarFreeGrossTotal = numOfItemsSelected * redbullSugarFreePrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * redbullSugarFreePrice));
			double redbullSugarFreeTaxRate = redbullSugarFreeGrossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(redbullSugarFreeTaxRate));
			double redbullSugarFreeNetTotal = redbullSugarFreeTaxRate + redbullSugarFreeGrossTotal;
			System.out.println("Net Total:        " + formatter.format(redbullSugarFreeNetTotal));
			break;

		case "Coffee Regular":
			System.out.println("Item:             " + strCoffeeRegular);

			int temp5 = 0;
			while (temp5 <= numOfItemsSelected) {
				temp5++;
			}
			numOfItemsSelected = temp5 - 1;
			System.out.println("Unit Price:       " + formatter.format(coffeeRegularPrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double coffeeRegularGrossTotal = numOfItemsSelected * coffeeRegularPrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * coffeeRegularPrice));
			double coffeeRegularTaxRate = coffeeRegularGrossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(coffeeRegularTaxRate));
			double coffeeRegularNetTotal = coffeeRegularTaxRate + coffeeRegularGrossTotal;
			System.out.println("Net Total:        " + formatter.format(coffeeRegularNetTotal));
			break;

		case "Coffee Decafe":
			System.out.println("Item:             " + strCofeeDecafe);

			int temp6 = 0;
			while (temp6 <= numOfItemsSelected) {
				temp6++;
			}
			numOfItemsSelected = temp6 - 1;
			System.out.println("Unit Price:       " + formatter.format(coffeeDecafePrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double coffeeDecafeGrossTotal = numOfItemsSelected * coffeeDecafePrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * coffeeDecafePrice));
			double coffeeDecafeTaxRate = coffeeDecafeGrossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(coffeeDecafeTaxRate));
			double coffeeDecafeNetTotal = coffeeDecafeTaxRate + coffeeDecafeGrossTotal;
			System.out.println("Net Total:        " + formatter.format(coffeeDecafeNetTotal));
			break;

		case "Water":
			System.out.println("Item:             " + strWater);

			int temp7 = 0;
			while (temp7 <= numOfItemsSelected) {
				temp7++;
			}
			numOfItemsSelected = temp7 - 1;
			System.out.println("Unit Price:       " + formatter.format(waterPrice));
			System.out.println("Quantity:         " + numOfItemsSelected);
			double waterGrossTotal = numOfItemsSelected * waterPrice;
			System.out.println("Gross Total:      " + formatter.format(numOfItemsSelected * waterPrice));
			double waterTaxRate = waterGrossTotal * taxRate;
			System.out.println("Tax:              " + formatter.format(waterTaxRate));
			double waterNetTotal = waterTaxRate + waterGrossTotal;
			System.out.println("Net Total:        " + formatter.format(waterNetTotal));
			break;
		}

		System.out.println("--------------");

		// solving with arrays

		String[] items = new String[7];

		items[0] = "Coke";
		items[1] = "Diet Coke";
		items[2] = "Redbull Regular";
		items[3] = "Redbull Sugar Free";
		items[4] = "Coffee Regular";
		items[5] = "Coffee Decafe";
		items[6] = "Water";

		double[] unitPrice = new double[7];
		unitPrice[0] = 2;
		unitPrice[1] = 2;
		unitPrice[2] = 3;
		unitPrice[3] = 3;
		unitPrice[4] = 2.5;
		unitPrice[5] = 2.5;
		unitPrice[6] = 1;

		int[] noOfItemsSelected = new int[7];
		noOfItemsSelected[0] = 0;
		noOfItemsSelected[1] = 0;
		noOfItemsSelected[2] = 0;
		noOfItemsSelected[3] = 0;
		noOfItemsSelected[4] = 0;
		noOfItemsSelected[5] = 10;
		noOfItemsSelected[6] = 4;

		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length; j++) {
				if (items[i].equalsIgnoreCase(items[j])) {
					System.out.println("Item:     " + items[j]);
				}
			}
		}

		System.out.println("--------------");

		System.out.println("Item:         " + items[6]);
		System.out.println("Quantity:     " + noOfItemsSelected[6]);
		System.out.println("Unit Price:   " + formatter.format(unitPrice[6]));
		double grossTotal = noOfItemsSelected[6] * unitPrice[6];
		System.out.println("Gross Total:  " + formatter.format(grossTotal));
		double tax = taxRate * grossTotal;
		System.out.println("Tax:          " + formatter.format(tax));
		double netTotal = grossTotal + tax;
		System.out.println("Net Total:    " + formatter.format(netTotal));

	}
}
