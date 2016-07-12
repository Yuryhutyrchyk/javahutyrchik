/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class TaskA {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // method replaces each k -th
												// letter of the keyboard symbol
		String str = new String(
				"ƒопустим, что существует метод isSubstring, провер€ющий, €вл€етс€ ли одно слово подстрокой другого. ƒл€ двух строк, s1 и s2, напишите код проверки, получена ли строка s2 циклическим сдвигом s1, использу€ только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat)");
		System.out.println(str); // display a original text
		System.out.println("¬ведите числовое значение k: ");
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt(); // Keyboard input value of k
		System.out.print("¬ведите символ: \r");
		String symb = scn.next(); // enter from the keyboard character to
									// replace
		String temp;
		String[] sentence = str.split("[\\s\\.\\!\\,]"); // divide the string
															// into an array of
															// words
		for (int i = 0; i < sentence.length; i++) { // each word in the array of
													// pieces make up : 1) up to
													// part of the letters k 2)
													// the symbol instead of the
													// letters k 3) after the
													// portion of the letter k
			if (k < sentence[i].length()) {
				temp = "";
				temp += sentence[i].substring(0, k - 1);
				temp += symb;
				temp += sentence[i].substring(k, sentence[i].length());
				sentence[i] = temp;
			}
			System.out.print(sentence[i] + " "); // Display the edited line
		}
	}
}
