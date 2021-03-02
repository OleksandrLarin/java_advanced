package lecture7.generics.nonStaticMethod;

public class App<U> {

    private U element;

    public <T> void print(T item) {
        System.out.println(item.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        new App<String>().print(111.0);
    }
}
