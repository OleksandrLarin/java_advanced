package lecture6.annotation;

import lecture6.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

public class Handler<T> {

    public static final String REGEX = "^\\$\\{.*\\}$";
    public static final String FILE_NAME = "src//main//resources/local.properties";

    private static void initProperties() {
        Properties properties = new Properties();
        try (FileInputStream propsFile = new FileInputStream(FILE_NAME)){
            properties.load(propsFile);
            System.setProperties(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        initProperties();
        Handler<User> userHandler = new Handler<>();
        User user = new User();

        userHandler.handle(user);

        System.out.println(user);
    }

    public void handle(T obj) {
        Class<?> clazz = obj.getClass();

        List<Value> annotation = new ArrayList<>();

        final List<Field> declaredFields = Arrays.asList(clazz.getDeclaredFields());
        declaredFields.stream()
                .filter(this::hasValueAnnotation)
                .forEach(field -> initializeValue(field, obj));
    }

    private boolean hasValueAnnotation(Field field) {
        return Objects.nonNull(field.getAnnotation(Value.class));
    }

    private void initializeValue(Field field, T obj) {
        String value = field.getAnnotation(Value.class).value();

        field.setAccessible(true);
        try {
            field.set(obj, convertValue(value));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private String convertValue(String value) {
        if (value.matches(REGEX)) {
            return System.getProperty(value.substring(2, value.length() - 1));
        }
        return value;
    }
}
