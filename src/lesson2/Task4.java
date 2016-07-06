/**
 * 
 */
package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // method checks whether the
												// specified year is a leap year
		int year = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите год: ");
		year = scn.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // condition
																	// check on
																	// a leap
																	// year
			System.out.println("Данный год является високосным");
		} else {
			System.out.println("Данный год не является високосным");
		}
	}

}
