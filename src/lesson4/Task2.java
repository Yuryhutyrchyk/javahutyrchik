/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Type any text: \n");
		String s = scn.nextLine();
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "  ");
		}
		System.out.println();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (ch[i] == (arr[j])) {
					if (ch[i] == (arr[26])) {
						System.out.print("   ");
					} else
						System.out.printf("%3d", (j + 1));
				}
			}
		}
	}
}
