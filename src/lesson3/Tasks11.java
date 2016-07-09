/**
 * 
 */
package lesson3;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Tasks11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("¬ведите число!");
		if (scn.hasNextInt()) {
			n = scn.nextInt();
		}
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.print("\n");
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				System.out.printf("%3d", arr[i][j]);
			}
		}
		int k =0;
		int min= arr[k][k];
		int temp;
		System.out.println("\n");
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if(arr[i][j]<min){
				temp=min;
				min=arr[i][j];
				arr[i][j]=temp;
				}			
			}
		min= arr[k+1][k+1];
		System.out.print(min);
		}
		
	}
}
		
	

