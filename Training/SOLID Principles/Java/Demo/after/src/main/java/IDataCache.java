/**
 * Created by MRH0908 on 1/10/2017.
 */
public interface IDataCache {
    String get(String key);

    void set(String key, String value);
}