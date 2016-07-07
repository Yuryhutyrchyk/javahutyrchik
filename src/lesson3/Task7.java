/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // calculation of the amount of elements in the array to the first zero
		int arr[] = { 2, 4, 5, 7, 0, 2, 4, 0, 2, 1 };
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (arr[i] != 0) {
				sum += arr[i];
			} else {
				break;
			}
		}
		System.out.println("Сумма элементов массива до первого нуля: " + sum);
	}

}
