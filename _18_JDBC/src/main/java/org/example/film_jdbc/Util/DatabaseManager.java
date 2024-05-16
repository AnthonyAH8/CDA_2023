package org.example.film_jdbc.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String url = "jdbc:mysql://localhost:3306/demo_jdbc";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
