package commapsnq.assignment.test.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CustomProperties {

	private static String value;

	private static String ReadFile(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"src\\test\\resources\\TestConfiguration.properties");
		// System.getProperty("user.dir")).getAbsolutePath()
		prop.load(fis);
		return prop.getProperty(key);

	}

	public static String getConfigProperty(String key) {

		try {
			value = ReadFile(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

}
