package lecture8.collections.hash;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        Integer tw = 12;
        System.out.println("HashCode: " + tw.hashCode());
        System.out.println("Index: " + (tw & 10));
        map.put(tw, "tw");
    }
}
