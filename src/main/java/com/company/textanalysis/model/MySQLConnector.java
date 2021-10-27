package com.company.textanalysis.model;

import com.company.textanalysis.ui.MySQLConnecting;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnector implements MySQLConnecting {

    @Override
    public Connection connection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/textdb", "root", "okhotnik12");
        } catch (Throwable e) {
            System.err.println("Error Connecter MySQL");
            return null;
        }
    }
}
