import java.io.FileNotFoundException;
import java.nio.file.Path;

public class MessageStore {

    private GlobalLogger logger = new GlobalLogger();
    private MemoryCache cache = new MemoryCache();
    private FileStore fileStore;

    public MessageStore(Path path) throws FileNotFoundException {
        fileStore = new FileStore(path);
    }

    public void save(String id, String message) {
        logger.info("Saving message " + id);
        this.cache.set(id, message);
        this.fileStore.save(id, message);
        logger.info("Saved message " + id);
    }

    public String read(String id) {
        logger.debug("Reading message " + id);
        String retValue = null;
        retValue = cache.get(id);
        if(retValue == null) {
            retValue = fileStore.read(id);
        }

        logger.debug("Returning message " + id);
        return retValue;
    }
}
