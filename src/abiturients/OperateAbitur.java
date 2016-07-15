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

public class OperateAbitur {
	private String name;
	private String surName;
	private String midName;
	private String adress;
	private int phone;
	private int mark1;
	private int mark2;
	private int id;

	public OperateAbitur(String name, String surName, String midName, String adress, int mark1, int mark2, int phone,
			int id) {// array integration

		this.name = name;
		this.surName = surName;
		this.midName = midName;
		this.adress = adress;
		this.phone = phone;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.id = id;
	}

	public OperateAbitur() { // We assign the value 0

		this.name = "";
		this.surName = "";
		this.midName = "";
		this.adress = "";
		this.phone = 0;
		this.mark1 = 0;
		this.mark2 = 0;
		this.id = 0;
	}

	@Override
	public String toString() {
		return ("id: " + this.getId() + " | " + this.getSurName() + " " + this.getName() + "" + this.getMidName()
				+ "| Adress: " + this.getAdress() + "  | PhoneNumber: " + this.getPhone() + "  " + "  marks: "
				+ this.getMark1() + " | " + this.getMark2());
	}

	public String getName() { // return value when requesting data
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getMidName() {
		return midName;
	}

	public String getAdress() {
		return adress;
	}

	public int getPhone() {
		return phone;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
}
