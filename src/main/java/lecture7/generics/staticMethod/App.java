package lecture7.generics.staticMethod;

public class App {
    public static void main(String[] args) {
        Integer[] ints = {5, 6, 6};
        String[] strings = {"abc", "one"};

        print(ints);
        print(strings);
    }

    public static <T> void print(T[] obj) {
        for (T item : obj) {
            System.out.println(item);
        }
    }

}
