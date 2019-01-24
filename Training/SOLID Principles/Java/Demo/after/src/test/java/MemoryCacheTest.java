import org.junit.Assert;
import org.junit.Test;

public class MemoryCacheTest {

    @Test
    public void setUpdatesCachedValue() throws Exception {
        // Setup
        MemoryCache target = new MemoryCache();

        // Act
        target.set("key1", "value1");
        target.set("key2", "value2");
        target.set("key1", "value3");
        String result1 = target.get("key1");
        String result2 = target.get("key2");

        // Assert
        Assert.assertEquals("value3", result1);
        Assert.assertEquals("value2", result2);
    }
}