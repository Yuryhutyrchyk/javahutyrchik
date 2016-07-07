/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // determining the highest value and its index
		int arr[] = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = ((int) (Math.random() * 30)-15);
			System.out.printf("%4d",arr[i]);
		}
		int max = arr[0];
		int max_i = 0;
		for (int i = 1; i < 15; i++) {
			if (max < arr[i]) {
				max = arr[i];
				max_i = i;
			}
		}
		System.out.println("\n" + "max value = " + max);
		System.out.println("max index = " + max_i);

	}

}
