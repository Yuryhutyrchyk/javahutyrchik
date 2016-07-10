/**
 * 
 */
package lesson3;

import java.util.Scanner;

/**
 * @author Yura
 *
 */
public class Tasks10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // 
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите число!");
		if (scn.hasNextInt()) {
			n = scn.nextInt();
		}
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.print("\n");
			for (int j = 0; j < n; j++) {
				arr [i][j] = (int)(Math.random()*100);
				System.out.printf("%3d",arr[i][j]);
			}
		}
		int i = 0;
		int j = 0;
		System.out.println("\n"+"Последовательность главной диагонали:");
		while (i != n && j != n){
			System.out.printf("%3d",arr[i][j]);
			i+=1;
			j+=1;
		}
		i = 0;
		j = n-1;
		System.out.println("\n"+"Последовательность побочной диагонали:");
		while (i != n){
			System.out.printf("%3d",arr[i][j]);
			i+=1;
			j-=1;
		}
	}
}
