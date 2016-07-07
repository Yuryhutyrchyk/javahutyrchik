/**
 * 
 */
package lesson3;

/**
 * @author Yura
 *
 */
public class Task6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // calculating a number of negative elements
		int arr[] = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = ((int) (Math.random() * 30) - 15);
			System.out.printf("%4d",arr[i]);
			if (arr[i] < 0) {
				sum += 1;
			}
		}
		System.out.print("\n" + "Отрицательных элементов в массиве: " + sum);
	}

}
