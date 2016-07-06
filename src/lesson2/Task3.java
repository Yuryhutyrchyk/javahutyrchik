/**
 * 
 */
package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main method calculates the value
												// of the division of two
												// numbers
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		double result = 0;
		String strResult = "";
		System.out.println("¬ведите первое число: ");
		num1 = scn.nextInt(); // entering data in the first variable
		System.out.println("¬ведите второе число: ");
		num2 = scn.nextInt(); // entering data into the second variable
		while (num2 == 0) { // zero divisor exception
			System.out.println("ƒелитель не должен быть равен нулю!");
			System.out.println("¬ведите делитель: ");
			num2 = scn.nextInt();
			if (num2 > 0)
				break;
		}
		result = (double) num1 / num2; // calculation of values
		strResult = result + "";
		if (result % 1 == 0) {
			strResult = strResult.replace(".0", ""); // formatting of the
														// displayed integer
		}
		System.out.print("„астное двух чисел: \n");
		System.out.println(num1 + " : " + num2 + " = " + strResult); // The
																		// result
																		// is
																		// displayed
																		// on
																		// the
																		// screen
	}
}
