/**
 * 
 */
package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // The method calculates the
												// optimal weight and makes
												// recommendations
		int height = 0;
		int weight = 0;
		int weightOptim = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���� ����: ");
		height = scn.nextInt(); // data input by the user growth
		weightOptim = height - 100; // The calculation of the optimal weight
		System.out.println("������� ���� ���: ");
		weight = scn.nextInt(); // The input data for the actual weight of the
								// user
		if (weightOptim == weight) {
			System.out.println("��� ��� ������������� ������������"); // recommendation
																		// map
		}
		if (weightOptim > weight) {
			System.out.println("��� ���������� �����������"); // recommendation
																// map
		}
		if (weightOptim < weight) {
			System.out.println("��� ���������� ��������"); // recommendation map
		}
	}
}
