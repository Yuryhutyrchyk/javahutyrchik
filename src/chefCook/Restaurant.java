package chefCook;

/**
 * The class creates by default named chef who proposes to make a choice from the menu
 * 
 * @author Yura
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


public class Restaurant {
	static Date currentDate = new Date();
	static Locale locale = askLocale();
	static String FILENAME;
	static ResourceBundle rb;
	static DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
	
	@SuppressWarnings("resource")
	private static Locale askLocale() {
		Logger.getLogger().addLogInfo("The user selects the interface language");
		System.out.println("Please choose language:");
		System.out.println("1. Русский");
		System.out.println("2. English");
		Scanner scn = new Scanner(System.in);
		int localeCode = scn.nextInt();
		Locale locale = null;
		switch (localeCode) {
		case 1:
			FILENAME = "chefCook.localization/Loc_ru_Ru";
			locale = new Locale("ru", "RU");
			rb = ResourceBundle.getBundle(FILENAME, locale);
			break;
		case 2:
			FILENAME = "chefCook.localization/Loc_en_En";
			locale = new Locale("en", "EN");
			rb = ResourceBundle.getBundle(FILENAME, locale);
			break;
		}
		return locale;
	}
	
	public static void main(String[] args) {
		Logger.getLogger().addLogInfo("The app launched");
		System.out.println(df.format(currentDate));
		Chef chef = new Chef();
		System.out.println(rb.getString("hiMyNameIs") + chef.getName() + ".\n" 
		+ rb.getString("whatDoYouWantToCookToday") + "?\n");
		int choice = -1;
		Scanner scn = new Scanner(System.in);
		while (choice != 0) {
			System.out.println(rb.getString("menu"));
			System.out.println(rb.getString("prepareSaladVinaigrette"));
			System.out.println(rb.getString("prepareSaladSpring"));
			System.out.println(rb.getString("prepareFrenchFries"));
			System.out.println(rb.getString("exit"));
			System.out.println(rb.getString("makeYourChoiceBySelectingANumberPlease"));
			try {
				choice = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(rb.getString("wrongChoice"));
				Logger.getLogger().addLogInfo("Incorrect user input");
				scn.next();
				choice = -1;
			}
			switch (choice) {
			case (1):
				chef.makeVinaigrette();
				Logger.getLogger().addLogInfo("User make choise");
				break;
			case (2):
				chef.makeSpring();
				Logger.getLogger().addLogInfo("User make choise");
				break;
			case (3):
				chef.fryPotato();
				Logger.getLogger().addLogInfo("User make choise");
				break;
			case (0):
				System.out.println(rb.getString("bye"));
				System.exit(0);
				Logger.getLogger().addLogInfo("App is cloused");
				break;
			default:
				break;
			}
		}
		scn.close();
	}
}
