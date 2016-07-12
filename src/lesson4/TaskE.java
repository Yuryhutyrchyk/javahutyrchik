/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class TaskE {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // It implements the algorithm
												// determines whether all
												// characters in the string are
												// encountered once.
		System.out.print("Type any text: ");
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine(); // It allows the user to enter text with the
									// keyboard
		int count = 0;
		char ch[] = s.toCharArray(); // It creates an array of characters from a
										// string
		for (int i = 0; i < s.length(); i++) { // compares the elements of the
												// array with itself
			for (int j = 0; j < s.length(); j++) {
				if (ch[i] == ch[j] && i != j) { // condition of any element of
												// the array is an array element
												// of the array and with their
												// indices are not equal
					count++;
				}
			}
		}
		if (count > 1) {
			System.out.println("Some characters are repeated in the row. "); // It
																				// displays
																				// one
																				// of
																				// the
																				// comparison
																				// results
		} else {
			System.out.println("Characters are not repeated in the row."); // It
																			// displays
																			// one
																			// of
																			// the
																			// comparison
																			// results
		}
	}
}
