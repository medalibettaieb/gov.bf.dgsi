
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesFileUtils {
	public static String processValue(String key) {
		String result = incrementValue(findValue(key));
		writeValue(key, result);
		return result;
	}

	public static String findValue(String value) {
		String valueToReturn = null;
		try (InputStream input = new FileInputStream("src/test/resources/config.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			valueToReturn = prop.getProperty(value);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return valueToReturn;
	}

	public static void writeValue(String key, String value) {
		FileOutputStream fileOut = null;
		FileInputStream fileIn = null;
		try {
			Properties configProperty = new Properties();

			File file = new File("src/test/resources/config.properties");
			fileIn = new FileInputStream(file);
			configProperty.load(fileIn);
			configProperty.setProperty(key, value);
			fileOut = new FileOutputStream(file);
			configProperty.store(fileOut, "N@folo TNR properties");

		} catch (Exception ex) {
			Logger.getLogger(PropertiesFileUtils.class.getName()).log(Level.SEVERE, null, ex);
		} finally {

			try {
				fileOut.close();
			} catch (IOException ex) {
				Logger.getLogger(PropertiesFileUtils.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public static String incrementValue(String value) {
		String[] parts = value.split("-");
		String result = parts[0] + "-" + String.valueOf(Integer.parseInt(parts[1]) + 1);
		return result;

	}
}
