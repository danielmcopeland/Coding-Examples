import java.util.HashMap;

public class MemoryCache implements IDataCache {

    private HashMap<String, String> cache = new HashMap<>();

    @Override
    public String get(String key) {
        return this.cache.get(key);
    }

    @Override
    public void set(String key, String value) {
        this.cache.put(key, value);
    }
}
