package cashboxInTheStore;

/**
 * Program that simulates cash in the store. There are several banks, working
 * simultaneously . Each buyer - a separate thread . The total number of customers
 * can be more than the amount of funds , but at the same time can not be processed
 * more buyers than there are working desks . Each customer has a set of products
 * that must be removed during service.
 * 
 *@author Yura
 */

import java.util.concurrent.ConcurrentLinkedQueue;

public class MainClassCashbox {

	private static ConcurrentLinkedQueue<Customer> queue = new ConcurrentLinkedQueue<Customer>();

	public static void main(String[] args) {

		// specifies the number of banks ( the client processing threads )
		int totalCashbox = 3;
		// specifies the number of customers
		int totalCustomer = 20;
		System.out.println("Cashbox №   |" + " Customer №  |" + " Products ");

		// Randomly fills all customers with their numbering
		for (int j = 1; j <= totalCustomer; j++) {
			if (j == 5) {
				// It connects new cashbox after it was typed 5 customers
				// Transfers to the general waiting list
				for (int i = 1; i <= totalCashbox; i++) {
					new Cashbox(i, queue);
				}
			}
			queue.add(customer(j));
		}
	}

	// creates a new customer
	public static Customer customer(int num) {
		return new Customer(num);
	}
}
