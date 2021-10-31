package com.company.textanalysis.model;

import com.company.textanalysis.ui.MySQLConnecting;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnector implements MySQLConnecting {

    @Override
    public Connection connection() {
        try {
            PropertySingleton propertySingleton = PropertySingleton.getInstance();
            return DriverManager.getConnection(propertySingleton.mysqlUrl, propertySingleton.mysqlUser, propertySingleton.mysqlPassword);
        } catch (Throwable e) {
            System.err.println("Error Connected MySQL");
            return null;
        }
    }
}
