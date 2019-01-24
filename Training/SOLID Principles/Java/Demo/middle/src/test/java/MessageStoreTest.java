import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MessageStoreTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();


    @Test(expected = NullPointerException.class)
    public void constructorThrowsExceptionWithNullPath() throws Exception {
        // Setup
        MessageStore target = new MessageStore(null);

        // Act

        // Assert
    }

    @Test(expected = FileNotFoundException.class)
    public void constructorThrowsFileNotFoundException() throws Exception {
        // Setup
        Path invalidPath = Paths.get("no such path");
        MessageStore target = new MessageStore(invalidPath);

        // Act

        // Assert
    }

}