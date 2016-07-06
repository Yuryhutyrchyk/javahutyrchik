/**
 * 
 */
package lesson2;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 * @author Yura
 *
 */
public class Task8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // TODO Auto-generated method stub

		int d = 0;
		int m = 0;
		int y = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите день: ");
		if (sc.hasNextInt()) {
			d = sc.nextInt();
		}
		System.out.println("¬ведите мес€ц: ");
		if (sc.hasNextInt()) {
			m = sc.nextInt();
			m = m + 2;
		}
		System.out.println("¬ведите год: ");
		if (sc.hasNextInt()) {
			y = sc.nextInt();
			c = y / 100 + 1;
			y = y % 100;
		}
		int d2 = (int) (d + Math.floor(1 / 5 * Math.floor(13 * m - 1)) + y + Math.floor(y / 4) + Math.floor(c / 4)
				- 2 * c + 777) % 7;

		switch (d2) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Come on, Dude...");
		}
	}

}