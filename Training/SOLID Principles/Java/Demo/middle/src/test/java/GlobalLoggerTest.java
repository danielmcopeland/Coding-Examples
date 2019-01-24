import org.junit.Test;

import static org.junit.Assert.*;


public class GlobalLoggerTest {
    @Test
    public void info() throws Exception {
        // Setup
        GlobalLogger target = new GlobalLogger();

        // Act
        target.info("info message");

        // Assert
    }

    @Test
    public void debug() throws Exception {
        // Setup
        GlobalLogger target = new GlobalLogger();

        // Act
        target.debug("debug message");

        // Assert
    }

}