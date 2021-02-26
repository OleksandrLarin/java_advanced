package lecture6.constructor;

import lecture6.User;

import java.lang.reflect.Constructor;

public class ConstructorExample {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;

        Constructor<?>[] constructors = userClass.getConstructors();
        System.out.println("Public constructors " + constructors.length);
        System.out.println("Declared constructors " + userClass.getDeclaredConstructors().length);


        User user1 = userClass.getConstructor().newInstance();

        System.out.println(user1);

        User user2 = userClass.getConstructor(String.class).newInstance("User 2");

        System.out.println(user2);
    }
}
