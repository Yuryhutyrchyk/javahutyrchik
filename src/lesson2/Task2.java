/**
 * 
 */
package lesson2;
import java.util.Scanner;
/**
 * @author Yura
 *
 */
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������ ����� �����: ");
		if(sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
			num1 = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
		} else {
	        System.out.println("�� ����� �� ����� �����");
	    }
		System.out.print("������� ������ ����� �����: ");
		if(sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
			num2 = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
		} else {
	        System.out.println("�� ����� �� ����� �����");
	    }
		if(num1>num2){
			System.out.println("������ ����� ������ �������");
		}
		if(num1<num2){
			System.out.println("������ ����� ������ �������");
		}
		if(num1==num2){
			System.out.println("������ ����� ������ �������");
		}
	}
}
