package com.company.textanalysis.model;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertySingleton {
    private static PropertySingleton instance = null;
    public String mysqlUrl = null;
    public String mysqlUser = null;
    public String mysqlPassword = null;
    Properties properties = new Properties();

    protected PropertySingleton() {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fileInputStream);
            mysqlUrl = properties.getProperty("database.mysqlUrl");
            mysqlUser = properties.getProperty("database.mysqlUser");
            mysqlPassword = properties.getProperty("database.mysqlPassword");
        } catch (Exception e) {
            System.err.println("Error class PropertySingleton ");
            e.printStackTrace();
        }
    }

    public static PropertySingleton getInstance() {
        if (instance == null) {
            instance = new PropertySingleton();
        }
        return instance;
    }
}
