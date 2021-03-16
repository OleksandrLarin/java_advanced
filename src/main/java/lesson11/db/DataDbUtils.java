package lesson11.db;

public class DataDbUtils extends DbUtils {
    public static void insertUsers() {
        String query = "INSERT INTO students VALUES " +
                "(1, 'Radcliffe', 'Daniel', '1995-04-23'), " +
                "(2, 'Watson', 'Emma', '1994-07-15'), " +
                "(3, 'Grint', 'Rupert', '1995-10-24');";
        executeQuery(query);
    }

    public static void insertModules() {
        String query = "INSERT INTO modules VALUES " +
                "(1, 'Math', 1, 30), " +
                "(2, 'Physics',1, 25), " +
                "(3, 'Chemistry', 1, 40);";
        executeQuery(query);
    }

    public static void insertRegistrations() {
        String query = "INSERT INTO registration VALUES " +
                "(1, 1, 5), " +
                "(1, 2, 5), " +
                "(1, 3, 5), " +
                "(2, 1, 4), " +
                "(2, 3, 5), " +
                "(3, 2, 5), " +
                "(3, 1, 3);";
        executeQuery(query);
    }
}
