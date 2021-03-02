package lecture7.generics.practic;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>(List.of("one", "two"));
        Box<Integer> intBox = new Box<>(List.of(1,5,6));
    }
}
