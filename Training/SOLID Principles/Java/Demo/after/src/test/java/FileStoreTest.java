import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class FileStoreTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();


    @Test(expected = NullPointerException.class)
    public void constructorThrowsExceptionWithNullPath() throws Exception {
        // Setup
        FileStore target = new FileStore(null);

        // Act

        // Assert
    }

    @Test(expected = FileNotFoundException.class)
    public void constructorThrowsFileNotFoundException() throws Exception {
        // Setup
        Path invalidPath = Paths.get("no such path");
        FileStore target = new FileStore(invalidPath);

        // Act

        // Assert
    }

    @Test
    public void save() throws Exception {
        // Setup
        File folder = temporaryFolder.newFolder("saveFolder");
        FileStore target = new FileStore(folder.toPath());

        // Act
        target.save("saveTest", "My test message");

        // Assert
        boolean fileExists = Files.exists(Paths.get(folder.toString(), "saveTest.txt"));
        Assert.assertTrue(fileExists);
    }

    @Test
    public void read() throws Exception {

        // Setup
        File folder = temporaryFolder.newFolder("readFolder");
        FileStore target = new FileStore(folder.toPath());
        target.save("readTest", "My test message");

        // Act
        String result = target.read("readTest");

        // Assert
        Assert.assertEquals("My test message", result);
    }

}