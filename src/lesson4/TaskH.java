/**
 * 
 */
package lesson4;

/**
 * @author Yura
 *
 */
public class TaskH {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		int a = 0;
		boolean check = false;
		int b = 0;
		int[][] arr = new int[m][n];// array
		System.out.println("Was: ");// print
		for (int i = 0; i < m; i++) {// conditions for random
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.printf("%2d", arr[i][j]);// print array
			}
			System.out.println();
		}
		for (int i = 0; i < m; i++) {// conditions for random
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					a = i;
					check = true;
					b = j;
					break;
				}
			}
		}
		System.out.println("Edited array: ");
		if (check){
			for (int i = 0; i < m ; i++){
				arr[i][b]=0;
				}
			for (int j = 0; j < n; j++){
				arr[a][j]=0;
				}
		}
		for (int i = 0; i < m; i++){
				for (int j = 0; j < n; j++){
					System.out.printf("%2d", arr[i][j]);// print array
				}
				System.out.println();
			}
		}
}
	