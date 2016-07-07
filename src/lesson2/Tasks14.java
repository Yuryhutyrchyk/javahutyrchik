/**
 * 
 */
package lesson2;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Tasks14 {

	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		String operation, q1; // variable scn for our symbols & function quit
		for (;;) {
			Scanner scn = new Scanner(System.in); // variable scn for our scan
			System.out.println("������� ������ ��������:");
			if (scn.hasNextDouble()) { // check for input type
				num1 = scn.nextDouble(); // input argument value from the keyboard
			} else { // implementation of exiting the application
				q1 = scn.next();
				switch (q1) {
				case "q":
					System.out.println("�� ����� �� ����������");
					System.exit(0);
				default:
					System.out.println("������������ ������!");
					System.exit(0);
				}
			}
			System.out.println("������� ������ ��������:");
			if (scn.hasNextDouble()) { // check for input type
				num2 = scn.nextDouble(); // input argument value from the keyboard
			} else { // implementation of exiting the application
				q1 = scn.next();
				switch (q1) {
				case "q":
					System.out.println("����!");
					System.exit(0);
				default:
					System.out.println("������������ ������!");
					System.exit(0);
				}
			}
			System.out.println("������� �������� ��������: + - * /");
			operation = scn.next();
			switch (operation) { // switch operation that program
			case "+":
				System.out.println("���������: ");
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println("���������: ");
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println("���������: ");
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println("���������: ");
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("������������ ������... ����....");
				System.exit(0);
			}
		}

	}
}