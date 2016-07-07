/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // calculating the minimum and maximum values
		int[] array = { 2, 5, 3, 1, 6, 9, 4, 7, 8, 4 };
		int min = array[0];
		int max = array[0];
		System.out.print("Значения массива: ");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d",array[i]);
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("\nmin value = " + min);
		System.out.println("max value = " + max);
	}

}
