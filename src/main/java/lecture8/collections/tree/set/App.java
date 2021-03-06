package lecture8.collections.tree.set;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("AAAAA");
        stringTreeSet.add("WWW");
        stringTreeSet.add("FFFF");
        stringTreeSet.add("Gf");
        stringTreeSet.add("BA");

        TreeSet<String> collect = stringTreeSet.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(() -> new TreeSet<>(Comparator.comparing(String::length)), TreeSet::add, TreeSet::addAll);

        collect.forEach(System.out::println);
//        System.out.println(stringTreeSet.size());

    }
}
