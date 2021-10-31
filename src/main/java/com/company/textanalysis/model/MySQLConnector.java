package com.company.textanalysis.model;

import com.company.textanalysis.ui.MySQLConnecting;

//import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.util.Properties;

public class MySQLConnector implements MySQLConnecting {

    @Override
    public Connection connection() {
        //Спосіб з використанням патерна Одинака
        try {
            PropertySingleton propertySingleton = PropertySingleton.getInstance();
            return DriverManager.getConnection(propertySingleton.mysqlUrl, propertySingleton.mysqlUser, propertySingleton.mysqlPassword);
        } catch (Throwable e) {
            System.err.println("Error Connected MySQL");
            return null;
        }
        //Простий спосіб
//        Properties properties = new Properties();
//        try {
//            FileInputStream fileInputStream = new FileInputStream("src/main/resources/configuration.properties");
//            properties.load(fileInputStream);
//            return DriverManager.getConnection(properties.getProperty("database.mysqlUrl"), properties.getProperty("database.mysqlUser"), properties.getProperty("database.mysqlPassword"));
//        } catch (Exception e){
//            System.err.println("Error Connected MySQL");
//            return null;
//        }
    }
}

