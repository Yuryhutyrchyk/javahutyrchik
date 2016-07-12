/**
 * 
 */
package lesson4;

/**
 * @author Yura
 *
 */
public class TaskB {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // In the English text replace each
												// letter of its serial number
												// in the alphabet . When
												// displaying on a single line
												// print text with two spaces
												// between the letters , the
												// next line beneath each letter
												// typing its number .

		String s = ("Java forever");
		s = s.toLowerCase(); // translate the string to lowercase
		char[] ch = s.toCharArray();
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' }; // initialize an array
															// alphabet
															// including space
															// as an array
															// element

		for (int i = 0; i < ch.length; i++) { // Displays the original string
			System.out.print("  " + ch[i]);
		}
		System.out.println();

		for (int i = 0; i < ch.length; i++) { // display a second line of the
												// serial number of each letter
												// of the original text
			for (int j = 0; j < arr.length; j++) {
				if (ch[i] == (arr[j])) {
					if (ch[i] == (arr[26])) {
						System.out.print("   ");
					} else
						System.out.printf("%3d", (j + 1));
				}
			}
		}
	}
}
