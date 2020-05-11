package com.andevs.taller.mvc.model.connection;

import com.andevs.taller.mvc.utils.ApplicationProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static String url = ApplicationProperties.getInstance().getProperty("db.url");
    private static String user = ApplicationProperties.getInstance().getProperty("db.user");
    private static String password = ApplicationProperties.getInstance().getProperty("db.password");
    private static Connection connection;

    private static void connection() {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Failed conncetion: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            connection();
        }
        return connection;
    }
}
