/**
 * 
 */
package lesson2;

/**
 * @author Yura
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main method
		String str = "�������� � Java ���� ������ ��������� ����� java.util.Calendar. � ��� �������� ���������� ����� �������� � ������ �������, �� ���� ���� ����������� � �� �� ��������� �����-�� ���������� ���������. �����, �� ������� � ��� ������, ��� �� ����� ���� ����� �� ������ ����������. �������� ������ � �������� ����� �� �������������� ���������. ������� ������������ ������� ����� �� ���������� ���������. � ���� ���� ��������� ����� �������� �� ��������� (��� �� ����� ���� ��� � ���� � Java �������� �� ��������� Spirit), �� �� �������� ��������� ����������� ���������. ��� �� ��������� ��������� ����� ��������, �� ���� �� �� ���������, ���� ��� ������, ��� ����������� ��������� 5 ���� � �����-���� ���� ������ �������������� �� ���� ���������. �.�. �� ���� ���� ���������� ���� ����� ����� �������, ������� ����� ����� ���������� ����������. ������ ��������� ���� ������������ ������, ������� � ����� ������� �� ����� ��������� �������, � � ������ �������, ����� ����� ��� ������� �������.";// create
																																																																																																																																																																																																																																																													// a
																																																																																																																																																																																																																																																													// variable
																																																																																																																																																																																																																																																													// of
																																																																																																																																																																																																																																																													// type
																																																																																																																																																																																																																																																													// String
																																																																																																																																																																																																																																																													// with
																																																																																																																																																																																																																																																													// the
																																																																																																																																																																																																																																																													// text

		int length = str.length(); // It calculates the length of the line
		System.out.println("����� ������ = " + length); // the display of the
														// number of characters
														// in the string

		int n = length / 2; // divide in half line
		String strFirst = str.substring(0, n); //
		String strSecond = str.substring(n, length);
		System.out.println("������ ������: " + strFirst); // the display of new
															// variable string
															// with the first
															// part of the line
		System.out.println("������ ������: " + strSecond); // the display of new
															// variable string
															// with the second
															// part of the line
	}

}
