/**
 * 
 */
package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // The main method compares two
												// numbers entered from the
												// keyboard
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������ ����� �����: ");
		if (sc.hasNextInt()) { // Returns true if the integer can be read from
								// the input stream
			num1 = sc.nextInt(); // reads an integer from the input stream and
									// store in a variable
		} else {
			System.out.println("�� ����� �� ����� �����"); // error message if
															// the user entered
															// is not an integer
		}
		System.out.print("������� ������ ����� �����: ");
		if (sc.hasNextInt()) { // Returns true if the integer can be read from
								// the input stream
			num2 = sc.nextInt(); // reads an integer from the input stream and
									// store in a variable
		} else {
			System.out.println("�� ����� �� ����� �����"); // error message if
															// the user entered
															// is not an integer
		}
		if (num1 > num2) {
			System.out.println("������ ����� ������ �������"); // One embodiment
																// of the
																// comparison
																// result of two
																// numbers
		}
		if (num1 < num2) {
			System.out.println("������ ����� ������ �������"); // One embodiment
																// of the
																// comparison
																// result of two
																// numbers
		}
		if (num1 == num2) {
			System.out.println("������ ����� ������ �������"); // One embodiment
																// of the
																// comparison
																// result of two
																// numbers
		}
	}
}
