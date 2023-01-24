package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class ConfigProperties {
    private static Properties properties = new Properties();

    static {
        try {
            // Open file
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            // Read from config file
            properties.load(fileInputStream);
            // Close file
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}