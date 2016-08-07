package carParking;

import java.util.concurrent.Semaphore;

public class Car implements Runnable {
	String name;
	Semaphore semaphore;

	Car(String name, Semaphore semaphore) {
		this.name = name;
		this.semaphore = semaphore;
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			if (semaphore.availablePermits() == 0) {
				System.out.println(name +" - "+ "waiting for parking");
			}
			if (!semaphore.hasQueuedThreads()) {
				semaphore.acquire();
				System.out.println(name +" - "+ "the car is parked");
				Thread.sleep(800);
				System.out.println(name +" - "+ "car left the parking lot");
				semaphore.release();

			} else {
				System.out.println(name + " - "+"car went to another parking");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}