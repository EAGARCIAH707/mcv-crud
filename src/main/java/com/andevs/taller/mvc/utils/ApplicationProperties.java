package com.andevs.taller.mvc.utils;

import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
    private final Properties properties;
    private static ApplicationProperties instance;

    private ApplicationProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static ApplicationProperties getInstance() {
        if (instance == null) {
            instance = new ApplicationProperties();
            return instance;
        }
        return instance;
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
