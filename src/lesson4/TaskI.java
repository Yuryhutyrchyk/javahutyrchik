/**
 * 
 */
package lesson4;

/**
 * @author Yura
 *
 */
public class TaskI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = new String(); // It creates an object of class String
		String str2 = new String(); // It creates an object of class String
		str1 = "waterbottle"; // assigns the value 
		str2 = "erbottlewat"; // assigns the value
		System.out.print(isSubstring(str1, str2)); // displays the result of the method isSubstring
	}

	public static boolean isSubstring(String str1, String str2) { //method of checking whether one word substring of another
		if (str1.length() == str2.length()) { // there is a check in the condition of equality of the lengths of the lines
			String str = str1 + str2; // string variable is assigned the result of adding two strings
			str = str.replace(str2, ""); // removes the second row of the variable containing the result of the addition of strings
			if (str.equals(str1)) { // check the condition of equality of the edited result of the addition of rows with the first row
				return true; 
			}
		}
		return false;
	}
}