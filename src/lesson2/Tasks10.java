/**
 * 
 */
package lesson2;

import java.util.Scanner;

public class Tasks10 {

	public static void main(String[] args) {

		int a = 0;
		long b = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����: ");
		if (scn.hasNextInt()) {
			a = scn.nextInt();
			for (int c = a; c > 0; c--) {
				b *= c;
			}
			System.out.println("��������� ����� " + a + " ����� " + b);
		} else
			System.out.println("������ - �� ����� �� ����� �����");
	}

}