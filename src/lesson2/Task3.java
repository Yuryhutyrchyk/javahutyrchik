/**
 * 
 */
package lesson2;
import java.util.Scanner;
/**
 * @author Yura
 *
 */
public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		double result = 0;
		String strResult = "";
		System.out.println("������� ������ �����: ");
		num1 = scn.nextInt();
		System.out.println("������� ������ �����: ");
		num2 = scn.nextInt();
		while(num2 == 0){
			System.out.println("�������� �� ������ ���� ����� ����!");
			System.out.println("������� ��������: ");
		    num2 = scn.nextInt();
		    	if(num2 > 0) break;
		}
		result = (double)num1/num2;
		strResult = result + "";
			if(result % 1 == 0){
				strResult = strResult.replace(".0", "");
			}
		System.out.print("������� ���� �����: \n");
		System.out.println(num1 + " : " + num2 + " = " + strResult);
	}
}
