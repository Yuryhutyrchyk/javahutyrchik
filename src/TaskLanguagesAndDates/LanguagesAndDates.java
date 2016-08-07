package TaskLanguagesAndDates;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LanguagesAndDates {
	 private static final String FILENAME = "TaskLanguagesAndDates/language";

	 public static void main(String args[]) {
	  Locale locale = new Locale("en", "EN");
	  Date currentDate = new Date();
	  try {
	   locale = new Locale(args[0], args[0]);
	  } catch (Exception e) {
	   System.out.println("default localization");
	  }
	  DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
	  ResourceBundle rb = ResourceBundle.getBundle(FILENAME, locale);
	  System.out.println(rb.getString("Greet"));
	  System.out.println(df.format(currentDate));
	 }
}