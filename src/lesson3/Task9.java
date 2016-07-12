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
		int[] a = { 1, 0, 7, 4, 0, 0, 9, 1, 0, 2, 5, 8, 0 }; // array
		int size = a.length;
		System.out.print("First: ");
		for (int c = 0; c < size; c++) {
			System.out.printf("%3d", a[c]);
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] != 0) {
						a[i] = a[j];
						a[j] = 0;
						break;
					}
				}
			}
		}
		System.out.print("\n" + "Change:");
		for (int c = 0; c < size; c++) {
			System.out.printf("%3d", a[c]);
		}
	}
}