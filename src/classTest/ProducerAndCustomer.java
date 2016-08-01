package classTest;

import java.util.concurrent.Semaphore;

public class ProducerAndCustomer {
	int n;
	int b;;

	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);

	void get() {
		try {
			semCon.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		n = n - 1;
		System.out.println("Producer reduced resource: i = " + n);
		semProd.release();
	}

	void put(int n) {
		try {
			semProd.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}

		this.n = n;
		System.out.println("Step " + b + ":");
		System.out.println("Customer increased resource: i = " + n);
		semCon.release();
	}
}

class Producer implements Runnable {
	ProducerAndCustomer ProducerAndCustomer;

	Producer(ProducerAndCustomer ProducerAndCustomer) {
		this.ProducerAndCustomer = ProducerAndCustomer;
		new Thread(this, "Producer").start();
	}

	public void run() {
		for (int i = 1;;)
			ProducerAndCustomer.put(i);
	}
}

class Customer implements Runnable {
	ProducerAndCustomer ProducerAndCustomer;

	Customer(ProducerAndCustomer ProducerAndCustomer) {
		this.ProducerAndCustomer = ProducerAndCustomer;
		new Thread(this, "Customer").start();
	}

	public void run() {
		for (int i = 0; i < 5; i++)
			ProducerAndCustomer.get();
	}

public static void main(String args[]) {
	ProducerAndCustomer ProducerAndCustomer = new ProducerAndCustomer();
	new Customer(ProducerAndCustomer);
	new Producer(ProducerAndCustomer);
	}
}