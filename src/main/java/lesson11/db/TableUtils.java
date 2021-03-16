package lesson11.db;

public class TableUtils extends DbUtils {

    public static void createStudentsTable() {
        String query = "CREATE TABLE students (" +
                "student_id SERIAL, " +
                "last_name varchar(100), " +
                "first_name varchar(100), " +
                "date_of_birth Date, " +
                "PRIMARY KEY (student_id)" +
                ");";
        executeQuery(query);
    }

    public static void createModuleTable() {
        String query = "CREATE TABLE modules (" +
                "module_id SERIAL, " +
                "module_title varchar(100), " +
                "level int, " +
                "credits int, " +
                "PRIMARY KEY (module_id)" +
                ");";
        executeQuery(query);
    }

    public static void createRegistrationTable() {
        String query = "CREATE TABLE registration (" +
                "student_id int, " +
                "module_id int, " +
                "result int, " +
                "PRIMARY KEY (student_id, module_id), " +
                "FOREIGN KEY (student_id) REFERENCES students(student_id), " +
                "FOREIGN KEY (module_id) REFERENCES modules(module_id)" +
                ");";
        executeQuery(query);
    }
}
