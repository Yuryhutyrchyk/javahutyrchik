/**
 * 
 */
package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Method for the entered number
												// indicates the day of the week
		int weekDay = 0;
		do { // The cycle is completed only after entering the correct values
			Scanner scn = new Scanner(System.in);
			System.out.println("������� ���� ������ ������: ");
			if (scn.hasNextInt()) { // Returns true if the number can be read
									// from the input stream
				weekDay = scn.nextInt(); // reads an integer value from the
											// input stream and stored in the
											// variable
				switch (weekDay) {
				case 1:
					System.out.println("�����������");
					break;
				case 2:
					System.out.println("�������");
					break;
				case 3:
					System.out.println("�����");
					break;
				case 4:
					System.out.println("�������");
					break;
				case 5:
					System.out.println("�������");
					break;
				case 6:
					System.out.println("�������");
					break;
				case 7:
					System.out.println("�����������");
					break;
				default:
					System.out.println("������� ����� � ��������� �� 1 �� 7: ");
				}
			}
		} while (weekDay < 1 || weekDay > 7);
	}
}
