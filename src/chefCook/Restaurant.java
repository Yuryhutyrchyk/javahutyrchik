package chefCook;

/**
 * Chef creates with a default name , which invites us to select some items in the menu
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {
	// entry point in the program
	public static void main(String[] args) {
		Chef bob = new Chef();
		System.out.println("Hi! My name is " + bob.getName() + ".\n" + "What do you want to cook today?\n");
		int choice = -1;
		while (choice != 0) {
			System.out.println("Menu:");
			System.out.println("1. Prepare salad - Vinaigrette");
			System.out.println("2. Prepare salad - Spring");
			System.out.println("3. Prepare french fries");
			System.out.println("0. Exit");
			//disables the warning associated with the use of resources such as Closeable
			@SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
			System.out.println("Make your choice by selecting a number, please");
			try {
				choice = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong choice!");
				scn.next();
				choice = -1;
			}
			switch (choice) {
			case (1):
				bob.makeVinaigrette();
				break;
			case (2):
				bob.makeSpring();
				break;
			case (3):
				bob.fryPotato();
				break;
			case (0):
				System.out.println("Bye!");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
