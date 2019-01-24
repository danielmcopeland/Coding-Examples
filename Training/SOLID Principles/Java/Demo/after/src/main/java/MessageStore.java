import java.io.FileNotFoundException;
import java.nio.file.Path;

public class MessageStore {

    private ILogger logger;
    private IDataCache cache;
    private IStoreReader storeReader;
    private IStoreWriter storeWriter;

    public MessageStore(ILogger logger, IDataCache cache, IStoreReader reader, IStoreWriter writer) {
        this.logger = logger;
        this.cache = cache;
        this.storeReader = reader;
        this.storeWriter = writer;
    }

    public void save(String id, String message) {
        logger.info("Saving message " + id);
        this.cache.set(id, message);
        this.storeWriter.save(id, message);
        logger.info("Saved message " + id);
    }

    public String read(String id) {
        logger.debug("Reading message " + id);
        String retValue = null;
        retValue = cache.get(id);
        if(retValue == null) {
            retValue = storeReader.read(id);
        }

        logger.debug("Returning message " + id);
        return retValue;
    }
}
