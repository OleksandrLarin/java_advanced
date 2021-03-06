package lecture8.collections.tree.map;

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String, String> integerTreeMap = new TreeMap<>();
        integerTreeMap.put("aaa", "one");
        integerTreeMap.put("bbb", "five");
        integerTreeMap.put("ccc", "three");
        integerTreeMap.put("ddd", "two");


        System.out.println(integerTreeMap.lastEntry().getValue());

        integerTreeMap.entrySet().forEach(System.out::println);
        integerTreeMap.descendingMap().entrySet().forEach(System.out::println);
    }
}
