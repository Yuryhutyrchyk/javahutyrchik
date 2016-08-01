package streams;

import java.util.Scanner;

/**
 * Ñlass creates two streams transfer class "AppTwoThreads" and launches them after
 * entering in "start" console window.
 * 
 * @author Yura
 */

public class AppMain {

	public static void main(String[] args){
		String str = "start";
		Scanner scn = new Scanner(System.in);
		System.out.println("Type <<start>> to activate the application");
		while(!str.equalsIgnoreCase(scn.nextLine())){
			scn.hasNext();
		}
		scn.close();
		new AppTwoThreads("Thread 1:").start();
		new AppTwoThreads("Thread 2:").start();
	}
}
