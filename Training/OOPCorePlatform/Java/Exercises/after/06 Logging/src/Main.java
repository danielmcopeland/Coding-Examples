import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

	static Logger generalLogger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);	
	static Logger fileLogger = Logger.getLogger("filelogger");
	
	public static void main(String[] args) {
		generalLogging();
		fileLogging();
	}
	
	//-------------------
	// 1. General Logging
	//-------------------
	private static void generalLogging() {
		// TODO: use the generalLogger to log an INFO, WARNING and SEVERE log message
		generalLogger.log(Level.INFO, "This is an info message");
		generalLogger.log(Level.WARNING, "This is a warning");
		generalLogger.log(Level.SEVERE, "This is an exception", new Exception("some exception message"));
	}
	
	//-------------------
	// 2. Logging to a file
	//-------------------
	private static void fileLogging() {
		// TODO: Use the fileLogger to log all log messages to a file in your home directory
		try {
			FileHandler h = new FileHandler("%h/myapp_%g.log", 1000, 4);
			h.setFormatter(new SimpleFormatter());
			fileLogger.addHandler(h);
			fileLogger.log(Level.INFO, "This is an info message");
			fileLogger.log(Level.WARNING, "This is a warning");
			fileLogger.log(Level.SEVERE, "This is an exception", new Exception("some exception message"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
}