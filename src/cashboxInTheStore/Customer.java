package cashboxInTheStore;

/**
 * class defines the buyer
 * 
 * @author Yura
 */

import java.util.Random;

public class Customer {
	private int customerNumber;
	private String product;
	private static int milk = 0;
	private static int bread = 0;
	private static int meat = 0;
	private static Random random = new Random();

	Customer() {
	}

	public String getProduct() {
		switch (random.nextInt(3) + 1) {
		case 1:
			product = "Milk";
			milk++;
			break;
		case 2:
			product = "Bread";
			bread++;
			break;
		case 3:
			product = "Meat";
			meat++;
			break;
		}
		return product;
	}

	Customer(int num) {
		customerNumber = num;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int getMilk() {
		return milk;
	}

	public int getBread() {
		return bread;
	}

	public int getMeat() {
		return meat;
	}
}