/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("¬ведите свой текст: ");
		String feed = scn.nextLine();
		char[] ch = feed.toCharArray();
		String s = feed.replaceAll("(?u)[^\\pL ]","");
		System.out.println(s);
	}
}
