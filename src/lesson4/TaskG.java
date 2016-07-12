/**
 * 
 */
package lesson4;

/**
 * @author Yura
 *
 */
public class TaskG {

	/**
	 * @param args
	 * 
	 * @return
	 */
	public static void main(String[] args) {
		String str = "tttuuuupppppjjjjjj";
		System.out.println(str);
		String chekstr = compress(str);
		System.out.println(chekstr);
	}

	public static String compress(String s) { // method of performing
												// compression line , based on a
												// repeating character counter
		if (s == null || s.length() == 0) { // avoids a program error if the
											// string is empty
			return "";
		}

		char charOne = s.charAt(0); // assign a variable to a string character
									// at index 0
		int charCount = 0; // assigning a value of zero counter
		StringBuilder result = new StringBuilder();
		char[] arr = s.toCharArray();
		for (char ch = 0; ch < arr.length; ch++) { // runs through an array of
													// characters
			if (charOne == arr[ch]) { // checks for matches
				charCount++; // provided coincidence adds 1
			} else { // If no match is found
				result.append(charOne).append(charCount); // It adds the current
															// character and
															// count value to a
															// variable result
				charOne = arr[ch]; //
				charCount = 1;
			}
		}
		result.append(charOne).append(charCount);
		if (result.length() >= arr.length) {
			return "";
		} else {
			return result.toString();
		}
	}
}