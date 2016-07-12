/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class TaskD {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // The text removes all specified
												// length words beginning with a
												// consonant letter

		Scanner scn = new Scanner(System.in);
		String str = "From the text to remove all words of a given length , beginning with a consonant letter.";
		System.out.println("the original text: " + str + "\nSet the number of characters in a word: ");
		int leng = scn.nextInt(); // specifies the length of the words
		String[] strMass = str.split(" "); // It creates an array of elements
											// separated by a space
		StringBuilder build = new StringBuilder();
		for (String a : strMass) {
			if (!(!check(a.charAt(0)) && a.length() == leng)) { // condition: if
																// the first
																// letter is a
																// vowel and the
																// word length
																// is not equal
																// to the
																// specified
																// value
				build.append(a).append(" "); // a string adds proven word and a
												// space
			}
		}
		String b = build.toString().trim(); // an array of words translates to a
											// string
		System.out.println(b); // displays the edited text
	}

	public static boolean check(char c) { // method checks : Is the vowel symbol
		switch (Character.toLowerCase(c)) {
		case 'à':
		case 'ó':
		case 'î':
		case 'û':
		case 'è':
		case 'ý':
		case 'ÿ':
		case 'þ':
		case '¸':
		case 'å':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

			return true;
		default:
			return false;
		}
	}
}