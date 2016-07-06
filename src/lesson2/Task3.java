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
		System.out.println("������� ������ �����: ");
		num1 = scn.nextInt(); // entering data in the first variable
		System.out.println("������� ������ �����: ");
		num2 = scn.nextInt(); // entering data into the second variable
		while (num2 == 0) { // zero divisor exception
			System.out.println("�������� �� ������ ���� ����� ����!");
			System.out.println("������� ��������: ");
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
		System.out.print("������� ���� �����: \n");
		System.out.println(num1 + " : " + num2 + " = " + strResult); // The
																		// result
																		// is
																		// displayed
																		// on
																		// the
																		// screen
	}
}
