package com.example.studentapiframework.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfigReader {

    private static final Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
