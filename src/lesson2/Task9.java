/**
 * 
 */
package lesson2;
import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Task9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("¬вести значение n: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array = new int[n];
		double x = 0;
		for (int i = 1; i < n+1; i++) {
			x += (double) 1/i;
		}
		System.out.println(x);

	}

}
