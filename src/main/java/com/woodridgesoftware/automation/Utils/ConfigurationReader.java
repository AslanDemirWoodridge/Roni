package com.woodridgesoftware.automation.Utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static final Properties properties = new Properties();
    static {
        try (InputStream in = ConfigurationReader.class.getClassLoader().getResourceAsStream("configuration.properties")) {
            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load properties file");
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
