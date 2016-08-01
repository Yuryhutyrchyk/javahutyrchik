package streams;

/**
 * Class describes a stream that provides unsynchronized output to a console
 * window numbers 1 to 100 in portions of 10 digits. Each serving should
 * indicate the name of the stream, which it brought.
 * 
 * @author Yura
 */

public class AppTwoThreads extends Thread{
	private int i = 0;
	AppTwoThreads(String name){
		super(name);
	}
	@Override
	public void run() {
		StringBuffer strB = new StringBuffer();
		strB = strB.append(this.getName());
		for(i=1;i<101;i++){
			strB = strB.append(" " + i);
			if (i%10 == 0){
				System.out.println(strB);
				strB = new StringBuffer();
				strB = strB.append(this.getName());
			}
		}
	}
}
