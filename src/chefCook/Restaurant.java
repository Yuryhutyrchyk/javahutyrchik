package chefCook;

/**
 * The class creates by default named chef who proposes to make a choice from the menu
 * 
 * @author Yura
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		Chef chef = new Chef();
		System.out.println("Hi! My name is " + chef.getName() + ".\n" + "What do you want to cook today?\n");
		int choice = -1;
		Scanner scn = new Scanner(System.in);
		while (choice != 0) {
			System.out.println("Menu:");
			System.out.println("1. Prepare salad - Vinaigrette");
			System.out.println("2. Prepare salad - Spring");
			System.out.println("3. Prepare french fries");
			System.out.println("0. Exit");
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
				chef.makeVinaigrette();
				break;
			case (2):
				chef.makeSpring();
				break;
			case (3):
				chef.fryPotato();
				break;
			case (0):
				System.out.println("Bye!");
				System.exit(0);
				break;
			default:
				break;
			}
		}
		scn.close();
	}
}
