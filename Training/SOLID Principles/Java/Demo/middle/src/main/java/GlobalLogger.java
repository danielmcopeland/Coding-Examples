import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class GlobalLogger {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void info(String message) {
        logger.log(Level.INFO, message);
    }

    public void debug(String message) {
        logger.log(Level.FINE, message);
    }

}
