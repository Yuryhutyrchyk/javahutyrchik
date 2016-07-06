package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Tasks12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("¬ведите значение n: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array = new int[n];
		int x = 0;
		for (int i = 1; i < n + 1; i++) {
			x += i;
		}
		System.out.println(x);

	}

}
