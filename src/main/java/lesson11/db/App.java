package lesson11.db;

public class App {

    public static void main(String[] args) {
        initDb(false);
        insertData(false);
    }

    private static void insertData(boolean flag) {
        if (flag) {
            DataDbUtils.insertUsers();
            DataDbUtils.insertModules();
            DataDbUtils.insertRegistrations();
        }
    }

    private static void initDb(boolean initDb) {
        if (initDb) {
            TableUtils.createStudentsTable();
            TableUtils.createModuleTable();
            TableUtils.createRegistrationTable();
        }
    }
}
