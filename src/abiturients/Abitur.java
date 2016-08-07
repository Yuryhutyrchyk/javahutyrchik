/*������� ������, ������������ ������� ��������� ����. ���������� ���-
��������� � ������ set���(), get���(), toString(). ���������� �������������
������ � ������, ��������� ������ ��������. ������ �������� ������ ������
� ������� ��� ������ �� �������. � ������ ������, ���������� �����������,
������ ���� ��������� ��������� �������������. 
Abiturient: id, �������, ���, ��������, �����, �������, ������.
������� ������ ��������. �������:
a) ������ ������������, ������� �������������������� ������;
b) ������ ������������, � ������� ����� ������ ���� ��������;
c) ������� �������� ����� n ������������, ������� ����� �������
����� ������ (������� ����� ������ ������ ������������, �������
������������� �����).*/

package abiturients;

import java.util.InputMismatchException; // Import utility for exception
import java.util.Random; // Import utility for random function
import java.util.Scanner; // Import utility for scanning

public class Abitur {

	private static int x;// variables that come with value case

	public static String column(String str, int b) {
		for (int i = 0; i < b; i++) {
			if (str.length() < b) {
				str = str + " ";
			}
		}
		return str;
	}

	public static void main(String[] args) {
		int n; // variables that come with value number of abiturients
		int choice = -1;// //variables that come with value that start switch
						// case
		int phone = 0; // buffer for phone numbers
		int m1 = 0; // buffer for mark numbers
		int m2 = 0; // buffer for mark numbers

		String[] name_ = { "Valera", "Misha", "Vasia", "Lenia", "Egor", "Oleg", "Pasha", "Dima", "Kolia", "Grigorii",
				"Valera", "Nik", "Rostik", "Antony", "Vadim", "Boris" }; 
		String[] surName_ = { "Potapenko", "Skvorcov", "Perkin", "Drakin", "Mrakin", "Zakin", "Valkin", "Palkin",
				"Malkin", "Ovechkin", "Crosby", "Petrov", "Sidorov", "Kozel", "Mozel", "Mozilo", "Tormozilo" };
		String surName;
		String[] midName_ = { "Jalkovich", "Petrovich", "Poselkovich", "Mrovich", "Hrenkovich", "Amuradovich",
				"Xaxadovich", "Potapovich", "Mokolovich" };
		String midName;
		String[] adress_ = { "Kolasa 90", "Brovki 87", "Vaneeva 93", "Gikalo 34", "Mayak 23", "Mihalkovo 43",
				"Cniaskaya 3", "Jeleznii 78" };
		String adress;

		Scanner scn = new Scanner(System.in);
		System.out.print("Type number of abiturients: ");
		n = scn.nextInt();
		OperateAbitur p[] = new OperateAbitur[n]; 
		Random r = new Random();

		for (int j = 0; j < n; j++) { 

			// auto complete array of objects
			String name = name_[r.nextInt(name_.length)];
			surName = surName_[r.nextInt(surName_.length)];
			midName = midName_[r.nextInt(midName_.length)];
			adress = adress_[r.nextInt(adress_.length)];
			phone = 2 + r.nextInt(999999);
			m1 = 1 + r.nextInt(9);
			m2 = 1 + r.nextInt(9);

			// It's used to specify a mapped column for a persistent property or field.
			p[j] = new OperateAbitur(column(name, 10), column(surName, 10), column(midName, 12), column(adress, 12), m1,
					m2, phone, 10 + j); 								
		}

		// It shows the generated list of patients
		for (int i = 0; i < n; i++) {
			System.out.println(p[i].toString()); 
		}

		// Shows all the available options for user.
		while (choice != 0) {
			System.out.println("Make your choice :");
			System.out.println("1. Bad marks");
			System.out.println("2. Search sum of marks");
			System.out.println("3. Search the best of abiturients");
			System.out.println("0. Exit");

			// eliminates the user input is not an integer value
			try {
				choice = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong option! Please Enter a integer value: ");
				scn.next();
				choice = -1;
			}

			switch (choice) {
			case 1:
				System.out.println("Type the critical mark: ");
				x = scn.nextInt();
				for (int i = 0; i < n; i++) {
					if ((p[i].getMark1() <= x) || (p[i].getMark2() <= x)) {
						System.out.println(p[i].toString());
					}
				}
				break;
			case 2:
				System.out.println("Type the critical sum of mark: ");
				x = scn.nextInt();
				for (int i = 0; i < n; i++) {
					if (p[i].getMark1() + p[i].getMark2() > x) {
						System.out.println(p[i].toString());
					}
				}
				break;
			case 3:
				System.out.println("Type number of the best abiturients: ");
				x = scn.nextInt();
				int temp = 0;
				int passScore = 10; // passing score
				for (int i = 1; i < n; i++) {
					if ((p[i].getMark1() + p[i].getMark2() >= passScore) && temp < x) {
						System.out.println("The best abiturients: " + p[i].toString());
						temp += 1;
					} else if (p[i].getMark1() + p[i].getMark2() >= passScore) {
						System.out.println("The abiturients with passing score" + p[i].toString());
					}
				}
				break;
			case 0:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			}
		}
		scn.close();
	}
}