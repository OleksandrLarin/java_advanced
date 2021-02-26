package lecture6.field;

import lecture6.User;

import java.lang.reflect.Field;

public class FieldExample {
    public static void main(String[] args) throws Exception {
        Field fieldName = User.class.getField("name");

        String nameValue = (String) fieldName.get(new User("Jack"));

        System.out.println(nameValue);

        Field idField = User.class.getDeclaredField("id");
        idField.setAccessible(true);
        int idValue = (int) idField.get(new User("Jack"));
        idField.setAccessible(false);
        System.out.println(idValue);


        User user = new User("Bill");
        System.out.println("Before: " + user);
        fieldName.set(user, "Jack");
        System.out.println("After: " + user);


    }
}
