package lesson1;

import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ��� : ");
		String s = in.nextLine();
	    System.out.println("������," + " " + s + "!");
	}
}
