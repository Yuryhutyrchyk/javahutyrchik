/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // calculation of multiplying the elements of the array to the first zero
		int arr[] = { 2, 2, 4, 0, 5, 1, 6, 0, 8, 4 };
		int mult;
		if (arr[0] != 0) {
			mult = arr[0];
			for (int i = 1; i < 10; i++)
				if (arr[i] != 0) {
					mult *= arr[i];
				} else {
					break;
				}
			System.out.print("Произведение элементов массива до перевого нуля = " + mult);
		} else {
			System.out.print("Произведение элементов массива до перевого нуля = нулю");
		}

	}
}
