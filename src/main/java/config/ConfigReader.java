package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties loadProperties() throws IOException {
		Properties properties = new Properties();
		try(FileInputStream inputStream = new FileInputStream("src/test/resources/config.properties")) {
			properties.load(inputStream);
		}
		
		return properties;

	}
	
}
