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
		System.out.print("������� �����: ");
		numRbl = scn.nextInt();
        if ((numRbl % 100 > 9 && numRbl % 100 < 20) || (numRbl % 10 == 0)){
            System.out.println("���������: " + "\n" + numRbl + " ������");
        }
        else if (numRbl % 10 == 1){
            System.out.println("���������: " + "\n" + numRbl + " �����");
        }
        else if (numRbl % 10 > 1 && numRbl % 10 < 5){
            System.out.println("���������: " + "\n" + numRbl + " �����");
        }
        else {
            System.out.println("���������: " + "\n" + numRbl + " ������");
        }
		
	}
}
