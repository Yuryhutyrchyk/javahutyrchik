/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Type any text: ");
		String str = scn.nextLine();
		System.out.println("Set the number of characters in a word: ");
		int leng = scn.nextInt();
		String[] strMass = str.split(" ");
		StringBuilder build = new StringBuilder();
		for (String a : strMass) {
			if (!(!check(a.charAt(0)) && a.length() == leng)) { // conditions
				build.append(a).append(" ");
			}
		}
		String b = build.toString().trim();
		System.out.println(b);
	}

	public static boolean check(char c) {
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