package streams;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class , when you enter a "start" keyboard , runs two streams carve with
 * syncing to the console a series of numbers from 1 to 100 portions of 10
 * numbers.
 * 
 * @author Yura
 */

public class TwoThreadsSynchronized extends Thread {
	public static void main(String[] args) throws InterruptedException {
		TwoThreadsSynchronized tTSOne = new TwoThreadsSynchronized();
		TwoThreadsSynchronized tTSTwo = new TwoThreadsSynchronized();
		tTSOne.setName("Thread 1:");
		tTSTwo.setName("Thread 2:");
		String choice = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("start - Start the application");
		System.out.println("q     - Exit the application");
		System.out.println("Make your choice by selecting a number, please !\n");
		while (choice != "q") {
			try {
				choice = scn.nextLine();
			} catch (InputMismatchException e) {
				scn.hasNext();
				choice = "";
			}
			switch (choice) {
			case ("start"):
				tTSOne.start();
				tTSTwo.start();
				break;
			case ("q"):
				System.out.println("Bye!");
				System.exit(0);
			default:
				System.out.println("Wrong choice!");
				break;
			}
		}
		scn.close();
	}
	@Override
	public void run() {
		int counter = 1;
		for (int i = 1; i <= 10; i++) {
			flowSplitter();
			System.out.print(Thread.currentThread().getName());
			for (int j = 1; j <= 10; j++) {
				System.out.print((counter++) + " ");
			}
			System.out.println();
			releaseThis();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
	private boolean occupied;
	synchronized void flowSplitter() {
		while (occupied) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		occupied = true;
	}
	private synchronized void releaseThis() {
		occupied = false;
		notifyAll();
	}
}
