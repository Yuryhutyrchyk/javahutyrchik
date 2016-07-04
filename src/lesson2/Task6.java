/**
 * 
 */
package lesson2;
import java.util.Scanner;
/**
 * @author Yura
 *
 */
public class Task6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	// TODO Auto-generated method stub
		int numRbl = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Укажите сумму: ");
		numRbl = scn.nextInt();
        if ((numRbl % 100 > 9 && numRbl % 100 < 20) || (numRbl % 10 == 0)){
            System.out.println("Результат: " + "\n" + numRbl + " рублей");
        }
        else if (numRbl % 10 == 1){
            System.out.println("Результат: " + "\n" + numRbl + " рубль");
        }
        else if (numRbl % 10 > 1 && numRbl % 10 < 5){
            System.out.println("Результат: " + "\n" + numRbl + " рубля");
        }
        else {
            System.out.println("Результат: " + "\n" + numRbl + " рублей");
        }
		
	}
}
