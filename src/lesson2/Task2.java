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
		System.out.print("Введите первое целое число: ");
		if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
			num1 = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
		} else {
	        System.out.println("Вы ввели не целое число");
	    }
		System.out.print("Введите второе целое число: ");
		if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
			num2 = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
		} else {
	        System.out.println("Вы ввели не целое число");
	    }
		if(num1>num2){
			System.out.println("Первое число больше второго");
		}
		if(num1<num2){
			System.out.println("Первое число меньше второго");
		}
		if(num1==num2){
			System.out.println("Первое число равное второму");
		}
	}
}
