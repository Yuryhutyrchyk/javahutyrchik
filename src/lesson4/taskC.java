/**
 * 
 */
package lesson4;

/**
 * @author Yura
 *
 */
public class taskC {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // From a small text to remove all
												// symbols except spaces , which
												// are not letters
		String str = "***Now!¹¹ %every%thing? i*s ¹all¹ *r*i*g*h*t*!!!";
		char[] ch = str.toCharArray(); // It creates an array of characters from
										// string
		String s = str.replaceAll("(?u)[^\\pL ]", ""); // removes all but the
														// gaps and letters
		System.out.println(s);
	}
}
