package com.company.textanalysis.model;

import com.company.textanalysis.ui.MySQLReading;

import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLReader implements MySQLReading {
    MySQLConnector connector = new MySQLConnector();

    @Override
    public String getTextDB() {
        String textDB = null;
        String sql = "SELECT * FROM textanalyse";
        try {
            Statement statement = connector.connection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                textDB = resultSet.getString(2);
            }
            return textDB;
        } catch (Exception e) {
            System.out.println(e);
            System.err.println("Error get DB");
            return null;
        }
    }
}
