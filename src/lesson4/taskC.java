/**
 * 
 */
package lesson4;

/**
 * @author Yura
 *
 */
public class TaskC {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // From a small text to remove all
												// symbols except spaces , which
												// are not letters
		String str = "***Now!�� %every%thing? i*s �all� *r*i*g*h*t*!!!";
		System.out.println(str);
		String s = str.replaceAll("(?u)[^\\pL ]", ""); // removes all but the
														// gaps and letters
		System.out.println(s);
	}
}
