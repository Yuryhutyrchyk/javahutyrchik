/**
 * 
 */
package lesson2;
import java.util.Scanner;
/**
 * @author Yura
 *
 */
public class Task7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	// TODO Auto-generated method stub
		int weekDay = 0;
		do{
			Scanner scn = new Scanner(System.in);
			System.out.println("������� ���� ������ ������: ");
			if(scn.hasNextInt()) { // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
				weekDay = scn.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
				switch(weekDay){
				case 1 : System.out.println("�����������");
				break;
				case 2 : System.out.println("�������");
				break;
				case 3 : System.out.println("�����");
				break;
				case 4 : System.out.println("�������");
				break;
				case 5 : System.out.println("�������");
				break;
				case 6 : System.out.println("�������");
				break;
				case 7 : System.out.println("�����������");
				break;
				default : System.out.println("������� ����� � ��������� �� 1 �� 7: ");
				}
			}
		}while(weekDay <1 || weekDay >7);
	}
}
