import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileStore {

    private final Path rootPath;

    public FileStore(Path path) throws FileNotFoundException {
        if(path == null) {
            throw new NullPointerException("path");
        }
        if(!Files.exists(path)) {
            throw new FileNotFoundException(path.toString());
        }

        this.rootPath = path;
    }

    public void save(String id, String message) {
        Path filePath = Paths.get(this.rootPath.toString(), id + ".txt");
        byte data[] = message.getBytes();
        try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(filePath))) {
            out.write(data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read(String id) {
        String retValue = null;
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

        return retValue;
    }

}
