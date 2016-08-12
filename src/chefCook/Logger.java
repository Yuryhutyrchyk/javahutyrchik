package chefCook;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class Logger {
	private static Logger logger;

	public static synchronized Logger getLogger() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	private Logger() {}

	public void addLogInfo(String logInfo) {
		try (FileWriter writer = new FileWriter("log.txt",true)) {
			Date currentDate = new Date();
			DateFormat today = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT);
			writer.write(" |" + today.format(currentDate) + " |" + logInfo + "\n");
		} catch (IOException ex) {
			System.out.println("File not found.");
		}
	}
}
