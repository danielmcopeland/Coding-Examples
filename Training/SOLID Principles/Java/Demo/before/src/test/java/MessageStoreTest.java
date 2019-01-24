import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

import static org.junit.Assert.*;

public class MessageStoreTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();


    @Test
    public void saveAndReadMessages() throws Exception {
        // Setup
        File tempFolder = temporaryFolder.newFolder("saveAndReadMessages");
        MessageStore target = new MessageStore(tempFolder.toPath());

        // Act
        target.save("message1", "some message 1");
        target.save("message2", "some message 2");
        target.save("message3", "some message 3");
        target.save("message4", "some message 4");
        target.save("message1", "overriding message 1");

        String result1 = target.read("message1");
        String result2 = target.read("message2");
        String result3 = target.read("message3");
        String result4 = target.read("message4");

        // Assert
        Assert.assertEquals("overriding message 1", result1);
        Assert.assertEquals("some message 2", result2);
        Assert.assertEquals("some message 3", result3);
        Assert.assertEquals("some message 4", result4);
    }

}