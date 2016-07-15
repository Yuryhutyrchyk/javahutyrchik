/*Создать классы, спецификации которых приведены ниже. Определить кон-
структоры и методы setТип(), getТип(), toString(). Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов. 
Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
Создать массив объектов. Вывести:
a) список абитуриентов, имеющих неудовлетворительные оценки;
b) список абитуриентов, у которых сумма баллов выше заданной;
c) выбрать заданное число n абитуриентов, имеющих самую высокую
сумму баллов (вывести также полный список абитуриентов, имеющих
полупроходную сумму).*/

package abiturients;

import java.util.Random; //Import utility for random function
import java.util.Scanner;//Import utility for scanning

public class Abitur {

	private static Scanner scn; // scanner variable
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
		int n; // variables that come with value number of patients
		int action;// //variables that come with value that start switch case
		int phone = 0; // buffer for phone numbers
		int m1 = 0; // buffer for mark numbers
		int m2 = 0; // buffer for mark numbers
		
		String[] name_ = { "Valera", "Misha", "Vasia", "Lenia", "Egor", "Oleg", "Pasha", "Dima", "Kolia", "Grigorii",
				"Valera", "Nik", "Rostik", "Antony", "Vadim", "Boris" }; // names
																			// of
																			// which
																			// are
																			// random
																			// utility
																			// chosen
																			// name
																			// and
																			// filled
																			// in
																			// the
																			// card
		String name;
		String[] surName_ = { "Potapenko", "Skvorcov", "Perkin", "Drakin", "Mrakin", "Zakin", "Valkin", "Palkin",
				"Malkin", "Ovechkin", "Crosby", "Petrov", "Sidorov", "Kozel", "Mozel", "Mozilo", "Tormozilo" };// surName
																												// of
																												// which
																												// are
																												// random
																												// utility
																												// chosen
																												// surName
																												// and
																												// filled
																												// in
																												// the
																												// card
		String surName;
		String[] midName_ = { "Jalkovich", "Petrovich", "Poselkovich", "Mrovich", "Hrenkovich", "Amuradovich",
				"Xaxadovich", "Potapovich", "Mokolovich" };// midnames of which
															// are random
															// utility chosen
															// midname and
															// filled in the
															// card
		String midName;
		String[] adress_ = { "Kolasa 90", "Pritickogo 87", "Asanalieva 93", "Karbisheva 34", "Mayak 23", "Mihalkovo 43",
				"Cniaskaya 3", "Jeleznii 78" };// adresses of which are random
												// utility chosen adress and
												// filled in the card
		String adress;

		scn = new Scanner(System.in);
		System.out.print("Number of patients: ");
		n = scn.nextInt();// scanner variable
		OperateAbitur p[] = new OperateAbitur[n]; // patients array
		Random r = new Random();

		for (int j = 0; j < n; j++) { // the array cycle

			name = name_[r.nextInt(name_.length)];// automatic filling of
													// patient cards // _mean -
													// protected, __mean -
													// private

			surName = surName_[r.nextInt(surName_.length)];// automatic filling
															// of patient cards

			midName = midName_[r.nextInt(midName_.length)];// automatic filling
															// of patient cards

			adress = adress_[r.nextInt(adress_.length)];// automatic filling of
														// patient cards

			phone = 2 + r.nextInt(999999);// automatic filling of patient cards
			m1 = 1 + r.nextInt(9);
			m2 = 1 + r.nextInt(9);

			p[j] = new OperateAbitur(column(name, 10), column(surName, 10), column(midName, 12), column(adress, 12), m1,
					m2, phone, 10 + j); // automatic
										// filling of
										// patient cards
		}

		for (int i = 0; i < n; i++) {
			System.out.println(p[i].toString()); // It shows the generated list
													// of patients
		}
		
		System.out.println("Choose a filter for the list :");
		System.out.println("1)Bad marks");
		System.out.println("2)Search sum of marks");
		System.out.println("3)Search the best of abiturients");
		action = scn.nextInt();
		scn.nextLine();
		switch (action) {
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
				if ((p[i].getMark1() + p[i].getMark2() >= passScore) && temp <= x) {
					System.out.println("The best abiturients: " + p[i].toString());
					temp +=1;
				} else if (p[i].getMark1() + p[i].getMark2() >= passScore){
					System.out.println("The abiturients with passing score" + p[i].toString());
				}
			}
			break;
		}
	}

}