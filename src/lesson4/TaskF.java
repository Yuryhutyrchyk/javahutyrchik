/**
 * 
 */
package lesson4;

import java.util.Arrays;

/**
 * @author Yura
 *
 */
public class TaskF {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // method for determining whether
												// another one row permutation .
		String str1 = "the characters are not repeated in the row";
		String str2 = "are the characters not repeated in the row";
		if (permutation(str1, str2)) { // check the condition is true whether
										// the result of the method of
										// permutation
			System.out.println("This line is a permutation of another row"); // It
																				// displays
																				// one
																				// of
																				// the
																				// comparison
																				// results
		} else {
			System.out.println("This line is not a permutation of another row"); // It
																					// displays
																					// one
																					// of
																					// the
																					// comparison
																					// results
		}
	}

	static String sort(String s) { // method sorts an array
		char[] content = s.toCharArray(); // It creates an array of characters
											// from the subject string sorting
		Arrays.sort(content); // sort () method of the class Arrays
		return new String(content); // method returns the result of the sort
	}

	static boolean permutation(String s, String t) { // method of determining
														// the fact of
														// permutation in the
														// lines
		if (s.length() != t.length()) { // condition is satisfied if the length
										// of the lines to be checked are not
										// equal
			return false;
		}
		return sort(s).equals(sort(t)); // returns from the method of comparing
										// the result to the equality of the two
										// sorted strings
	}
}
