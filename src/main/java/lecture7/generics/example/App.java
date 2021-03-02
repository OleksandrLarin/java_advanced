package lecture7.generics.example;

public class App {
    public static void main(String[] args) {
        GenericType genericType = new GenericType("Object");

        Object item = genericType.getItem();

        GenericType<String> stringGenericType = new GenericType<>("String");

        String stringItem = stringGenericType.getItem();

        GenericType<Integer> integerGenericType = new GenericType<>(5);

        Integer integer = integerGenericType.getItem();
    }
}
