package lecture8.collections;

import lecture6.User;

public class App {
    public static void main(String[] args) {
        showInfo(Integer.valueOf(55));
        showInfo("dfvdfvdfv");
        showInfo(new Object());
        showInfo(new User());
    }

    private static <T> void showInfo(T obj) {
        System.out.println(obj.getClass().getSimpleName());
        System.out.println(obj.toString());
    }

    private static <T extends User> void showInfo(T user) {
        System.out.println(user.getName());
        System.out.println(user.getLastName());
    }

}
