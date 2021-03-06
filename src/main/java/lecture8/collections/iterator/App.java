package lecture8.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = Set.of("a", "b", "c");

        System.out.println("for");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("iterator");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("iterator for each remaining");
        set.iterator().forEachRemaining(System.out::println);

        System.out.println("stream");
        set.stream().forEach(System.out::println);


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        list.stream().collect(TreeSet::new, App::isAdd, App::combine);

    }

    private static TreeSet<String> isAdd(TreeSet<String> a, String b) {
        a.add(b.toUpperCase());
        return a;
    }

    private static TreeSet<String> combine(TreeSet<String> a, TreeSet<String> b) {
        a.addAll(b);
        return a;
    }
}
