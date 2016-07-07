/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // determining the lowest value and its index
		int arr[] = new int[15];
		int min = arr[0];
		int min_i = 0;
		for (int i = 0; i < 15; i++) {
			arr[i] = ((int) (Math.random() * 30) - 15);
			System.out.printf("%4d",arr[i]);
			if (min > arr[i]) {
				min = arr[i];
				min_i = i;
			}
		}
		System.out.print("\n" + "min value = " + min + "\n" + "min index = " + min_i);

	}

}
