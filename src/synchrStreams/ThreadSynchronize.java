package synchrStreams;

import java.util.Scanner;

public class ThreadSynchronize extends Thread {
	static int k=1;
	public ThreadSynchronize() {
		k++;
	}
	String name = "Thread " +k;
	public static void main(String[] args) {
		System.out.println("Enter code word");
		Scanner scn = new Scanner(System.in);
		if (scn.next().equals("start"))
		print10();
		scn.close();
	}
	@Override
	public void run() {
		StringBuffer sb= new StringBuffer();
		for (int i = 1; i < 100; i++) {
			sb.append(i+" ");
			if (i%10==0){
				System.out.println(name+" : " +sb);
				sb.setLength(0);
			}
		}
		System.out.println();
	}
	public static synchronized void print10() {
		ThreadSynchronize tc = new ThreadSynchronize();
		tc.start();
		ThreadSynchronize tc2 = new ThreadSynchronize();
		tc2.start();
	}
}