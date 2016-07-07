/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // calculating the mean value
		float array[] = { 2, 3, 6, 3, 6, 8, 2, 1, 7, 5 }; // array initialization
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + "|");
		}
		float sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += array[i];
		}
		float val = sum / array.length;
		System.out.print("\n" + "average value=" + val);
	}
}
