import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

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

	//-----------------
	// 1. Load properties from text file
	//-----------------
	private static Properties loadPropertiesFileProperties(String file) {
		// TODO: Load properties from a text file and return
		Properties props = new Properties();
		try(Reader reader = Files.newBufferedReader(Paths.get(file))) {
			props.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}

	//-----------------
	// 2. Load properties from XML file
	//-----------------
	private static Properties loadXmlFileProperties(String file) {
		// TODO: Load properties from an XML file and return
		Properties props = new Properties();
		try(InputStream inputStream = Files.newInputStream(Paths.get(file))) {
			props.loadFromXML(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}
	
	//-----------------
	// 3. Load properties from resource file
	//-----------------
	private static Properties loadResourceProperties(String resourceName) {
		// TODO: Load properties from a resource file
		Properties props = new Properties();
		try(InputStream inputStream = Main.class.getResourceAsStream(resourceName) ) {
			props.loadFromXML(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}

	//-----------------
	// 4. Load system properties
	//-----------------
	private static Properties loadSystemProperties()
	{
		// TODO: Load system properties and return
		return System.getProperties();
	}
	
	//-----------------
	// 5. Load environment variables
	//-----------------
	private static Properties loadEnvironmentVariables() {
		// TODO: Load all environment variables and return as a Properties object
		Properties props = new Properties();
		System.getenv().forEach((key, value) -> {
			props.setProperty(key, value);
		}); 
		return props;
	}
	
	private static void displayProperties(Properties props) {
		props.forEach((key,value) -> {
			System.out.printf("Key: %s Value: %s%n", key, value);
		});
	}

}