package streams;

/**
 * class , when you enter a "start" keyboard , runs two streams carve without syncing
 * to the console a series of numbers from 1 to 100 portions of 10 numbers.
 * 
 * @author Yura
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class TwoThreads extends Thread {
	public static void main(String[] args) {
		TwoThreads twoThreadsOne = new TwoThreads();
		TwoThreads twoThreadsTwo = new TwoThreads();
		twoThreadsOne.setName("Thread 1:");
		twoThreadsTwo.setName("Thread 2:");
		String choice = "";
		Scanner scn = new Scanner(System.in);
		while (choice != "q") {
			System.out.println("start - Start the application");
			System.out.println("q     - Exit the application");
			System.out.println("Make your choice by selecting a number, please !\n");
			try {
				choice = scn.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Wrong choice!");
				scn.hasNext();
				choice = "";
			}
			switch (choice) {
			case ("start"):
				twoThreadsOne.start();
				twoThreadsTwo.start();
				break;
			case ("q"):
				System.out.println("Bye!");
				System.exit(0);
			default:
				break;
			}
		}
		scn.close();
	}
	@Override
	public void run() {
		int counter = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName());
			for (int j = 1; j <= 10; j++) {
				System.out.print((counter++) + " ");
			}
			System.out.println();
		}
	}
}
