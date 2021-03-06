package lecture8.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("A");
        stringQueue.add("B");
        stringQueue.add("C");
        stringQueue.add("D");

        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
