/**
 * 
 */
package lesson2;
import java.util.Scanner;
/**
 * @author Yura
 *
 */
public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	// TODO Auto-generated method stub
		int year = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("������� ���: ");
		year = scn.nextInt();
		if(year%4==0 && year%100 !=0 || year%400==0){
			System.out.println("������ ��� �������� ����������");
		} else {
			System.out.println("������ ��� �� �������� ����������");
		}
	}

}
