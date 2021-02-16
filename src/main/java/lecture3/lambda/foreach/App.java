package lecture3.lambda.foreach;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        list.forEach(System.out::print);
        System.out.println();
        list.forEach((s) -> System.out.print(s));
        System.out.println();
        list.forEach(App::printToUpperCase);
        System.out.println();

        List<String> upperCaseStrings = new ArrayList<>();
        list.forEach((str) -> upperCaseStrings.add(str.toUpperCase()));

        for (String s : list) {
            System.out.print(s);
        }

        System.out.println("========");
        System.out.println(upperCaseStrings);
    }

    private static void printToUpperCase(String s) {
        System.out.print(s.toUpperCase());
    }


}
