/**
 * 
 */
package lesson3;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // initialize an array of three ways
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // The first method: initialization list
		System.out.print("Первый массив: ");
		for (int i = 0; i < 15; i++) {
			System.out.printf("%4d",arr1[i]);
		}
		int arr2[] = new int[15]; // The second method: keyboard input
		Scanner scn = new Scanner(System.in);
		System.out.println();
		for (int i = 0; i < 15; i++) {
			System.out.println("Введите значение элемента массива: ");
			arr2[i] = scn.nextInt();
		}
		System.out.print("Второй массив: ");
		for (int i = 0; i < 15; i++) {
			System.out.printf("%4d",arr2[i]);
		}
		System.out.print("\n" + "Третий массив: ");
		int arr3[] = new int[15]; // The third method: randomly
		for (int i = 0; i < 15; i++) {
			arr3[i] = ((int) (Math.random() * 30) - 15);
			System.out.printf("%4d",arr3[i]);
		}
	}

}
