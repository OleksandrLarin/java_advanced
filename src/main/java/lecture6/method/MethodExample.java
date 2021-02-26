package lecture6.method;

import lecture6.User;

import java.lang.reflect.Method;

public class MethodExample {
    public static void main(String[] args) throws Exception {
        Method setName = User.class.getMethod("setName", String.class);
        User user = new User();

        setName.invoke(user, "JAck");

        System.out.println(user);

    }
}
