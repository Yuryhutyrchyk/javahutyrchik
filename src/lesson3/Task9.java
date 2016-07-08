/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Method rearranges all the zeros
												// at the end of the array
		int[] arr = { 0, 3, 4, 0, 7, 9, 0, 3, 7, 5 }; // array initialization
		int size = arr.length;
		System.out.print("Первичный вид массива: ");
		for (int i = 0; i < size; i++) {
			System.out.printf("%2d", arr[i]);
		}
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < size - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[size - 1] = 0;
			}
		}
		System.out.print("\nВид массива после редактирования: ");
		for (int i = 0; i < size; i++) {
			System.out.printf("%2d", arr[i]);
		}
	}
}