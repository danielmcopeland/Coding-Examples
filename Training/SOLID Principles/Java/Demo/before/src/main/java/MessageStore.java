import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MessageStore {

    // Question: how many concerns does this class have?
    // Can we refactor it using SOLID principles to make it better?

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    private HashMap<String, String> cache = new HashMap<>();
    private final Path rootPath;

    public MessageStore(Path path) throws FileNotFoundException {
        if(path == null) {
            throw new NullPointerException("path");
        }
        if(!Files.exists(path)) {
            throw new FileNotFoundException(path.toString());
        }

        this.rootPath = path;
    }

    public void save(String id, String message) {
        logger.log(Level.INFO, "Saving message " + id);
        this.cache.put(id, message);
        Path filePath = Paths.get(this.rootPath.toString(), id + ".txt");
        byte data[] = message.getBytes();
        try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(filePath))) {
            out.write(data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO, "Saved message " + id);
    }

    public String read(String id) {
        logger.log(Level.FINE, "Reading message " + id);
        String retValue = null;
        retValue = cache.get(id);
        if(retValue == null) {
            Path filePath = Paths.get(this.rootPath.toString(), id + ".txt");

            try {
                List<String> lines = Files.readAllLines(filePath);
                StringBuilder sb = new StringBuilder();
                for(String line : lines) {
                    sb.append(line);
                }
                retValue = sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        logger.log(Level.FINE, "Returning message " + id);
        return retValue;
    }
}
