import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> fileLines = readFile(args[0]);
		System.out.println("File contains:\n" +fileLines);


		Properties propertyFileProperties = loadPropertiesFileProperties("myProperties.properties");
		System.out.println("Property file:");
		displayProperties(propertyFileProperties);

		System.out.println();
		System.out.println("XML file:");
		Properties xmlFileProperties = loadXmlFileProperties("myProperties.xml");
		displayProperties(xmlFileProperties);

		System.out.println();
		System.out.println("Resource file:");
		Properties resourceProperties = loadResourceProperties("myResourceProperties.xml");
		displayProperties(resourceProperties);

		System.out.println();
		System.out.println("System Properties:");
		Properties systemProperties = loadSystemProperties();
		displayProperties(systemProperties);

		System.out.println();
		System.out.println("Environment Variables:");
		Properties envVariables = loadEnvironmentVariables();
		displayProperties(envVariables);

	}

	private static ArrayList<String> readFile(String file) {
		ArrayList<String> fileLines = new ArrayList<>();
		try(BufferedReader reading = Files.newBufferedReader(Paths.get(file))) {
			String line = null;
			while ((line = reading.readLine()) != null) {
				fileLines.add(line);
				System.out.println("Reading: " + line);
			}
		}
		catch (Exception e) {
			System.out.println(e.getClass().getName() + " - " + e.getMessage());
		}
		return fileLines;
	}

	//-----------------
	// 1. Load properties from text file
	//-----------------
	private static Properties loadPropertiesFileProperties(String file) {
		// TODO: Load properties from a text file and return
		Properties prop = new Properties();
		try(Reader reading = Files.newBufferedReader(Paths.get(file))) {
			prop.load(reading);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	//-----------------
	// 2. Load properties from XML file
	//-----------------
	private static Properties loadXmlFileProperties(String file) {
		// TODO: Load properties from an XML file and return
		Properties prop = new Properties();
		try(InputStream is = Files.newInputStream(Paths.get(file))) {
			prop.loadFromXML(is);
		} catch (Exception e) {e.printStackTrace();}
		return prop;
	}
	
	//-----------------
	// 3. Load properties from resource file
	//-----------------
	private static Properties loadResourceProperties(String resourceName) {
		// TODO: Load properties from a resource file
		Properties prop = new Properties();
		try(InputStream is = Main.class.getResourceAsStream(resourceName)) {
			prop.loadFromXML(is);
		} catch (Exception e) { e.printStackTrace(); }
		return prop;
	}

	//-----------------
	// 4. Load system properties
	//-----------------
	private static Properties loadSystemProperties()
	{
		Properties properties = System.getProperties();
		return properties;
		// TODO: Load system properties and return
	}
	
	//-----------------
	// 5. Load environment variables
	//-----------------
	private static Properties loadEnvironmentVariables() {
		// TODO: Load all environment variables and return as a Properties object
		Properties prop = new Properties();
		System.getenv().forEach((key, value) -> {
			prop.setProperty(key, value);
		});
	return prop;
	}
	
	private static void displayProperties(Properties props) {
		props.forEach((key,value) -> {
			System.out.printf("Key: %s Value: %s%n", key, value);
		});

	}

}