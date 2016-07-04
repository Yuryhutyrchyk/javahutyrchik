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
			System.out.println("Введите день недели числом: ");
			if(scn.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
				weekDay = scn.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
				switch(weekDay){
				case 1 : System.out.println("Понедельник");
				break;
				case 2 : System.out.println("Вторник");
				break;
				case 3 : System.out.println("Среда");
				break;
				case 4 : System.out.println("Четверг");
				break;
				case 5 : System.out.println("Пятница");
				break;
				case 6 : System.out.println("Суббота");
				break;
				case 7 : System.out.println("Воскресение");
				break;
				default : System.out.println("Введите число в диапазоне от 1 до 7: ");
				}
			}
		}while(weekDay <1 || weekDay >7);
	}
}
