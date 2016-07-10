/**
 * 
 */
package lesson4;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = new String(
				"Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого. Для двух строк, s1 и s2, напишите код проверки, получена ли строка s2 циклическим сдвигом s1, используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat)");
		System.out.println(
				"Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого. Для двух строк, s1 и s2, напишите код проверки, получена ли строка s2 циклическим сдвигом s1, используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat)");
		System.out.println("Введите числовое значение k: ");
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		System.out.print("Введите символ: \r");
		String symb = scn.next();
		String temp;
		String[] sentence = str.split("[\\s\\.\\!\\,]"); // divide the line into
															// words
		for (int i = 0; i < sentence.length; i++) {
			if (k < sentence[i].length()) {
				temp = "";
				temp += sentence[i].substring(0, k - 1);
				temp += symb;
				temp += sentence[i].substring(k, sentence[i].length());
				sentence[i] = temp;
			}
			System.out.print(" " + sentence[i]);

		}
	}
}
