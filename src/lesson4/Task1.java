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
				"��������, ��� ���������� ����� isSubstring, �����������, �������� �� ���� ����� ���������� �������. ��� ���� �����, s1 � s2, �������� ��� ��������, �������� �� ������ s2 ����������� ������� s1, ��������� ������ ���� ����� ������ isSubstring (������: ����� waterbottle �������� ����������� ������� erbottlewat)");
		System.out.println(
				"��������, ��� ���������� ����� isSubstring, �����������, �������� �� ���� ����� ���������� �������. ��� ���� �����, s1 � s2, �������� ��� ��������, �������� �� ������ s2 ����������� ������� s1, ��������� ������ ���� ����� ������ isSubstring (������: ����� waterbottle �������� ����������� ������� erbottlewat)");
		System.out.println("������� �������� �������� k: ");
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		System.out.print("������� ������: \r");
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
