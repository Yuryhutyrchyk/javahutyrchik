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
			System.out.println("Введите день недели числом: ");
			if (scn.hasNextInt()) { // Returns true if the number can be read
									// from the input stream
				weekDay = scn.nextInt(); // reads an integer value from the
											// input stream and stored in the
											// variable
				switch (weekDay) {
				case 1:
					System.out.println("Понедельник");
					break;
				case 2:
					System.out.println("Вторник");
					break;
				case 3:
					System.out.println("Среда");
					break;
				case 4:
					System.out.println("Четверг");
					break;
				case 5:
					System.out.println("Пятница");
					break;
				case 6:
					System.out.println("Суббота");
					break;
				case 7:
					System.out.println("Воскресение");
					break;
				default:
					System.out.println("Введите число в диапазоне от 1 до 7: ");
				}
			}
		} while (weekDay < 1 || weekDay > 7);
	}
}
