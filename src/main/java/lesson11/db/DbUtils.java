package lesson11.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtils {
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER = "admin";
    public static final String PASSWORD = "pass";

    protected static void executeQuery(String query) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
