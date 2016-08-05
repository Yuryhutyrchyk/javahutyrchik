package cashboxInTheStore;

/**
 * class defines the cashbox
 * 
 * @author Yura
 */

import java.util.concurrent.ConcurrentLinkedQueue;

public class Cashbox implements Runnable {
	Thread thread;
	ConcurrentLinkedQueue<Customer> queueCustomer;
	StringBuilder cashTransaction;
	private String totalTransaction;
	private int totalMilk = 0;
	private int totalBread = 0;
	private int totalMeat = 0;

	Cashbox(int n, ConcurrentLinkedQueue<Customer> q) {
		queueCustomer = q;
		thread = new Thread(this, "Cashbox ".concat(Integer.toString(n)) + "   |");
		thread.start();
	}

	public void run() {
		// Method implements customer service
		int i = 0;
		while (true) {

			// The buyer gets from the queue
			try {
				Customer customer = queueCustomer.remove();
				cashTransaction = new StringBuilder();
				cashTransaction = cashTransaction.append(this.thread.getName()).append("   ");
				cashTransaction = cashTransaction.append(customer.getCustomerNumber()).append("        | ");
				cashTransaction = cashTransaction.append(customer.getProduct()).append("   ");
				totalTransaction = new String();
				totalMilk = (customer.getMilk());
				totalBread = (customer.getBread());
				totalMeat = (customer.getMeat());
				totalTransaction = ("Total sold: Milk-" + totalMilk + "ps | Bread-" + totalBread + "ps | Meat-"
						+ totalMeat + "ps");
				Thread.sleep(200);
				System.out.println(cashTransaction.toString());
				i++;
			} catch (Exception e) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("\n" + this.thread.getName() + "  served " + i + " customers\n" + totalTransaction);

				break;
			}
		}
	}
}