package lecture8.collections.stack;

import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        stack();

        linkedListStack();
    }

    private static void linkedListStack() {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(3);
        integers.addFirst(2);
        integers.addFirst(1);
        integers.addFirst(0);

        while (!integers.isEmpty()) {
            System.out.println(integers.pop());
        }
    }

    private static void stack() {
        Stack<String> strings = new Stack<>();
        strings.push("a");
        strings.push("b");
        strings.push("c");

        System.out.println(strings.peek());
        System.out.println(strings.peek());
        while (!strings.empty()) {
            System.out.println(strings.pop());
        }
    }
}
