package classTest;

import java.util.concurrent.Semaphore;

public class ProducerAndCustomer {
	int n;
	int b;

	static Semaphore consumer = new Semaphore(0);
	static Semaphore produser = new Semaphore(1);

	void get() {
		try {
			consumer.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		n = n - 1;
		System.out.println("Producer reduced resource: i = " + n);
		produser.release();
	}

	void put(int n) {
		try {
			produser.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}

		this.n = n;
		System.out.println("Step " + b + ":");
		System.out.println("Customer increased resource: i = " + n);
		consumer.release();
		b++;
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
}