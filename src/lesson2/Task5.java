/**
 * 
 */
package lesson2;
import java.util.Scanner;
/**
 * @author Yura
 *
 */
public class Task5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	// TODO Auto-generated method stub
		int height = 0;
		int weight = 0;
		int weightOptim = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите свой рост: ");
		height = scn.nextInt();
		weightOptim = height - 100;
		System.out.println("Введите свой вес: ");
		weight = scn.nextInt();
		if(weightOptim==weight){
			System.out.println("Ваш вес соответствует оптимальному");
		}
		if(weightOptim>weight){
			System.out.println("Вам необходимо поправиться");
		}
		if(weightOptim<weight){
			System.out.println("Вам необходимо похудеть");
		}
	}
}
