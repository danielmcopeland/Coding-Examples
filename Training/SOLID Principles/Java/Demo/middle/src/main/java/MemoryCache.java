import java.util.HashMap;

public class MemoryCache {

    private HashMap<String, String> cache = new HashMap<>();

    public String get(String key) {
        return this.cache.get(key);
    }

    public void set(String key, String value) {
        this.cache.put(key, value);
    }
}
